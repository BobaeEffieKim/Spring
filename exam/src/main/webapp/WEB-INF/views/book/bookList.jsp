<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 리스트</title>
</head>
<body>
	<div>
		<h3>도서 조회/수정</h3>
	</div>
	<table border="1">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>${book.book_no}</td>
					<td>${book.book_name}</td>
					<td>${book.book_coverimg}</td>
					<td><fmt:formatDate value="${book.book_date}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
					<td>${book.book_price}</td>
					<td>${book.book_publisher}</td>
					<td>${book.book_info}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>