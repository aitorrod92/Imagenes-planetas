<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/resources/css/estilo.css">

<head>
	<title>Mostrador de imágenes de planetas</title>
</head>

<body>
<h2>Mostrador de imágenes de planetas</h2>
<h2>____________________________________________________</h2>
<br>
	<form:form action="/Imagenes%20de%20planetas/app/planeta" 
				modelAttribute="planeta">
	<form:radiobutton path="tamanio" value="100"/>Pequeño
	<form:radiobutton path="tamanio" value="300"/>Mediano
	<form:radiobutton path="tamanio" value="900"/>Grande
	<br>
	<br>
	<form:input path="nombre"/>
	<input type="submit" value="Submit" />
	<form:errors path="nombre" cssClass="error"/>
	</form:form> 
</body>
</html>