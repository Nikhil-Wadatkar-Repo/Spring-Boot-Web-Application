<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Show All Surgeon</h1>
	</br>


	<table>
	<tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>City</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	<c:forEach var="surgeon" items="${surgeons}">
	<tr>
	<td>${surgeon.surgeonId}</td>
	<td>${surgeon.surgeonFirstName}</td>
	<td>${surgeon.surgeonLastName}</td>
	<td>${surgeon.surgeonEmailId}</td>
	<td>${surgeon.surgeoncity}</td>
	<td><a href="/editById/${surgeon.surgeonId}">Edit</a></td>
	<td><a href="/deleteById/${surgeon.surgeonId}">Delete</a></td>
	</tr>
	</c:forEach>
	</table>
	</br>

</body>
</html>