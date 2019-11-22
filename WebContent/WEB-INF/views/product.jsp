
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" integrity="sha384-KA6wR/X5RY4zFAHpv/CnoG2UW1uogYfdnP67Uv7eULvTveboZJg0qUpmJZb5VqzN" crossorigin="anonymous" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/owl.carousel.min.js"></script>
<link rel="stylesheet" href="/assets/owlcarousel/assets/owl.carousel.min.css" />
<link rel="stylesheet" href="css/product.css" />
<title>Document</title>
</head>
<body>
	<header>
		<div class="head-nav">
			<div class="logo">
				<a href="/"></a>
			</div>
			<div class="nav-list">
				<li><a href="product">GOLF CLUBS</a></li>
				<li><a href="product">ACCESSORIES</a></li>
				<li><a href="product">WOMEN'S</a></li>
				<li><a href="product">MEN'S</a></li>
				<li><a href="product">OTHER BEANDS</a></li>
				<li><a href="product">CLEARANCE</a></li>
				<li><a href="product">TRADE-IN</a></li>
			</div>
			<div class="sub-icon">
				<div class="icon">
					<a href="#"><i class="fas fa-search"></i></a>
				</div>
				<div class="icon">
					<a href="login"><i class="far fa-user"></i></a>
				</div>
				<div class="icon">
					<a href="basket"><i class="fas fa-shopping-cart"></i></a>
				</div>
				<c:if test="${not empty id}">
					<div class="icon">
						<a href="logout"><i class="fas fa-sign-out-alt"></i></a>
					</div>
				</c:if>
			</div>
		</div>
	</header>

	<form action="/basket" method="post">
		<input type="hidden" name="userid" value="${user1.userId}">
		<c:if test="${not empty id }">
			<input type="submit" class="fas fa-shopping-cart" value="My Basket">
		</c:if>
	</form>

	<div class="container">
		<div class="product">
			<c:forEach items="${products}" var="product">
				<div class="product-item">
					<div class="item-box">
						<img src="images/item1.png" alt="" />
						<div class="item-name">
							<p>${product.productName }</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
							</div>
						</div>
						<p>From $ ${product.price }</p>
						<form action="/take" method="post">
							<div class="take">
								<input type="hidden" name="userid" value="${user1.userId}"> <input type="hidden" name="productid" value="${product.productId }"> <input type="submit" value="Take" class="btn">
							</div>
						</form>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>

	<script src="js/script.js"></script>
</body>
</html>