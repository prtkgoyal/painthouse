<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<h2>Update Painter</h2>
	<form action="updatepainter" method="post">
	<pre>
	<input type="hidden"/ value="${paints.cid }" name="cid">
	Name  		 <input type="text" value="${paints.name }" name="name"/>
	Age		 <input type="text" value="${paints.age }" name="age"/>
	City 		 <input type="text" value="${paints.city }" name="city"/>
	ContactNo	 <input type="text" value="${paints.contactNo }" name="contactNo"/>
	Commission	 <input type="text" value="${paints.commission }"  name="commission"/>
	Email		 <input type="text" value="${paints.email }" name="email"/>
	<input type="submit" value="update"/>
	</pre>
	</form>
</body>
</html>