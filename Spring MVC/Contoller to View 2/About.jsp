<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
	<h1>Welcome!</h1>
	
	<%
		String st = (String)request.getAttribute("name1");
		String st1 = (String)request.getAttribute("name2");
		Integer id = (Integer)request.getAttribute("ID");
		List<String> f = (List<String>) request.getAttribute("friendlist");
	%>
	
	<h2>The Names are here: <%=st + ",\n" + st1 %> </h2>
	<h2>The ID is here: <%=id %> </h2>
	<h2>The friend list is here: 
		<% for (String s:f) {%>
		<h3> <%=s %> </h3>
		<%} %>
	</h2>
	
</body>
</html>