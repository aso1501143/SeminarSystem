<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove</title>
</head>
<body>



<form action="<%= request.getContextPath() %>/G01Sure" method="POST">

 <style>
td, tr {
padding: 15px 15px;
}
</style>





<table height="20" border="1">
  <caption>科目の削除</caption>
  <tr>
    <td title="セル2-1"></td><td><input type="radio"></td><tr>
    <td title="セル2-1"></td><td><input type="radio"></td><tr>
     <td title="セル2-1"></td><td><input type="radio"></td><tr>
  </tr>

</table>


<input type="submit" value="決定"> <input type="reset" value="取り消し">


<br><br><br><a href="login.jsp">トップページへ</a>

</form>
</body>
</html>

