<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User List Page - Struts2 tag</title>

</head>
<body>
	<div style="text-align:center;">
		<table border="1" style="margin:auto;">	
			<tr>
			<th>User ID</th>
			<th>User Name</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			</tr>
	
			<s:iterator value="users">
				<tr>
				<td>
					<s:property value="userId" />
				</td>
				<td>
					<s:property value="userName" />
				</td>
				<td>
					<s:property value="name" />
				</td>
				<td>
					<s:property value="email" />
				</td>
				<td>
					<s:property value="address" />
				</td>											
				</tr>
			</s:iterator>
		</table>
	</div>


</body>
</html>