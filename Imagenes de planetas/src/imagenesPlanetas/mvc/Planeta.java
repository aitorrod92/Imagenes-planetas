package imagenesPlanetas.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Planeta {

	@NotNull()
	@Pattern(regexp="\\D{5,10}")
	private String nombre;
	
	public Planeta() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
