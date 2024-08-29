<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
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

<title>Registration Page</title>
</head>
<body>
	<h1 class="text-center">Registration Form</h1>
	<form action="Process" method="post">
		<div
			style="width: 50%; margin-left: 25%; margin-top: 10px; border: 3px solid blue; padding: 15px;">
			<div class="form-group">
				<label for="exampleFormControlInput1">User Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="User Name" name="username">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Email address</label> <input
					type="email" class="form-control" id="exampleFormControlInput1"
					placeholder="name@example.com" name="email">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Mobile Number</label> <input
					type="number" class="form-control" id="exampleFormControlInput1"
					placeholder="Mobile Number" name="mobile">
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Gender</label> <select
					class="form-control" id="exampleFormControlSelect1" name="gender">
					<option>Select</option>
					<option>Male</option>
					<option>Female</option>
					<option>Others</option>
					<option>Prefer not to say</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Address</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="3" placeholder="Address" name="address"></textarea>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password" name="password">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Confirm Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Confirm Password" name="confirmpassword">
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</div>
	</form>
</body>
</html>