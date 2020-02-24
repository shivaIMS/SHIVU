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
<form action="home.do" method="post">
Item Details : <input type="text" value = "item"/>
Quantity : <input type = "text" value = "quantity"/>
Price : <Input type = "number" value="price"/>
<input type = "submit" value="SubmitDetails">
</form>
</body>
</html>