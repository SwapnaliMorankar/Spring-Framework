<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "False" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Great Work</title>
</head>
<body>
<h1>Congratulations! Your Data has been sent successfully!</h1>
<h3>The Data is here: </h3>
<div style="text-align:center; border:3px solid red; padding:20px; width:40%; margin-left:30%;">
<p>${username}</p>
<p>${email}</p>
<p>${mobile}</p>
<p>${gender}</p>
<p>${address}</p>
<p>${password}</p>
<p>${confirmpassword}</p>
</div>
</body>
</html>