<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style>
	table, tr, th, td{
		border : 1px solid darkgray;
	}
</style>
</head>
<body>
	<button type="button" onclick="location.href='insertForm'">등록</button>
	<table>
		<thead>
			<tr>
				<td>employee_id</td>
				<td>first_name</td>
				<td>last_name</td>
				<td>email</td>
				<td>hire_date</td>
				<td>job_id</td>
				<td>salary</td>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${empList}">
			<tr onclick="location.href='getInfo?employeeId=${emp.employeeId}'">
				<td>${emp.employeeId}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.email}</td>
				<td>${emp.hireDate}</td>
				<td>${emp.jobId}</td>
				<td>${emp.salary}</td>
				<td><button type="button" onclick="deleteInfo(${emp.employeeId}, event)">삭제</button></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	
<script>
	function deleteInfo(id, event){
		event.stopPropagation();
		location.href='deleteInfo/' + id;
	}
</script>
</body>
</html>