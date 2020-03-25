<%@page import="it.dstech.gestionedb.AccessoDB"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-image:url("https://i.ibb.co/NTb2zpG/Whats-App-Image-2020-03-23-at-19-39-03.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
 background-size: cover;
  }
 h1{
 color: white;
 text-align: center;
 }
 form{
 color: white;
 text-align: center;
 }
input{

}
 </style>
</head>
<body>
<br><br><br><br><br><br><br>
<h1>Crea il prodotto</h1>

<form action="aggiungiProdotto" method="post">
  
  <label for="Name">Inserisci nome:</label>
  <input type="text" id="Name" name="Name"><br><br>
  <label for="inventories">Inserisci quantita prodotto:</label>
  <input type="number" id="inventories" name="inventories" min="1"><br><br>
  <label for="price">Inserisci prezzo prodotto:</label>
  <input type="number" id="price" name="price" step="0.01" min="0.1"><br><br>
  <label for="info">Inserisci descrizione:</label>
  <input type="text" id="info" name="info"><br><br>
 
<input type="submit" value="Continua">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>

</body>
</html>