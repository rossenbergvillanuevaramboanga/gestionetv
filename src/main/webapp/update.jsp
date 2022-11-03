
<%@page import="java.util.List"%>
<%@page import="it.gestionetv.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ExecuteUpdateTelevisoreServlet" method="post">
<% Televisore televisore = (Televisore) request.getAttribute("televisoreDaModificare");%>
		<h3>Modifica Televisore</h3>
		<input type="hidden" name="id" value="<%=televisore.getId()%>">
		<label>Marca</label><br>
		<input type="text" name="marca" value="<%=televisore.getMarca()%>"><br>
		<label>Modello</label><br>
		<input type="text" name="modello" value="<%=televisore.getModello()%>"><br>
		<label>Prezzo</label><br>
		<input type="number" name="prezzo" value="<%=televisore.getPrezzo()%>"><br>
		<label>Numero Pollici</label><br>
		<input type="number" name="numeropollici" value="<%=televisore.getNumeroPollici()%>"><br>
		<label>Codice</label><br>
		<input type="text" name="codice" value="<%=televisore.getCodice()%>" ><br>
		
		<input type="submit" value="Crea">
</form>
	<% if(request.getAttribute("messaggioErrore") != null){%>
	<p style="color: red;"><%=request.getAttribute("messaggioErrore") %></p>
	<%}; %>
	<a href="listAllTelevisori.jsp" >Torna Lista Televisori</a>
</body>
</html>