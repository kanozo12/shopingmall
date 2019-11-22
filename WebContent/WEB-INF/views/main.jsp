<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="style.css">
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

	<div class="hero-banner">
		<div class="banner-text">
			<div class="container">
				<div class="info-text">
					<h4>Welecom to Golfer Market</h4>
					<h1>20-40% OFF Golf Wear</h1>
				</div>
				<div class="banner-content">
					<div class="brand-box">
						<h3>
							20-40% OFF ROGUE <br> DRIVERS AND WOODS
						</h3>
						<a href="product" class="btn">more</a>
					</div>
					<div class="brand-box">
						<h3>
							20-30% OFF <br> APEX IRONS
						</h3>
						<a href="product" class="btn">more</a>
					</div>
					<div class="brand-box">
						<h3>
							30-40% OFF<br> MACK DADDY 4 WEDGES
						</h3>
						<a href="product" class="btn">more</a>
					</div>
					<div class="brand-box">
						<h3>
							20-40% OFF<br> ODYSSEY EXO PUTTERS
						</h3>
						<a href="product" class="btn">more</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="sub-banner">
			<div class="banner-header">
				<div class="why-row">
					<span>WHY BUY CERTIFIED?</span>
				</div>
			</div>
			<div class="row-slider">
				<div class="sub-banner-box">
					<div class="banner-box-title">
						<i class="fas fa-unlock-alt"></i>
						<h3>ENHANCED ALIGNMENT</h3>
					</div>
					<div class="banner-box-content">
						<span>Lorem ipsum dolor sit amet consectetur adipisicing elit.</span>
					</div>
				</div>
				<div class="sub-banner-box">
					<div class="banner-box-title">
						<i class="fas fa-clipboard"></i>
						<h3>GOLF CLUB FITTING</h3>
					</div>
					<div class="banner-box-content">
						<span>Lorem ipsum dolor sit amet consectetur adipisicing elit. GOLF CLUB FITTING</span>
					</div>
				</div>
				<div class="sub-banner-box">
					<div class="banner-box-title">
						<i class="fas fa-clock"></i>
						<h3>TITLEIST GOLF BALL</h3>
					</div>
					<div class="banner-box-content">
						<span>Lorem ipsum dolor sit amet consectetur adipisicing elit. TITLEIST GOLF BALL</span>
					</div>
				</div>
				<div class="sub-banner-box">
					<div class="banner-box-title">
						<i class="fas fa-id-badge"></i>
						<h3>NEW GLOVES</h3>
					</div>
					<div class="banner-box-content">
						<span>Lorem ipsum dolor sit amet consectetur adipisicing elit. NEW GLOVES</span>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="item-boxs">
			<div class="item-shop-title">
				<p>NEW ARRIVALS</p>
			</div>
			<div class="owl-carousel owl-theme">
				<div class="item">
					<div class="item-box">
						<img src="images/item1.png" alt="">
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
						<img src="images/item2.png" alt="">
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
						<img src="images/item3.png" alt="">
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
						<img src="images/item4.png" alt="">
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
						<img src="images/item5.png" alt="">
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

	<div class="container">
		<div class="slot">
			<div class="row">
				<div class="slot-box">
					<div class="slot-img">
						<div class="slot-box-content">
							<p>Sign Up Today</p>
							<h3>
								" Enter For A Chance To" <br> "Win A $500 CGPO Gift Card!"
							</h3>
							<div class="slot-box-btn">
								<button class="btn">more</button>
							</div>
						</div>
					</div>
				</div>
				<div class="slot-box">
					<div class="slot-img">
						<div class="slot-box-content">
							<i class="fas fa-award"></i>
							<p>START EARNING POINTS</p>
							<h3>"CALLAWAY REWARDS"</h3>
							<div class="slot-box-btn">
								<button class="btn">more</button>
							</div>
						</div>
					</div>
				</div>
			</div>
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
	<div class="bottom-banner">
		<div class="bottom-banner-content">
			<div class="container">
				<div class="content-box">
					<div class="row">
						<h1>
							TRADE-IN. <br> TRADE-UP.
						</h1>
						<p>Trade in your Old Clubs and Save.</p>
						<button class="btn">more</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="category">
			<div class="cate-title">
				<p>SHOP BY CATEGORY</p>
			</div>
			<div class="cate-content">
				<p>Shop a wide selection of certified pre-owned clubs from our most popular categories.</p>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="service">
			<div class="service-box">
				<div class="service-text">
					<img src="images/drivers-icon.png" alt="driver">
					<p>Current Inventory</p>
					<span>Drivers</span>
					<div class="service-btn">
						<button class="btn">more</button>
					</div>
				</div>
			</div>
			<div class="service-box">
				<div class="service-text">
					<img src="images/fw-icon.png" alt="driver">
					<p>CURRENT INVENTORY</p>
					<span>FAIRWAY WOODS</span>
					<div class="service-btn">
						<button class="btn">more</button>
					</div>
				</div>
			</div>
			<div class="service-box">
				<div class="service-text">
					<img src="images/iron-icon.png" alt="driver">
					<p>CURRENT INVENTORY</p>
					<span>IRON SETS</span>
					<div class="service-btn">
						<button class="btn">more</button>
					</div>
				</div>
			</div>
			<div class="service-box">
				<div class="service-text">
					<img src="images/hybrids-icon.png" alt="driver">
					<p>Current Inventory</p>
					<span>HYBRIDS</span>
					<div class="service-btn">
						<button class="btn">more</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="layout/footer.jsp"></jsp:include>

	<script src="js/script.js"></script>
</body>

</html>

