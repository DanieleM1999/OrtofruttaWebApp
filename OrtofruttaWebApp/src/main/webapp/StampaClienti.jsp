<%@page import="it.dstech.ortofrutta.Utente"%>
<%@page import="it.dstech.accesso.GestisciUtenti"%>
<%@page import="it.dstech.gestionedb.AccessoDB"%>
<%@page import="it.dstech.ortofrutta.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
background-color: G;
color: white;
	border: 1.2px solid grey;
}
body {
background-image:url("https://i.ibb.co/NTb2zpG/Whats-App-Image-2020-03-23-at-19-39-03.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
 background-size: cover;
  }
  h2{
 color: white;
 text-align: center;

 }
 form{
 color: white;
 text-align: center;
 }
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Lista dei nostri Clienti</h2>

	<%
		GestisciUtenti gestisciUtenti = new GestisciUtenti();
	%>
	<%
		List<Utente> listaClienti = gestisciUtenti.lista();
	%>

	<table align="center">
		<tr>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Username</th>
			<th>Eta</th>
		</tr>
		<%
			for (Utente u : listaClienti) {
		%>
		<tr>
			<td><%=u.getName().toUpperCase()%></td>
			<td><%=u.getCognome().toUpperCase()%></td>
			<td><%=u.getUsername()%></td>
			<td><%=u.getEta()%></td>
		</tr>
		<%
			}
		%>
	</table>

	<form action="SelectMenuPrincipale.jsp">
		<br> <input type="submit" value="Torna al menu Principale">
	</form>


</body>
</html>