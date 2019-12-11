<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>SSBoard List</title>
</head>
<body>
	<div class="container">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Title</th>
					<th scope="col">${article.title}</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">Category</th>
					<td>${article.category}</td>
				</tr>
				<tr>
					<th scope="row">Content</th>
					<td>${article.content}</td>
				</tr>
				<tr>
					<th scope="row">Write</th>
					<td>${article.writeDate}</td>
				</tr>
				<tr>
					<th scope="row">Read</th>
					<td>${article.readCount}</td>
				</tr>
			</tbody>
		</table>
		<p>
		
		<div align="right">
			<input class="btn btn-primary" type="button" value="Modify" onClick="location.href='/modifyform?no=${article.no}'">&nbsp;
			<input class="btn btn-primary" type="button" value="Write" onClick="location.href='/writeform'">&nbsp;
			<input class="btn btn-primary" type="button" value="List" onClick="location.href='/list'">
		</div>
	</div>
</body>
</html>