<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">

<script type="text/javascript">
	function change() {
		document.form.action = "G01Change";

	}

	function sakujo() {
		document.form.action = "G01Remove";

	}
</script>
</head>
<body>



	<form name="form" method="POST" onSubmit="return check()">

		<h1>科目の確認</h1>
		<center>
		<table border="1" class="table-design-set-1">
			<tr>
				<th>科目の確認</th>	
			</tr>
		<c:forEach var="data" items="${requestScope.array}" varStatus="status">
			<tr align="center">
			<tr>
				<td><c:out value="${data.subjectname}" /></td>
			</tr>
			</c:forEach>
		</table>

			<button type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-ok-sign"></span>変更
		</button>
		<button type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-remove-sign"></span>削除
		</button>
		</center>
		<br> <a href="login.jsp">トップページへ</a>

	</form>

</body>
</html>