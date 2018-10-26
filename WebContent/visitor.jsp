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
<form action="${pageContext.request.contextPath}/addVistorServlet">
			<table border="1px" align="center" widhth="520px" height="110px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
				<tr>
					<td colspan="4" align="center">
						<font color="black" size="5">来访登记</font>(*为必填项)</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">楼号</td>
					<td><input type="text" name="buildingid" required="required" style="color:white" />*</td>
					<td align="center" width="150px" height="30px">房号</td>
					<td>
						<input type="text" name="houseid" required="required" style="color:white" />*
					</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">被访人姓名</td>
					<td><input type="text" name="bevistname" required="required" style="color:white" />*</td>
					<td align="center" width="150px" height="30px">来访人姓名</td>
					<td><input type="text" name="vistname" required="required" style="color:white" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">所属关系</td>
					<td>
						<select name="relative" style="color:white;background-color: blue;">
							<option value="亲人" selected="selected">亲人</option>
							<option value="朋友">朋友</option>
							<option value="同学">同学</option>
							<option value="其他">其他</option>
						</select>*
					</td>
					<td align="center" width="150px" height="30px">来访时间</td>
					<td><input type="datetime-local" name="date" style="color:blue" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">证件号码</td>
					<td><input type="text" name="idnumber" required="required" style="color:white" />*</td>
					<td align="center" width="150px" height="30px">证件名称</td>
					<td><input type="text" name="idtype" required="required" style="color:white" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">值班人</td>
					<td><input type="text" name="dutyname" required="required" style="color:white" />*</td>
					<td colspan="4" align="center">
						<input type="submit" value="登记" />&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重填" />
					</td>
				</tr>
				
			</table>
		</form>
</body>
</html>