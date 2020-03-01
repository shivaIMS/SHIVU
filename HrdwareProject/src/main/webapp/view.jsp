<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="view.do">

<s:forEach items="${hardwares}" var="hard">
<table>
<tr>
<td>
<s:out value="${hard.getName()}"></s:out>
<s:out value="${hard.getWorkers()}"></s:out>
<s:out value="${hard.getLoc()}"></s:out>
</td>
</tr>
</table>

</s:forEach>
</form>
</body>
</html>