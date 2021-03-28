<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   
   <c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container"></div>
	<h2>Notice Update Form</h2>
	
	<form action="./noticeUpdate" method="post">
	  <input type="hidden" name="num" value="${dto.num}"><br>
	  Title : <input type="text" name="title" value= "${dto.title}"><br>
	  Contents : <input type="text" name="contents" value="${dto.contents}"><br>
		<button>Update</button>
	</form>
	
</body>
</html>