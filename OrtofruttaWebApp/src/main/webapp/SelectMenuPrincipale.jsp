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
  h2{
 color: white;
 text-align: center;
 text-decoration: overline;

 }
  h3{
 color: white;
 text-align: center;
 }
 form{
 color: white;
 text-align: center;
 }
 
</style>

<body>



	<%
		String messaggio = (String) request.getAttribute("messaggio");
		if (messaggio != null) {
	%>
	<h1>ERRORE</h1>
	<%=messaggio%>
	<form action="SelectMenuPrincipale.jsp">
		<br>
		<br> <input type="submit" value="Back">
	</form>
	<%
		} else {
	%>
	
	 <br> <br> <br> <br> <br> <br> <br> <br> <br>
	<h1>Benvenuto nel nostro bel negozio</h1>
	 <br>
	<h2>Questo è il negozietto di due personcine :Giulio and Daniele</h2>
	 <br>
	<h3>Per proseguire, selezionare una delle seguenti Opzioni!</h3>
	 <br>
	<form action="store-menu">
		<label for="SceltaOperazioni">#############</label> <select
			name="SceltaOperazioni">
			<option value="Aggiungi Prodotto">Aggiungi Prodotto</option>
			<option value="Stampa ListaProdotti">Stampa Lista di prodotti</option>
			<option value="Registra Aquisto">Vendi Prodotto</option>
			<option value="Registra Arrivo">Rifornisci magazzino</option>
			<option value="Cambia Prezzo">Cambia Prezzo</option>
			<option value="Cambia Descrizione">Cambia Descrizione</option>
			 <br>
		</select> <input type="submit" value="Conferma"> ##############

	</form>
	<%
		}
	%>
</body>
</html>