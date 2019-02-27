<!DOCTYPE html>
<html>
<head>
<title>Register Here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>
	<p align="center">REGISTER HERE</p>
	<div class="container">
		<form action="UserRegisterServlet" method="post">
			<label><b>First Name:</b></label> 
			<input type="text" placeholder="Enter your FirstName" name="firstname" required> 
			
			<label><b>Last Name:</b></label> 
			<input type="text" placeholder="Enter your LastName" name="lastname" required>
			
			<label><b>Email:</b></label> 
			<input type="text" placeholder="Enter valid eamil-id" name="email" required>
			
			<label><b>Mobile No.:</b></label> 
			<input type="text" placeholder="Enter valid mobile number" name="mobilenum" required>
			
			<label><b>Password</b></label>
			<input type="password" placeholder="Set your Password" name="password" required>
			
	
			
			<label> <input type="checkbox" checked="checked" name="remember"> Remember me</label>
	
	
	<div>
		<input type="submit" value="Register"> 
		<input type="reset"	value="Reset">

	</div>
	</form>
	
</div>

</body>
</html>
