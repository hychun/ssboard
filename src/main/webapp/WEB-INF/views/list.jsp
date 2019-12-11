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
		<table class="table table-sm">
			<thead>
				<tr>
					<th scope="col">No</th>
					<th scope="col">Category</th>
					<th scope="col">Title</th>
					<th scope="col">Read</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item">
					<tr>
						<th scope="row"><a href="/view?no=${item.no}">${item.no}</a></th>
						<td><a href="/view?no=${item.no}">${item.category}</a></td>
						<td><a href="/view?no=${item.no}">${item.title}</a></td>
						<td><a href="/view?no=${item.no}">${item.readCount}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
		<div align="right">
			<input class="btn btn-primary" type="button" value="Write" onClick="location.href='/writeform'">
		</div>	
	</div>
</body>
</html>