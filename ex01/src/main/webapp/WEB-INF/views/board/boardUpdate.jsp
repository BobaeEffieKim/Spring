<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<form name="updateForm" action="update" method="POST" onsubmit="return false">
		<div>
			<h3>게시글 수정</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${board.bno}" readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="${board.title}"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" readonly value="${board.writer}"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents">${board.contents}</textarea></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="image" value="${board.image}"></td>
			</tr>
			
		</table>
		<button type="submit" onclick="formOption()">수정</button>
		<button type="button">목록</button>
	</form>
	<script>
		function formOption(){
			let title = document.getElementsByName('title')[0];
			let image = document.getElementsByName('image')[0];
			let contents = document.getElementsByName('contents')[0];
			
			if(title.value == ""){
				alert("제목이 입력되지 않았습니다.");
				return;
			}
			
			if(image.value == ""){
				alert("사진이 첨부되지 않았습니다.");
				return;
			}
			
			if(contents.value == ""){
				alert("내용이 입력되지 않았습니다.");
				contents.focus();
				return;
			}
			
			updateForm.submit();
		}
	</script>
</body>
</html>