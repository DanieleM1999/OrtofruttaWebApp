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
 background-size: 100% 100%;
  }
 h1{

 color: white;
 text-align: center;
 }
  h2{
 color: white;
 text-align: center;
 }
  h3{
 color: white;
 text-align: center;
 }
 p{
 color: white;
 font-size: 20px;
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
	<p>ERRORE</p>
	<p><%=messaggio%></p>
	<form action="SelectMenuPrincipale.jsp">
		<input type="submit" value="Back">
	</form>
	<%
		} else {
	%>
	<br> <br><br><br><br><br><br><br><br><br><br>
	<h1 style="text-decoration: overline;">Benvenuto nel nostro bel negozio</h1>
	<p>-----------------------------</p>
	<h2 style="text-decoration: underline;">Questo è il negozietto di due personcine : Giulio e Daniele</h2>
	 <br>
	<h3>Per proseguire, selezionare una delle seguenti opzioni!</h3>
	<form action="store-menu">
		<label for="SceltaOperazioni"></label> <select
			name="SceltaOperazioni">
			<option value="Aggiungi Prodotto">Aggiungi prodotto</option>
			<option value="Stampa ListaProdotti">Stampa lista di prodotti</option>
			<option value="Registra Aquisto">Vendi prodotto</option>
			<option value="Registra Arrivo">Rifornisci magazzino</option>
			<option value="Cambia Prezzo">Cambia prezzo</option>
			<option value="Cambia Descrizione">Cambia descrizione</option>
		</select> <input type="submit" value="Conferma">
	</form>
	
	<h3>Aggiornamento 2.0 nuove operazioni solo per voi &#128521 &#10084;&#65039 !!</h3>
		<form action="switch">
		<label for="switch"></label> <select
			name="switch">
			<option value="AggiungiAlCarrello">Aggiungi al carrello</option>
			<option value="Paga">Paga</option>
			<option value="StampaCarrello">Stampa carrello</option>
			<option value="StampaListaClienti">Stampa lista clienti</option>
			<option value="Fai2+2">Quanto fa 2+2 ?</option>
		</select> <input type="submit" value="Conferma">
	</form>
	<% } %>
</body>
</html>