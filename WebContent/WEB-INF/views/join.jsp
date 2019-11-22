<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" integrity="sha384-KA6wR/X5RY4zFAHpv/CnoG2UW1uogYfdnP67Uv7eULvTveboZJg0qUpmJZb5VqzN" crossorigin="anonymous" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/js/owl.carousel.min.js"></script>
<link rel="stylesheet" href="/assets/owlcarousel/assets/owl.carousel.min.css" />
<link rel="stylesheet" href="/css/joinstyle.css" />
<title>Document</title>
</head>

<body>
	<form action="/join" method="post">
		<jsp:include page="layout/header.jsp"></jsp:include>

		 <div class="container">
      <div class="join-account">
        <div class="join">
          <h2>CREATE AN ACCOUNT</h2>
          <p>Use one of your Social Media accounts for a quick sign up</p>

          <input type="text" class="form-group" placeholder="Name" name="username"/>
          <input type="password" class="form-group" placeholder="Password" name="password"/>
          <input type="date" class="form-group" name="birthdate">
          <input type="radio" placeholder="Gender" class="radio-group" name="gender" value="man"/>Man
          <input type="radio" placeholder="Gender" class="radio-group" name="gender" value="woman"/>Woman
          <input type="email" class="form-group" placeholder="Email Address" name="email">
          <input type="text" class="form-group" placeholder="contact" name="contact">
          <input type="text" class="form-group" placeholder="address" name="address">
          <input type="submit" value="SIGN IN" class="btn orange" />
        </div>
      </div>
    </div>

		<jsp:include page="layout/footer.jsp"></jsp:include>

		<script src="js/script.js"></script>
	</form>
</body>
</html>
