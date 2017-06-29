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
<form>

		<h1>ゼミ科目申込</h1>
<c:forEach var="data" items="${requestScope.cf}">
	<br>
		
		<c:if test="${data.subjectcf  == 'I' }">
		<c:forEach begin="1" end="1" step="1">
		・IT<br>
		</c:forEach>

	<ul style="list-style:none;">
		<li>
		<span style="border-bottom:dotted 3px #89abc6;"><c:out value="${data.subjectname }" />
		<a href="#" onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
　　</span>
	</ul>
		</c:if>
		
		<c:if test="${data.subjectcf  == 'E' }">
		<c:forEach begin="1" end="1" step="1">
		・英語<br>
		</c:forEach>

	<ul style="list-style:none;">
		<li>
		<span style="border-bottom:dotted 3px #89abc6;"><c:out value="${data.subjectname }" />
		<a href="#" onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
　　</span>
	</ul>
		</c:if>

		
		<c:if test="${data.subjectcf  == 'C' }">
		<c:forEach begin="1" end="1" step="1">
		・コミュニケーション<br>
		</c:forEach>

	<ul style="list-style:none;">
		<li>
		<span style="border-bottom:dotted 3px #89abc6;"><c:out value="${data.subjectname }" />
		<a href="#" onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
　　</span>
	</ul>
		</c:if>


</c:forEach>

<input type="submit" value="決定"> <input type="submit" value="取り消し"> <br><br><br><a href="login.jsp">トップページへ</a>
</form>

<form name="a"action="G01Select" method="POST">
<input type="hidden" name="subjectid" value="">
</form>

</body>
</html>