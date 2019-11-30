<%@page import="entities.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Sign-up Form</title>
<link rel="stylesheet" type="text/css" href="/resources/css/signup.css">
</head>

<body>
	<div class="wrap">
		<h2>Create account Here</h2>
		<form action="/rest/create" method="post">
			<input type="text" placeholder="First Name" name="firstName" required>
			<input type="text" placeholder="Last Name" name="lastName" required>
			<input type="text" placeholder="Email" name="userEmail" required>
			<input type="password" placeholder="Password (Max 8 char)" name="userPassword" required> 
			<input type="submit" value="Sign up"> 
			<input type="button" value="Log In"	onclick="location.href='/';" />
			<p>Already have an account? Log In here!</p>
		</form>
	</div>
</body>
</html>