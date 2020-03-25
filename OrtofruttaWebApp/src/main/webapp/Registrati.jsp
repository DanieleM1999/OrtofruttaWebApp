<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
<style>
la
</style>
</head>
<body>
<h3 style="text-align: center;background-color: black;color: white;padding: 10px;margin-top: 100px; ">Inserisci i tuoi dati:</h3>
 
  <form action="Registrazione" style="text-align: center;background-color: black;color: white;padding: 10px;">
  <label for="Username">Inserisci Username:</label>
  <input type="text" id="Username" name="Username"><br><br>
    <label for="Name">Inserisci il tuo nome:</label>
  <input type="text" id="Name" name="Name"><br><br>
    <label for="Cognome">Inserisci il tuo cognome:</label>
  <input type="text" id="Cognome" name="Cognome"><br><br>
    <label for="Eta">Inserisci eta:</label>
  <input type="number" id="giorno" name="giorno"min="1" max="31">
  <input type="number" id="mese" name="mese"min="1" max="12">
  <input type="number" id="anno" name="anno"min="1920" max="2002">
  	
  	<label for="sceltaTipo"></label> 
  	<select name="sceltaTipo">
			<option value="Cliente">Cliente</option>
			<option value="Operaio">Operaio</option>
  </select><br><br> 
  
  <input type="submit" value="Conferma" style="padding: 10px;">
  </form>
  <form style="text-align: center;" action="AccessoUtente.jsp" >
<br> <input type="submit" value="Back" style="text-align: center;padding: 10px;" >
</form>
</body>
</html>