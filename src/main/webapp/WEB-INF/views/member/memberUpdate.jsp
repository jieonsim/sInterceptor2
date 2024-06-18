<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberUpdate</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h4>회원 정보 수정</h4>
		<div>
			<font color="blue">${data}</font>
		</div>
<!-- 		<form method="post" action="memberUpdateOk">
			<button type="submit" class="btn btn-primary">회원 정보 수정하기</button>
		</form> -->
		<div class="mt-5">
			<a href="${ctp}/" class="btn btn-success">로그아웃</a>
		</div>
	</div>
</body>
</html>