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

	<h2>Lista dei prodotti ortofrutticoli</h2>

	<%
		AccessoDB accessoDB = new AccessoDB();
	%>
	<%
		List<Prodotto> listaProdotti = (List<Prodotto>) accessoDB.listaProdotti();
	%>

	<table align="center">
		<tr>
			<th>Nome</th>
			<th>Quantit&#224</th>
			<th>Prezzo</th>
			<th>Informazioni</th>
		</tr>
		<%
			for (Prodotto p : listaProdotti) {
		%>
		<tr>
			<td><%=p.getName().toUpperCase()%></td>
			<td><%=p.getInventories()%>pz</td>
			<td><%=p.getPrice()%>&#x20ac</td>
			<td><%=p.getInfo().toLowerCase()%></td>
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