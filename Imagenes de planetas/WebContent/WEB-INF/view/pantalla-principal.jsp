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
<br><br>
	<form:form action="/imagenesPlanetas/planeta" 
				modelAttribute="planeta">
	<form:input path="nombre"/>
	<input type="submit" value="Submit" />
	<form:errors path="nombre" cssClass="error"/>
	</form:form> 

</body>
</html>