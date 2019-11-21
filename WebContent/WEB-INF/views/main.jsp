<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="/" method="post">
		<table>
			<tr>
				<td>Login Select:</td>
				<td><select name="usertype">
						<option name="usertype" value="unknown">Your Select
						<option name="usertype" value="A">Administrator
						<option name="usertype" value="C">Customer
				</select></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" size="24"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" size="24"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>
</html>

