<%@page import="it.gestionetv.model.Televisore"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dettaglio Televisore</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
	
	.margin-top-10px {
	    margin-top: 10px;
	}
</style>
</head>
<body>

<h1 align="center">Dettaglio Televisore</h1><br>

<table class="center">
		<thead>
			<tr>
				<th>ID</th>
				<th>MARCA</th>
				<th>MODELLO</th>
				<th>PREZZO</th>
				<th>NUMERO POLLICI</th>
				<th>CODICE</th>
			</tr>
		</thead>
		<% Televisore televisore = (Televisore) request.getAttribute("televisore"); %>
		
		<tr>
					<td><%=televisore.getId()%></td>
					<td><%=televisore.getMarca()%></td>
					<td><%=televisore.getModello() %></td>
					<td><%=televisore.getPrezzo()%></td>
					<td><%=televisore.getNumeroPollici()%></td>
					<td><%=televisore.getCodice()%></td>
		</tr>

	</table>
	<div align="center">
	<a href="listAllTelevisori.jsp">Torna Lista Televisori</a>
	</div>

</body>
</html>