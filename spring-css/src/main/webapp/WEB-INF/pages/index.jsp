<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>FLIPKART</title>
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
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid" >
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

					<li class="active"><a href="register">Register</a></li>
				</ul>
				<ul class="active">
					<input type="text" name="search"
						placeholder="Search your wish....." size="30">
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<form action="login" method="post">
						<li><span class="glyphicon glyphicon-log-in"></span><input
							type="submit" value="Login"></li>

					</form>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container text-center">
		<h3>Cameras</h3>
		<br>
		<div class="row">
			
			<div class="col-sm-3">
				<a href="mobile1.jsp"><img
					src="C:\Users\dkondala\Downloads\spring-mvc-css-example\spring-css\src\main\webapp\WEB-INF\images\flipkartcameraimage1.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>
			<div class="col-sm-3">
				<a href="mobile2.jsp"><img
					src="C:\Users\dkondala\Downloads\spring-mvc-css-example\spring-css\src\main\webapp\WEB-INF\images\flipkartcameraimage2.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>

			<div class="col-sm-3">
				<a href="mobile3.jsp"><img
					src="C:\Users\dkondala\Downloads\spring-mvc-css-example\spring-css\src\main\webapp\WEB-INF\images\flipkartcameraimage3.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>
			
			<div class="col-sm-3">
				<a href="mobile4.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartcameraimage4.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>

			
			
		</div>
		<hr>
	</div>


	<div class="container text-center">
		<h3>Offers on Mobiles</h3>
		<br>
		<div class="row">
			
			<div class="col-sm-3">
				<a href="mobile1.jsp"><img
					src="C:\Users\dkondala\Downloads\spring-mvc-css-example\spring-css\src\main\webapp\WEB-INF\images\flipkartmobileimage1.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>
			<div class="col-sm-3">
				<a href="mobile2.jsp"><img
					src="C:\Users\dkondala\Downloads\spring-mvc-css-example\spring-css\src\main\webapp\WEB-INF\images\flipkartmobileimage2.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>

			<div class="col-sm-3">
				<a href="mobile3.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartmobileimage3.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>
			
			<div class="col-sm-3">
				<a href="mobile4.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartmobileimage4.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>

			
			
		</div>
		<hr>
	</div>

	<div class="container text-center">
		<h3>Men's Foot Wear</h3>
		<br>
		<div class="row">
			
			<div class="col-sm-3">
				<a href="mobile1.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\mensfootwearimage1.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>
			<div class="col-sm-3">
				<a href="mobile2.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\mensfootwearimage2.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>

			<div class="col-sm-3">
				<a href="mobile3.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\mensfootwearimage3.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>
			
			<div class="col-sm-3">
				<a href="mobile4.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\mensfootwearimage4.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>

			
			
		</div>
		<hr>
	</div>
	
	
	<div class="container text-center">
		<h3>Headphones & Speakers</h3>
		<br>
		<div class="row">
			
			<div class="col-sm-3">
				<a href="mobile1.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\headsetimage1.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>
			<div class="col-sm-3">
				<a href="mobile2.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\headsetimage2.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Grand Sale upto 60% off</p>
			</div>

			<div class="col-sm-3">
				<a href="mobile3.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\headsetimage3.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>
			
			<div class="col-sm-3">
				<a href="mobile4.jsp"><img
					src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\headsetimage4.jpeg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
					<p>Grand Sale upto 60% off</p>
			</div>

			
			
		</div>
		<hr>
	</div>
	

	<div class="container text-center">
		<h3>Our Partners</h3>
		<br>
		<div class="row">
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 1</p>
			</div>
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 2</p>
			</div>
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 3</p>
			</div>
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 4</p>
			</div>
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 5</p>
			</div>
			<div class="col-sm-2">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Partner 6</p>
			</div>
		</div>
	</div>
	<br>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>
