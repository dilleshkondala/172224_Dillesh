<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" type=" content/html"
	href="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\CSS\indexStyleSheet.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartlogo.jpg"
					alt="flipkartlogo.png" height="35" width="150"></a>
			</div>

			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li class="active"><a href="#">About Us</a></li>
					<li class="active"><a href="#">Cateogories</a>
						<form>
							<select class="active">
								<ul>
									<option class="active"><a href="#">CATEGORIES</a></option>
								</ul>
								<ul>
									<option><a href="#">Electronics</a></option>
								</ul>
								<ul>
									<option><a href="#">HomeNeeds</a></option>
								</ul>
								<ul>
									<option><a href="#">Sports</a></option>
								</ul>
								<ul>
									<option><a href="#">Books</a></option>
								</ul>
								<ul>
									<option><a href="#">Kids</a></option>
								</ul>
							</select>
						</form></li>

					<li class="active"><a href="register.jsp">Register</a></li>
				</ul>
				<ul class="active">
					<input type="text" name="search"
						placeholder="Search your wish....." >
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<form action="login.jsp" method="post">
						<li><span class="glyphicon glyphicon-log-in"></span><input
							type="submit" value="Login"></li>

					</form>
				</ul>
			</div>
		</div>
	</nav>
	
	<p align="center">LOGIN HERE</p>
	<div class="container">
		<form action="login" method="post">
			<label><b>Mobile Number</b></label> <input type="text"
				placeholder="Enter your Mobile number" name="mobilenum" required> 
			<label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required> <label> 
				
			<input type="submit" value="Submit"> <input type="reset"
			value="Reset">
			</label></form>
	</div>
     
	<div>
		

	</div>

</body>
</html>















