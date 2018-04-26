<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User List Page</title>

</head>
<body>
	<table border="1">	
		<tr>
		<th>User ID</th>
		<th>User Name</th>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
		</tr>

		<c:set var="myData" value="${user}" />
			<tr>
			<td>
				<c:out value="${myData.userId}" />
			</td>
			<td>
				<c:out value="${myData.userName}" />
			</td>
			<td>
				<c:out value="${myData.name}" />
			</td>
			<td>
				<c:out value="${myData.email}" />
			</td>
			<td>
				<c:out value="${myData.address}" />
			</td>											
			</tr>
	</table>

</body>
</html>