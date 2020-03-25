<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>"Login"</title>
<style>

</style>
</head>
<body>
<br> <br><br> <br><br> <br><br> <br><br> <br>
	<h3 style="background-color:black; color:white;padding:20px;text-align:center;">	Benvenuto Inserisci le tue finte credenziali :</h3>
	<form style="text-align: center;" action="login" method="post">
		<label for="Username">Inserisci l'username dell'utente:</label> <input
			type="text" id="Username" name="Username"><br> <br>
		<input type="submit" value="Continua...">
	</form>
	<br>
	<form style="text-align: center;background-color: black;padding: 5px;color: white;" action="Registrati.jsp" >
	<p>Se non sei registrato clicca qui:</p><input type="submit" value="Registrati">
	</form>
</body>
</html>