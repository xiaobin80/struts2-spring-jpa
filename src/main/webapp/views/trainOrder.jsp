<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Train List Page</title>

</head>

<body>
	<div>
	<c:set var="numData" value="${trainNumber}" />
	<label>Month1:17~160</label>
	<label>Month2:163~501</label>
	<label>Month3:502~829</label>
	</br>
	<label>For example:</label>
	</br>
	<label>http://localhost:8080/.../trainList?month=3&trainNum=808</label>
	</div>
	</hr>
<div style="text-align:center;">	
	<label>Train Number: <c:out value="${numData}" /></label>
	<table border="1" style="margin: auto;">
		<tr>
		<!-- åºå· -->
		<th>Sn</th>
		<!-- è½¦å· -->
		<th>Car Number</th>
		<!-- è½¦å -->
		<th>Car Marque</th>
		<!-- æ é  -->
		<th>Carry Weight</th>
		<!-- èªé -->
		<th>Self Weight</th>
		<!-- å°è¾¾æ¶é´ -->
		<th>Past Time</th>

		</tr>

		<c:forEach var="myData" items="${trainList}">
			<tr>
			<td>
				<c:out value="${myData.seriaryNumber}" />
			</td>
			<td>
				<c:out value="${myData.carNumber}" />
			</td>
			<td>
				<c:out value="${myData.carMarque}" />
			</td>
			<td>
				<c:out value="${myData.carryWeight1}" />
			</td>	
			<td>
				<c:out value="${myData.selfWeight1}" />
			</td>
			<td>
				<c:out value="${myData.pastTime}" />
			</td>												
			</tr>
		</c:forEach>
	</table>
</div>




</body>
</html>
