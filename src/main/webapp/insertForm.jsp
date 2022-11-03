<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aggiungi un nuovo televisore</title>
</head>
<body>

<form action="ExecuteInsertTelevisoreServlet" method="post">
		<h3>Aggiungi un nuovo televisore</h3>
		<label>Marca</label><br>
		<input type="text" name="marca"><br>
		<label>Modello</label><br>
		<input type="text" name="modello"><br>
		<label>Prezzo</label><br>
		<input type="number" name="prezzo"><br>
		<label>Numero Pollici</label><br>
		<input type="number" name="numeropollici"><br>
		<label>Codice</label><br>
		<input type="text" name="codice"><br>
		
		<input type="submit" value="Crea">
</form>
	<% if(request.getAttribute("messaggioErrore") != null){%>
	<p style="color: red;"><%=request.getAttribute("messaggioErrore") %></p>
	<%}; %>
<a href="listAllTelevisori.jsp" >Torna Lista Televisori</a>
</body>
</html>