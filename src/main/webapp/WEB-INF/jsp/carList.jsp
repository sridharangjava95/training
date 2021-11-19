<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car</title>

</head>
<body style="background-color: yellow">
	<h1 align="center" style="color: red; background-color: yellow;">Car Details</h1>
	<hr>
	<br>
	<br>
	<table border="1" style="background-color: yellow; width: 100%;">
		<tr>
			<th>CAR NUMBER</th>
			<th>CAR MODEL</th>
			<th>CAR PRICE</th>
			<th>CAR COLOUR</th>
		</tr>
		<c:forEach var="c" items="${carList}">
			<tr>
				<td>${c.cNumber}</td>
				<td>${c.cModel}</td>
				<td>${c.cPrice}</td>
				<td>${c.cColour}</td>
			</tr>

		</c:forEach>



	</table>
	<br>
	<br>

	<a href="/showAddCar"><button style="background-color: blue; color: white">Add Car</button></a>
	<a href="/home"><button style="background-color: blue; color: white">Go to Home</button></a>
	<a href="/welcome"><button style="background-color: blue; color: white">Go to Welcome</button></a>

</body>
</html>