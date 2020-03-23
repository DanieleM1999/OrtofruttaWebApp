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
	border: 1.2px solid grey;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Lista dei Prodotti Ortofrutticoli</h2>

	<%
		AccessoDB accessoDB = new AccessoDB();
	%>
	<%
		List<Prodotto> listaProdotti = (List<Prodotto>) accessoDB.listaProdotti();
	%>

	<table>
		<tr>
			<th>Nome</th>
			<th>Quantità</th>
			<th>Prezzo</th>
			<th>Informazioni</th>
		</tr>
		<%
			for (Prodotto p : listaProdotti) {
		%>
		<tr>
			<td><%=p.getName()%></td>
			<td><%=p.getInventories()%></td>
			<td><%=p.getPrice()%></td>
			<td><%=p.getInfo()%></td>
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