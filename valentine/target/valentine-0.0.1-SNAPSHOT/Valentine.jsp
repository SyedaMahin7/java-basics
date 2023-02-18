<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to Valentine data page</h1>
	
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	
	<form action="valentine" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Valentine Name</label> <input
				type="text" class="form-control" name="valentineName" id="formFile"
				placeholder="Enter valentine name" />
		</div>
		Select Place <select class="form-select"
			aria-label="Default select example" name="place">
			<option selected value="">Select place</option>
			<c:forEach items="${places}" var="p">
			<option value="${p}">${p}</option>
			</c:forEach>
			</select>
		Select Gift <select class="form-select"
			aria-label="Default select example" name="gift">
			<option selected value="">Select place</option>
			<c:forEach items="${gifts}" var="g">
			<option value="${g}">${g}</option>
			</c:forEach>
			</select>
			<input type="submit" value="Save" class="btn btn-primary"/>
		</form>
</body>
</html>