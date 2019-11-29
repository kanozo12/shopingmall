<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="domain.Payment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="domain.User"%>

<!DOCTYPE html>
<html>
<head>
<title>Product List</title>
<%
	ArrayList<Payment> payments = (ArrayList<Payment>) request.getAttribute("payments");
%>
<%
	User user = (User) request.getAttribute("user");
%>
<%
	session.setAttribute("user", user);
%>
</head>
<body>
	<h2>
		Hello,
		<%=user.getUserName()%></h2>
	<table border="2px">
		<tr>
			<th width="100">Payment ID</th>
			<th width="200">User Name</th>
			<th width="100">Product ID</th>
			<th width="100">Numbers</th>
			<th width="200">Address</th>
			<th width="200">Contact</th>
		</tr>
		<%
			for (int i = 0; i < payments.size(); i++) {
				Payment payment = payments.get(i);
		%>
		<tr>
			<td align="center"><%=payment.getPaymentId()%></td>
			<td align="center"><%=user.getUserName()%></td>
			<td align="center"><%=payment.getProductId()%></td>
			<td align="center"><%=payment.getNumbers()%></td>
			<td align="center"><%=payment.getAddress()%></td>
			<td align="center"><%=payment.getContact()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>