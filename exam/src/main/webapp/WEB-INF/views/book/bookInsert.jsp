<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>

</head>
<body>
	<form name="insertForm" action="insert" method="POST" onsubmit="return false">
		<div>
			<h3>도서 등록</h3>
		</div>
		<table id="bookInsert" >
			
				<tr>
					<th>도서번호</th>
					<td><input type="number" name="book_no"></td>
				</tr>
				<tr>
					<th>도서명</th>
					<td><input type="text" name="book_name"></td>
				</tr>
				<tr>
					<th>도서표지</th>
					<td><input type="text" name="book_coverimg"></td>
				</tr>
				<tr>
					<th>출판일자</th>
					<td><input type="date" name="book_date"></td>
				</tr>
				<tr>
					<th>금액</th>
					<td><input type="number" name="book_price"></td>
				</tr>
				<tr>
					<th>출판사</th>
					<td><input type="text" name="book_publisher"></td>
				</tr>
				<tr>
					<th>도서소개</th>
					<td><textarea name="book_info"></textarea></td>
				</tr>
		</table>
		<button type="submit" onclick="formWarn()">등록</button>
		<button type="button" onclick="href="${pageContext.request.contextPath}/list">조회</button>
		
	</form>
	<script>
		function formWarn() {
			let bookName = document.getElementsByName('book_name')[0];
			
			if(bookName.value == ""){
				alert("도서명이 입력되지 않았습니다.");
				bookName.focus();
				return;
			} else{
				alert("도서등록이 완료되었습니다.");
				insertForm.submit();
			}
		}
		
	</script>
</body>
</html>