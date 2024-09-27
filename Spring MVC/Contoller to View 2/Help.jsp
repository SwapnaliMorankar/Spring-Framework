<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is Help Page</title>
</head>
<body>

	<% 
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("ID");
		String city = (String)request.getAttribute("City");
		List<Integer> marks = (List<Integer>) request.getAttribute("marks");
	
	%>

	<h2>Name : <%= name%></h2>
	<h2>ID : <%=id %></h2>
	<h2>City : <%=city %></h2>
	<h2>Marks : <%=marks %></h2>
	
	<h2>Marks :</h2>
	<% for(int x:marks){ %>
		<h2><%= x%></h2>
	<%} %>
	
	 
</body>
</html>