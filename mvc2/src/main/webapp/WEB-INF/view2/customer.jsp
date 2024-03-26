<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>CUSTOMER</h1>
	<br>
	<p>First Name : ${customer.firstName}</p>
	<p>Last Name : ${customer.lastName}</p>
	<p>Age : ${customer.age}</p>
	<p>Address : ${customer.address}</p>
	<p>Phone No : ${customer.phoneNo}</p>
	<p>Email : ${customer.email}</p>
	<br>
	<tag:url value="/assign2/index" var="index"></tag:url>
	<a href="${index}">Back</a>
</body>
</html>