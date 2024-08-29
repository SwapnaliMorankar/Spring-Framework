<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
<h1 class="text-center">Registration Form</h1>
	<form action="Process" method="post">
	<div style="width:50%; margin-left:25%; margin-top:30px;">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email" name="email"> <small
				id="emailHelp" class="form-text text-muted">We'll never
				share your email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password" name="password">
		</div>
		<div class="text-center">
		<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</div>
	</form>
</body>
</html>