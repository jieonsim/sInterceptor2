<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idCheck</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h4>아이디 중복체크</h4>
		<div>
			<font color="blue">${data}</font>
		</div>
		<p>
			<a href="${ctp}/" class="btn btn-success">돌아가기</a>
		</p>
	</div>
</body>
</html>