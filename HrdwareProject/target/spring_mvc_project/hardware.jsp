<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>

</head>
<body>
<h1>Welcome to Spring MVC</h1>

<form action= "hardware.do" method="post">

Name : <input type="text" name = "name"/>
Workers : <input type="number" name = "workers"/>
Location : <input type="text" name = "loc"/>
<input type="submit" value="CLickmE">

</form>

<a href="view.jsp">View</a>


</body>
</html>
