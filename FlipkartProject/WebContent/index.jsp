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

<link rel="stylesheet" type = " content/html" href="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\CSS\indexStyleSheet.css">
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
					<form >
						<select class="active">
							<ul>
								<option  class="active"><a href="#">CATEGORIES</a></option>
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
					</form>
					</li>
					
					<li class="active"><a href="register.jsp">Register</a></li>
				</ul>
				<ul class="active"><input type ="text" name = "search" placeholder="Search your wish....." size="40" ></ul>
				<ul class="nav navbar-nav navbar-right">
				<form action ="login.jsp" method = "post">
					<li> <span class="glyphicon glyphicon-log-in"></span><input type = "submit" value="Login"></li>
				
				</form>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-8">
				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartslideshare5.png" height="2000px" width="1700px"alt="Image">
							<div class="carousel-caption">
								<h3>Save 600/-</h3>
							</div>
						</div>

						<div class="item">
							<img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartslideshare4.jpg"
							height="2000px" width="1700px" alt="Image">
							<div class="carousel-caption">
								<h3>Offer 35% off</h3>

							</div>
						</div>
					</div>

					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			
			</div>
		</div>
		<hr>
	</div>

	<div class="container text-center">
		<h3>Offers on Mobiles</h3>
		<br>
		<div class="row">
			<div class="col-sm-3">
				<a href = "mobile1.jsp"><img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\
				WebContent\images\flipkartmobile1.jpg"
					class="img-responsive" style="width: 100%" alt="Image"></a>
				<p>Running Offers</p>
			</div>
			<div class="col-sm-3">
				<img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartmobile2.jpg"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Grand Sale upto 60% off</p>
			</div>
			<div class="col-sm-3">
				<img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartimobile3.jpg"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Grand Sale upto 60% off</p>
			</div>
			
			<div class="col-sm-3">
				<a href = "mobile4.jsp"><img src="C:\Users\dkondala\git\172224_Dillesh\FlipkartProject\WebContent\images\flipkartmobile4.jpg"
					class="img-responsive" style="width: 100%" alt="Image">
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
