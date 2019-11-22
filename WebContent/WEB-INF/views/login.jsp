<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" integrity="sha384-KA6wR/X5RY4zFAHpv/CnoG2UW1uogYfdnP67Uv7eULvTveboZJg0qUpmJZb5VqzN" crossorigin="anonymous" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/owl.carousel.min.js"></script>
<link rel="stylesheet" href="/assets/owlcarousel/assets/owl.carousel.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<title>Document</title>
</head>

<body>
	<form action="/login" method="post">
		<jsp:include page="layout/header.jsp"></jsp:include>

		<div class="container">
			<div class="account">

				<div class="login">
					<h2>Log in to start earning</h2>
					<p>Sign in to your existing Callaway account below:</p>
					<select class="custom-select" name="usertype">
						<option selected>Open this select menu</option>
						<option value="A" name="usertype">Admin</option>
						<option value="C" name="usertype">Customer</option>
					</select>
					<input type="text" class="form-group" placeholder="Name" name="username" required /> <input type="password" class="form-group" placeholder="Password" name="password" required /> <input type="submit" value="SIGN IN" class="btn" />
				</div>

				<div class="join">
					<h2>Join the Team</h2>
					<p>Get the most from your Callaway Golf Pre-Owned experience by creating your free account today.</p>

					<a href="join" class="btn">Join</a>
				</div>
			</div>
		</div>

		<jsp:include page="layout/footer.jsp"></jsp:include>

		<script src="js/script.js"></script>
	</form>
</body>
</html>
