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
	<h1>Benvenuto nel nostro bel negozio</h1>
	<h3>Questo è il negozietto di due personcine Daniele il boss e
		Giulio il reietto.</h3>
	<h4>Per proseguire, selezionare una delle seguenti Opzioni!</h4><br>
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
		</select> <input type="submit" value="Conferma"> ##############

	</form>
	<%
		}
	%>
</body>
</html>