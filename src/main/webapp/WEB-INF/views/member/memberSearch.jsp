<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberSearch</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h4>회원 정보 조회</h4>
		<div>
			<font color="blue">${data}</font>
		</div>
		<p>
			<a href="${ctp}/" class="btn btn-success">로그아웃</a>
		</p>
	</div>
</body>
</html>