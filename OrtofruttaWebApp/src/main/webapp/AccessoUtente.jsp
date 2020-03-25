<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Inserisci i dati Richiesti</h3>
	<form action="accedi" method="post">
		<label for="Username">Inserisci l'username dell'utente:</label> <input
			type="text" id="Username" name="Username"><br> <br>
		<br> <br> <input type="submit" value="Continua">
	</form>

	<form action="SelectMenuPrincipale.jsp">
		<br> <input type="submit" value="Back">
	</form>

</body>
</html>