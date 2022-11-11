<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu_painter.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Painter</title>
</head>
<body>
	<h2>Painter Details</h2>
	
	<form action ="SavePainter" method="post">
	<pre>
	Name		<input type="text" name="name" />
	Age		<input type="text" name="age"/>
	City		<input type="text" name="city"/>
	Contact No	<input type="text" name="contactNo"/>
	Commission	<input type="text" name="commission"/>
	Email		<input type="text" name="email"/>
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg }
</body>
</html>