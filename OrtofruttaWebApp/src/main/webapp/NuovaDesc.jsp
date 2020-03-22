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
<form action="Desc">

 <label for="Name">Inserisci nome del prodotto aquistato:</label>
  <input type="text" id="Name" name="Name"><br><br>
  <label for="Info">Inserisci Nuove Informazioni:</label>
  <input type="text" id="Info" name="Info">

<br><br>
<input type="submit" value="Continua">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>
</body>
</html>