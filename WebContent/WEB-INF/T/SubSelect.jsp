<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>教科選択画面</title>

<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">

</head>
<body>
<h1>選択</h1>
<center>
	<c:forEach var="data" items="${requestScope.semi}" varStatus="status">
	<a href="#" onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;"><c:out value="${data.subjectname }"/></a>
	</c:forEach>
	<form name="a"action="T01SubSelect" method="POST">
<input type="hidden" name="subjectid" value="">
</form>
	</center>
</body>
</html>