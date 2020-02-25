<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<title>Bootstrap Page Awesome</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<head>
<style>
body {
	background-image: url("paper.gif");
	background-color: #00bcd4;
}

h1 {
	border: 5px solid red;
}

h2 {
	border: 4px dotted blue;
}
</style>
</head>


<body>


	<h1 style="text-align: center;">Yulu Home Page</h1>
	<form action="home.do" method="post">
		<div>
			<div class="form-group">
				<label for="YuluNumber"> Yulu Number : </label> <input
					type="Yulu Number" class="form-control" name="yuluNumber" id="number"
					placeholder="Enter the Yulu Number" />
			</div>

			<div class="form-group">
				<label>Yulu Location:</label> <input type="text"
					class="form-control" name="location" placeholder="Enter the location" />
			</div>

			<div class="form-group">
				<label>Source :</label> <input type="text" name="source" class="form-control"
					placeholder="Enter the source" />
			</div>

			<div class="form-group">
				<label>Destination :</label> <input type="text" name="destination" class="form-control"
					placeholder="Enter the number" placeholder="Enter the destination" />
			</div>

			<div class="form-group">
				<input type="submit" value="Ride Me" />
			</div>

			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>

		</div>
		<!-- The below commented code was previously used to store the data -->
		<!-- Yulu Number:<input type="text" name="yuluNumber"> -->
		<!-- Yulu Location:<input type="text" name="location">
		Yulu Source :<input type="number" name="source">
		Yulu Destination :<input type="number" name="destination">
		<input type="submit" value="Create"> -->
	</form>

</body>
</html>