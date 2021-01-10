package imagenesPlanetas.mvc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class Controlador {
	
	private String [] planetas = {"Mercurio", "Marte", "Tierra" , "Venus", "Júpiter", "Saturno",  "Urano", "Neptuno", "Plutón"};
	private HashSet <String >setPlanetas = new HashSet<String>(Arrays.asList(planetas));
		
		@RequestMapping("/pantalla-principal")
		public String showPage(Model model) {
		    model.addAttribute("planeta",new Planeta());
			return "pantalla-principal";		
		}
			
		@RequestMapping("/planeta")
		public String planeta(@Valid @ModelAttribute("planeta")
			Planeta elPlaneta, BindingResult resultadoValidación){
			if (resultadoValidación.hasErrors()) {
				System.out.println(resultadoValidación);
				return "pantalla-principal";
			} else {
				String nombrePlaneta = obtenerNombreAdaptado(elPlaneta);
				elPlaneta.setNombre(nombrePlaneta);
				if (setPlanetas.contains(nombrePlaneta)) {
					return "pagina-planeta";
				} else {
					return "planeta-no-existe";
				}

			}
		}

		private String obtenerNombreAdaptado(Planeta elPlaneta) {
			String nombrePlaneta = elPlaneta.getNombre();
			System.out.println(nombrePlaneta);
			nombrePlaneta = nombrePlaneta.toLowerCase().trim();
			nombrePlaneta = nombrePlaneta.replaceFirst(nombrePlaneta.substring(0,1), 
					nombrePlaneta.substring(0,1).toUpperCase());
			System.out.println(nombrePlaneta);
			return nombrePlaneta;
		}
	
		/**
		 * Recorta los strings para que no haya espacios en blanco y 
		 * los convierte en null si quedan en "".
		 * @param wdb
		 */
		@InitBinder
		public void initBinder(WebDataBinder wdb) {
			StringTrimmerEditor recortador = new StringTrimmerEditor(true);
			wdb.registerCustomEditor(String.class, recortador);
			
		}
}
