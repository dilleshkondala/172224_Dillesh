<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Here</title>>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>
	<p align="center">LOGIN HERE</p>
	<div class="container">
		<form action="UserRegisterServlet" method="post">
			<label><b>Mobile Number</b></label> <input type="text"
				placeholder="Enter your Mobile number" name="uname" required> <label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required> <label> 
				
			<input type="submit" value="Submit"> <input type="reset"
			value="Reset">
			</label></form>
	</div>
     
	<div>
		

	</div>

</body>
</html>
