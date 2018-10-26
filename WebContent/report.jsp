<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<link rel="stylesheet" href="style.css" type="text/css" />

</head>
<body>
	<font color="black" size="5">报修查询</font>
	<form action="${pageContext.request.contextPath }/RegServletshowid">


		按楼号 <input type="text" name="buildingId" /> <input type="submit"
			value="查询" />

	</form>
	<form action="${pageContext.request.contextPath }/RegServletshowdate">
		按日期 <input type="text" name="reportDate" /> <input type="submit"
			value="查询" />

	</form>
</body>
</html>