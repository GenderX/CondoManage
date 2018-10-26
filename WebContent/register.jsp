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
	<form  method="post" action="${pageContext.request.contextPath}/RegisterPropertyServlet">
		<table border="1px" align="center" width="520px" height="110px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
			<tr>
				<td colspan="4" align="center"><font size="5" color="black">维修登记</font>(*为必填项)</td>
			</tr>
			<tr>
				<td align="center">楼号</td>
				<td> <input type="text" name="buildingId" required="required" style="color:white" />*</td>
				<td align="center">房号</td>
				<td><input type="text" name="roomId" required="required" style="color:white" />*</td>
			</tr>
			<tr>
				<td align="center">原因</td>
				<td colspan="3" >
				<textarea name="reason" style="color:white;background-color: blue;">
				
				</textarea>*
				</td>
			</tr>
			<tr>
				<td align="center">日期</td>
				<td><input type="text" name="registerDate" />*</td>
				<td colspan="2"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>