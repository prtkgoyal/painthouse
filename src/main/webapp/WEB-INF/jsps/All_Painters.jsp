<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu_painter.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Painters</title>
</head>
<body>
	<h2>All Painters Details</h2>
	<table border="3">
	<tr>
		<th>Cid</th>
		<th>Name</th>
		<th>Age</th>
		<th>City</th>
		<th>ContactNo.</th>
		<th>Commission</th>
		<th>Email</th>
		<th>Delete</th>
		<th>Update</th>
	<tr>	
	
	<c:forEach var="paint" items="${paints}">
		<tr>
			<td>${paint.cid }</td>
			<td>${paint.name}</td>
			<td>${paint.age }</td>
			<td>${paint.city }</td>
			<td>${paint.contactNo }</td>
			<td>${paint.commission }</td>
			<td>${paint.email }</td>
			<td><a href ="deletepainter?ccc=${paint.cid}">click here</a></td>
			<td><a href="updatepainter?ddd=${paint.cid }">click here</a></td>
		</tr>
		</c:forEach>
	</table>
	
		
	
	
</body>
</html>