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

  h3{
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
<h3>Inserisci i dati Richiesti</h3>
<form action="carico" method="post">

 <label for="Name">Inserisci nome del prodotto arrivato:</label>
  <input type="text" id="Name" name="Name"><br><br>
  <label for="inv">Inserisci quantita prodotto arrivato:</label>
  <input type="number" id="inv" name="inv" min="1">

<br><br>
<input type="submit" value="Continua">
</form>

<form action="SelectMenuPrincipale.jsp">
<br> <input type="submit" value="Back">
</form>
</body>
</html>