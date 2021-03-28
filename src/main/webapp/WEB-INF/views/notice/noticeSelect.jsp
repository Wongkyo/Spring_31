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
	<h2> NOTICE </h2>
	
	<table class="table">
		<thead class="thead-light">
			<tr>
				<th>Title</th>
				<th>Writer</th>
				<th>Regdate</th>
				<th>Hit</th>		
			</tr>
		</thead>
		
		<tbody>
			<tr>
				<td>${dto.title}</td>
				<td>${dto.writer}</td>
				<td>${dto.regdate}</td>
				<td>${dto.hit}</td>
			</tr>
		</tbody>
	</table>
	
	<h3>contents</h3>
	${dto.contents}<br>
	
	<a href="./noticeDelete?num=${dto.num}">Delete</a>
	<a href="./noticeUpdate?num=${dto.num}">Update</a><br>
	
</body>
</html>