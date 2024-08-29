<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is Help Page</h1>
	<h3>${name}</h3>
	<h3>${ID}</h3>
	<h3>${Marks}</h3>
	<hr>
	<c:forEach var="item" items="${ Marks}">
		<h3>${item}</h3>
	</c:forEach> 
	
</body>
</html>