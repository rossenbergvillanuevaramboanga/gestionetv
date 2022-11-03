<%@page import="java.util.List"%>
<%@page import="it.gestionetv.model.Televisore"%>
<%@page import="it.gestionetv.service.MyServiceFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Televisori</title>

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

<h1 align="center">Esercizio: gestionetv</h1><br>

<table class="center">
		<thead>
			<tr>
				<th>CODICE</th>
				<th>AZIONI</th>
			</tr>
		</thead>
		<%List<Televisore> televisori = (List<Televisore>) MyServiceFactory.getTelevisoreServiceInstance().caricaTutti();
		for(Televisore televisoreItem : televisori){
		 %>
				<tr>
					<td><%=televisoreItem.getCodice() %></td>
					
					<td>
						<a href="ExecuteReadTelevisoreServlet?idTelevisore=<%=televisoreItem.getId() %>">Dettaglio</a>
						<a href="ExecuteDeleteTelevisoreServlet?idTelevisore=<%=televisoreItem.getId() %>">Elimina</a>
						<a href="PrepareUpdateTelevisoreServlet?idTelevisore=<%=televisoreItem.getId()%>">Modifica</a>
					</td>
					
				</tr>
			<%} %>
	
	</table>
	
	<div align="center" class="margin-top-10px">
		<a href="insertForm.jsp" >Aggiungi un nuovo televisore</a>
	</div>
	

</body>
</html>