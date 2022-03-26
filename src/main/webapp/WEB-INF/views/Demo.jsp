<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Demo Page </h1></br>
Showing String type value</br>
${ganya}<br>
${surname}</br>

Showing Object value <br>
Id: ${employeeVar.id}</br>
Name: ${employeeVar.name}</br>
</br>
Showing list of Objects in tabular format</br>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach var="employee" items="${employeeList}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
			</tr>
		</c:forEach>
		<tr></tr>

	</table>
</body>
</html>