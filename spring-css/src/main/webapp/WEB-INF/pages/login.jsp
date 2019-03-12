<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="<c:url value="/resources/CSS/login.css" />" type = "text/css" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
    
</head>
<p align="center">LOGIN HERE</p>
	<div class="container">
		<form action="login" method="post">
			<label><b>Mobile Number</b></label> <input type="text"
				placeholder="Enter your Mobile number" name="mobilenum" required>  <br>
			<label><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required> <label> <br> 
				
			<input type="submit" value="Submit"> <input type="reset"
			value="Reset">
			</label></form>
	</div>
     
	<div>
		

	</div>

</body>
</html>