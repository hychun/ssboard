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
		<form action="/write" method="post">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">
							<c:choose>
								<c:when test="${empty no}">글쓰기</c:when>
								<c:otherwise>글수정</c:otherwise>
							</c:choose>
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<button class="btn btn-outline-secondary dropdown-toggle"
										type="button" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">Category</button>
									<div class="dropdown-menu">
										<a class="dropdown-item" href="#">일반</a> <a
											class="dropdown-item" href="#">Another action</a> <a
											class="dropdown-item" href="#">Something else here</a>
										<div role="separator" class="dropdown-divider"></div>
										<a class="dropdown-item" href="#">Separated link</a>
									</div>
								</div>
								<input type="text" class="form-control" name="category"
									aria-label="Text input with dropdown button"
									value="${article.category}">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text">Title</span>
								</div>
								<input class="form-control" aria-label="With textarea" name="title"
									value="${article.title}">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text">Content</span>
								</div>
								<textarea class="form-control" aria-label="With textarea" name="content">${article.content}</textarea>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<p>
			<div align="right">
				<input class="btn btn-primary" type="submit" value="Save">&nbsp;
				<input class="btn btn-primary" type="button" value="Cancel"
					onClick="location.href='/list'">
			</div>
		</form>
	</div>
</body>
</html>