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
	<tag:url value="/assign1/index" var="index"></tag:url>
	<h1>WELCOME...</h1>
	
	<a href="${index}" >back</a>
</body>
</html>