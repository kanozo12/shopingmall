<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>Product List</title>

</head>
<body>
	<table border="2px">
		<tr>
			<th width="100">Product ID</th>
			<th width="150">Product Type</th>
			<th width="200">Product Name</th>
			<th width="400">Explanation</th>
			<th width="150">Price</th>
			<th width="100">Inventory</th>
		</tr>

		<c:forEach items="${products}" var="product">
			<tr>
				<td align="center">${product.productId }</td>
				<td align="center">${product.productType }</td>
				<td align="center">${product.productName }</td>
				<td align="center">${product.explanation }</td>
				<td align="center">$ ${product.price }</td>
				<td align="center">${product.inventory }</td>
			</tr>
		</c:forEach>



	</table>
</body>
</html>