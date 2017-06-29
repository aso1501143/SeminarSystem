<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ゼミ科目の申込</title>
</head>
<body>
<form action="/G01Select" method="POST">
	　　<b>ゼミ科目申込</b><br />

	
		<c:forEach var="data" items="${requestScope.cf}" varStatus="status">
			<c:if test="${data.subjectcf  == 'I' }">
			
				<input type="checkbox" name="IT" value="${data.subjectid}"><c:out value="${data.subjectname }" />      <br>
			
			</c:if>
		
	
		
			<c:if test="${data.subjectcf  == 'E' }">
			<p>・英語</p>
			
				<input type="checkbox" name="English" value="${data.subjectid}"> <c:out value="${data.subjectname }" />      <br>
		
			</c:if>
		
		
			<c:if test="${data.subjectcf  == 'C' }">
		
			<p>・コミュニケーション</p>

				<input type="checkbox" name="Communication" value="${data.subjectid}"> <c:out value="${data.subjectname }" />     <br>
			</c:if>
</c:forEach>
<input type="submit" value="決定">
<input type="submit" value="取り消し">

<br><br><br><a href="StudentTop.jsp">トップページへ</a>

</form>
</body>
</html>