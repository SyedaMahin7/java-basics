<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cricket </title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
   	
    </a>
     <a href="index.jsp">Home</a>
  </div>
</nav>
<h1>Welcome to cricket players list update</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}<br></span>
	</c:forEach>
	<div><span style="color:green;">${e.message}</span></div>
	
	<form action="update" method="post">
	
	<div class="mb-3">
	<label for="formFile" class="form-label">Id</label>
	<input type="text" class="form-control" name="id" readonly="readonly" value="${dto.id}"/>
	
	</div>
	<div class="mb-3">
	 <label for="formFile" class="form-label">BrandName</label>
	<input type="text" class="form-control" name="brandName" readonly="readonly" value="${dto.name}"/>
	
	</div>	

	name :<div class="mb-3">
	 <label for="formFile" class="form-label">name</label>
	<input type="text" class="form-control" name="name" readonly="readonly" value="${dto.name}"/>
	</div>
	
	runs :<div class="mb-3">
	 <label for="formFile" class="form-label">runs</label>
	<input type="number" class="form-control" name="runs" readonly="readonly" value="${dto.runs}"/>
	</div>
	
	 <select class="from-seect" aria-label="Default select example" name="iplteam" required="required" >
				<option selected value="${dto.iplteam}">${dto.iplteam}</option>
				<c:forEach items="${iplteam}" var="t">
					<option value="${t}">${t}</option>
				</c:forEach>
			</select>
	country :<div class="mb-3">
	 <label for="formFile" class="form-label">country</label>
	<input type="text" class="form-control" name="country" readonly="readonly" value="${dto.country}"/>
	</div>
	
	since :<div class="mb-3">
	 <label for="formFile" class="form-label">since</label>
	<input type="number" class="form-control" name="since" readonly="readonly" value="${dto.since}"/>
	
	<input type="submit" value="update"/>
	</div>
	
	
	</form>

</body>
</html>