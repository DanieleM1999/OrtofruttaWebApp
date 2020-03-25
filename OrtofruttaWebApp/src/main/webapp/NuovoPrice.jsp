<%@page import="it.dstech.gestionedb.AccessoDB"%>
<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
 
</style>
<body>
<br><br><br><br><br><br><br><br>
<h1>Inserisci i dati richiesti</h1>
<form action="prezzo" method="post"> 
<%AccessoDB accessoDB = new AccessoDB(); %>
<%List<Prodotto> lista = accessoDB.listaProdotti(); %>

 <label for="Prodotto">Scegli prodotto:</label>
	<select name = "Prodotto">
	
	<% for (Prodotto p : lista){%>
	  <option value="<%=p.getName()%>"><%=p.getName().toUpperCase()%></option>
	  
	  <% } %>
	</select>
		<br><br>
  <label for="Price">Inserisci il nuovo prezzo:</label>
  <input type="number" id="Price" name="Price" step="0.01" min="0.01">

<br><br>
<input type="submit" value="Continua">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>
</body>
</html>