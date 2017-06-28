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
<c:forEach var="data" items="${requestScope.array}">
		<p>・IT<br>
			<c:if test="${status.count  == 0 }">
				<input type="checkbox" name="q1" value="その3"> 応用情報      <br>
			</c:if>
		</p>




		<p>・英語<br>
				<c:if test="${status.count % 3 == 0 }">
				<input type="checkbox" name="q1" value="その1"> ITパスポート  <br>
				<input type="checkbox" name="q1" value="その2"> 基本情報      <br>
				<input type="checkbox" name="q1" value="その3"> 応用情報      <br>
			</c:if>
		</p>




		<p>・コミュニケーション<br>
			<c:if test="${status.count % 3 == 0 }">
				<input type="checkbox" name="q1" value="その1"> ITパスポート  <br>
				<input type="checkbox" name="q1" value="その2"> 基本情報      <br>
				<input type="checkbox" name="q1" value="その3"> 応用情報      <br>
			</c:if>
		</p>
</c:forEach>
<input type="submit" value="決定">
<input type="submit" value="取り消し">

<br><br><br><a href="login.jsp">トップページへ</a>

</form>
</body>
</html>