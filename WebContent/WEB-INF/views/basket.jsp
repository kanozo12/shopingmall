<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="domain.Basket"%>
<%@page import="java.util.ArrayList"%>
<%@page import="domain.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	User user = (User) request.getAttribute("user");
%>
<%
	session.setAttribute("user", user);
%>
</head>
<body>
	<h2>Hello, ${user.userName }</h2>
	<table border="2px">
		<tr>
			<th width="200">Basket ID</th>
			<th width="200">User Name</th>
			<th width="200">Product ID</th>
			<th width="200">Numbers</th>
		</tr>
		<c:forEach items="${baskets}" var="baskets">
			<tr>
				<td align="center">${baskets.userId }</td>
				<td align="center"><%=user.getUserName()%></td>
				<td align="center">${baskets.productId }</td>
				<td align="center">${baskets.numbers }</td>
				<td align="center">
					<form action="/delete" method="post">
						<input type="hidden" name="basketid" value="${baskets.basketId }"> <input type="hidden" name="userid" value="<%=user.getUserId()%>"> <input type="submit" value="Delete">
				</td>
			</tr>

		</c:forEach>
	</table>


</body>
</html>
</body>
</html>