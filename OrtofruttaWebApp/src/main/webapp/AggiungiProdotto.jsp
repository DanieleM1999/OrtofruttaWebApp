<%@page import="it.dstech.gestionedb.AccessoDB"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Crea il Prodotto</h1>

<form action="aggiungiProdotto">
  
  <label for="Name">Inserisci nome:</label>
  <input type="text" id="Name" name="Name"><br><br>
  <label for="inventories">Inserisci Quantita Prodotto:</label>
  <input type="number" id="inventories" name="inventories" min="1"><br><br>
  <label for="price">Inserisci Prezzo Prodotto:</label>
  <input type="number" id="price" name="price" step="0.01" min="0.1"><br><br>
  <label for="info">Inserisci Descrizione:</label>
  <input type="text" id="info" name="info"><br><br>
 
<input type="submit" value="Continua">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>

</body>
</html>