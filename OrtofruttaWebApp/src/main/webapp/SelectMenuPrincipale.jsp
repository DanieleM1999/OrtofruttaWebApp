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
<h1>Benvenuto nel nostro bel negozio</h1>
<h3>Questo è il negozietto di due personcine Giulio il capo e Daniele lo schiavo.</h3>
<h4>Per proseguire, selezionare una delle seguenti Opzioni!</h4>

<form action="store-menu">
<label for="SceltaOperazioni">#############</label>
<select name="SceltaOperazioni"> 
  <option value="Aggiungi Prodotto">Aggiungi Prodotto</option>
  <option value="Stampa ListaProdotti">Stampa ListaProdotti</option>
  <option value="Registra Aquisto">Registra Aquisto</option>
  <option value="Registra Arrivo">Registra Arrivo</option>
  <option value="Cambia Prezzo">Cambia Prezzo</option>
  <option value="Cambia Descrizione">Cambia Descrizione</option>
</select>
<input type="submit" value="Conferma"> ##############

</form>
</body>
</html>