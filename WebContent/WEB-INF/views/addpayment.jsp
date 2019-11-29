<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
​<%@page import="domain.Product"%>
<%@page import="domain.User"%>
<%@page import="domain.Basket"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List</title>
<%
	ArrayList<Basket> baskets = (ArrayList<Basket>) request.getAttribute("baskets");
	User user = (User) request.getAttribute("user");
	int totalprice = (int) request.getAttribute("totalprice");
	ArrayList<Product> myproducts = (ArrayList<Product>) request.getAttribute("myproducts");
	session.setAttribute("baskets", baskets);
	session.setAttribute("user", user);
%>
</head>
<body>
	<h2>
		Hello,
		<%=user.getUserName()%></h2>
	<table border="2px">
		<thead>
			<tr>
				<th width="200">Buyer Name</th>
				<th width="200">Product Name</th>
				<th width="200">Numbers</th>
			</tr>
		</thead>
		<%
			for (int i = 0; i < baskets.size(); i++) {
				Basket basket = baskets.get(i);
				Product product = myproducts.get(i);
		%>
		<tbody>
			<tr>
				<td align="center"><%=user.getUserName()%></td>
				<td align="center"><%=product.getProductName()%></td>
				<td align="center"><%=basket.getNumbers()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<br />
	<table border="2px">
		<thead>
			<tr>
				<th width="600">Payment Information</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td align="center">
					Your Address :
					<%=user.getAddress()%></br> Your Contact :
					<%=user.getContact()%></br> Total Price :
					<%=totalprice%>
				</td>
			</tr>
			<tr>
				<td align="center">
					<form action="/pay" method="post">
						Enter your Credit Card Number <input type="text" name="creditcardnumber"></br> Enter your Credit Card Password <input type="password" name="creditcardpassword"></br> <input type="submit" value="Pay">
					</form>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>