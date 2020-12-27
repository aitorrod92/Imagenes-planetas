<!DOCTYPE html>
<html>

<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/resources/css/estilo.css">

<body>
<h2> El nombre del planeta elegido es ${planeta.nombre}</h2>
<br><br>
<img src="${pageContext.request.contextPath}/resources
		/imagenes/${planeta.nombre}.jpeg" width="50%" height="50%"> 
<br><br>
<a href="pantalla-principal">Volver atrás</a>
</body>

</html>