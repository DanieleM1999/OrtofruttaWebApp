<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@page import="it.dstech.gestionedb.AccessoDB"%>
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
 
</style>

</head>
<body>
<br><br><br><br><br><br><br><br>
<h1>Inserisci i dati richiesti</h1>
<form action="Carrello">
<%AccessoDB accessoDB = new AccessoDB(); %>
<%List<Prodotto> lista = accessoDB.listaProdotti(); %>
 
  <label for="User">Inserisci il tuo Username:</label>
  <input type="text" id="User" name="User"><br><br>

 <label for="Name">Scegli prodotto:</label>
	<select name = "Name">
	
	<% for (Prodotto p : lista){%>
	  <option value="<%=p.getName()%>"><%=p.getName().toUpperCase()%></option>
	  
	  <% } %>
	</select>
		<br><br>
  <label for="inv">Inserisci quantita prodotto da aquistare:</label>
  <input type="number" id="inv" name="inv" min="1">

<br><br>
<input type="submit" value="Aggiungi al carrello==>">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>
</body>
</html>