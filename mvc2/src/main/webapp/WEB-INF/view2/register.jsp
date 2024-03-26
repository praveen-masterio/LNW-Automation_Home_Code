<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="customer" modelAttribute="customer">
		<form:label path="firstName">First Name </form:label><br>
		<form:input path="firstName"/>
		<form:errors path="firstName"></form:errors>
		<br>
		<form:label path="lastName">Last Name </form:label><br>
		<form:input path="lastName"/>
		<form:errors path="lastName"></form:errors>
		<br>
		<form:label path="age">Age </form:label><br>
		<form:input path="age"/>
		<form:errors path="age"></form:errors>
		<br>
		<form:label path="address">Address </form:label><br>
		<form:input path="address"/>
		<form:errors path="address"></form:errors>
		<br>
		<form:label path="phoneNo">Phone No </form:label><br>
		<form:input path="phoneNo"/>
		<form:errors path="phoneNo"></form:errors>
		<br>
		<form:label path="email">Email </form:label><br>
		<form:input path="email"/>
		<form:errors path="phoneNo"></form:errors>
		<br>
		<form:button name="submit">Submit</form:button>
	</form:form>
</body>
</html>