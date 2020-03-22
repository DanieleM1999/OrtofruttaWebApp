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
<body>

<h2>Lista dei Prodotti Ortofrutticoli</h2>

<% AccessoDB accessoDB = new AccessoDB(); %>
<% List<Prodotto> listaProdotti = (List<Prodotto>) accessoDB.listaProdotti() ; %>


	<% for (Prodotto p : listaProdotti){%>
	 <li><%=p %></li>
	  <% } %>
	  
<form action="SelectMenuPrincipale.jsp">	  
<br> <input type="submit" value="Torna al menu Principale">
</form>


</body>
</html>