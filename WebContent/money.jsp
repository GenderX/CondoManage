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
<form action="${pageContext.request.contextPath }/HCostsetting">
			<table border="1px" align="center" widhth="520px" height="110px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
				<tr>
					<td colspan="4" align="center">
						<font color="black" size="5">设置费用标准</font>(*为必填项)</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">楼号</td>
					<td><input type="text" name="buildingId" required="required" style="color:white" />*</td>
					<td align="center" width="150px" height="30px">住宿费用</td>
					<td><input type="text" name="livingFee" required="required" style="color:white" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">水表底数</td>
					<td><input type="text" name="waterBase" required="required" style="color:white" />吨/每月*</td>
					<td align="center" width="150px" height="30px">水价</td>
					<td><input type="text" name="waterPrice" required="required" style="color:white" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">电表底数</td>
					<td><input type="text" name="eleBase" required="required" style="color:white" />度/每月*</td>
					<td align="center" width="150px" height="30px">电价</td>
					<td><input type="text" name="elePrice" required="required" style="color:white" />*</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">备注</td>
					<td><input type="text" name="note" style="color:white" /></td>
					<td colspan="4" align="center">
						<input type="submit" value="设置" />&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重置" />
					</td>
				</tr>
				
			</table>
		</form>
</body>
</html>