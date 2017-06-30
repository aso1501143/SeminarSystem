<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ゼミ科目の申込</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<form>

		<h1>ゼミ科目申込</h1>
		<br> ・IT<br>
		<c:forEach var="data" items="${requestScope.cf}">
			<c:if test="${data.subjectcf  == 'I' }">
				<ul style="list-style: none;">
					<li><span style="border-bottom: dotted 3px #89abc6;"><c:out
								value="${data.subjectname }" /> <a href="#"
							onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
					</span>
				</ul>
			</c:if>
		</c:forEach>

		・英語<br>
		<c:forEach var="data" items="${requestScope.cf}">
			<c:if test="${data.subjectcf  == 'E' }">
				<ul style="list-style: none;">
					<li><span style="border-bottom: dotted 3px #89abc6;"><c:out
								value="${data.subjectname }" /> <a href="#"
							onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
					</span>
				</ul>
			</c:if>
		</c:forEach>


		・コミュニケーション<br>
		<c:forEach var="data" items="${requestScope.cf}">
			<c:if test="${data.subjectcf  == 'C' }">
				<ul style="list-style: none;">
					<li><span style="border-bottom: dotted 3px #89abc6;"><c:out
								value="${data.subjectname }" /> <a href="#"
							onclick="document.a.subjectid.value='${data.subjectid }'; document,a.submit(); return false;">申し込む</a>
					</span>
				</ul>
			</c:if>
		</c:forEach>



	</form>

	<form name="a" action="G01Select" method="POST">
		<input type="hidden" name="subjectid" value="">
	</form>

</body>
</html>