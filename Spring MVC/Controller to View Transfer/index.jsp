<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Welcome to MVC Project</title>
<body>
	<h2>This is my first MVC Project</h2>

	<%
	String name = (String) request.getAttribute("name");
	Integer ID = (Integer) request.getAttribute("ID");
	List<String> friend = (List<String>) request.getAttribute("Friend");
	%>

	<h3>
		The name is:
		<%=name%>
	</h3>
	<h3>
		The ID is:
		<%=ID%>
	</h3>
	<hr>

	<%
	for(String s:friend){
	%>
	<h3> <%= s %> </h3>
	<%
	}
	%>

</body>
</html>
