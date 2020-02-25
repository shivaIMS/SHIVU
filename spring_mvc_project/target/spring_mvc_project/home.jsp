<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="lightpink">
<%-- <h1> Thank you for adding ${key}</h1> --%>
<h1 style="text-align: center;">Yulu Home Page</h1>
<form action="home.do" method="post">
Yulu Number:<input type="text" name="yuluNumber">
Yulu Location:<input type="text" name="location">
Yulu Source :<input type="number" name="source">
Yulu Destination :<input type="number" name="destination">
<input type="submit" value="Create">
</form>
</body>
</html>