<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="domain.Basket"%>
<%@page import="java.util.ArrayList"%>
<%@page import="domain.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" integrity="sha384-KA6wR/X5RY4zFAHpv/CnoG2UW1uogYfdnP67Uv7eULvTveboZJg0qUpmJZb5VqzN" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/owl.carousel.min.js"></script>
<link rel="stylesheet" href="/assets/owlcarousel/assets/owl.carousel.min.css" />
<link rel="stylesheet" href="css/style.css">

<title>Document</title>
</head>

<body>
	<header>
		<div class="head-nav">
			<div class="logo">
				<a href="#"></a>
			</div>
			<div class="nav-list">
				<li><a href="#">GOLF CLUBS</a></li>
				<li><a href="#">ACCESSORIES</a></li>
				<li><a href="#">WOMEN'S</a></li>
				<li><a href="#">MEN'S</a></li>
				<li><a href="#">OTHER BEANDS</a></li>
				<li><a href="#">CLEARANCE</a></li>
				<li><a href="#">TRADE-IN</a></li>
			</div>
			<div class="sub-icon">
				<div class="icon">
					<a href=""><i class="fas fa-search"></i></a>
				</div>
				<div class="icon">
					<a href="#"><i class="far fa-user"></i></a>
				</div>
				<div class="icon">
					<a href="#"><i class="fas fa-shopping-cart"></i></a>
				</div>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="page-header">
			<div class="page-title">
				<h1>YOUR CART</h1>
			</div>
		</div>

		<div class="basket-detail">
			<div class="basket-list">
				<c:if test="${empty baskets }">
					<p class="empty">Your shopping cart is empty</p>
				</c:if>

				<c:forEach items="${baskets}" var="baskets">
					<div class="basket-item">
						<p>${baskets.userId }</p>
						<p>${user.userName }</p>
						<p>${baskets.productId }</p>
						<p>${baskets.numbers }</p>
					</div>
				</c:forEach>
			</div>

			<div class="basket-order"></div>
		</div>
	</div>
	<div class="container">
		<div class="item-boxs">
			<div class="item-shop-title">
				<p>RECOMMENDED FOR YOU</p>
			</div>
			<div class="owl-carousel owl-theme">
				<div class="item">
					<div class="item-box">
						<img src="images/re1.png" alt="">
						<div class="item-name">
							<p>Rogue Fairway Woods</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
							</div>
						</div>
						<p>From $112.99</p>
					</div>
				</div>
				<div class="item">
					<div class="item-box">
						<img src="images/re2.png" alt="">
						<div class="item-name">
							<p>Big Bertha Irons</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
							</div>
						</div>
						<p>From $727.99</p>
					</div>
				</div>
				<div class="item">
					<div class="item-box">
						<img src="images/re3.png" alt="">
						<div class="item-name">
							<p>ODYSSEY EXO STROKE LAB SEVEN PUTTER</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
							</div>
						</div>
						<p>From $296.99</p>
					</div>
				</div>
				<div class="item">
					<div class="item-box">
						<img src="images/re4.png" alt="">
						<div class="item-name">
							<p>Epic Flash Drivers</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
							</div>
						</div>
						<p>From $429.99</p>
					</div>
				</div>
				<div class="item">
					<div class="item-box">
						<img src="images/re5.png" alt="">
						<div class="item-name">
							<p>APEX 19 HYBRIDS</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
							</div>
						</div>
						<p>From $227.99</p>
					</div>
				</div>

			</div>
		</div>
	</div>

	<jsp:include page="layout/footer.jsp"></jsp:include>
	<script src="js/script.js"></script>
</body>

</html>