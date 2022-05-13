<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${find}
<table>
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</table>
<h1>ID Removed</h1>
<a href ="http://localhost:8080/mvc/home"> One Id is deleted</a>
</body>
</html>