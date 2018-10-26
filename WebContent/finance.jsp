<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style>
	input[type='text']{
		background-color: blue;
	}
</style>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/addHousethingServlet">
		<table border="1px" align="center" width="900px" height="450px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
			<tr>
				<td colspan="4" align="center" width="900px" height="50px"><font size="5">房间重要财务录入</font>(*为必填项)</td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">楼号</td>
				<td>
					<input type="text" name="buildingid" required="required" style="color:white" />*
				</td>
				<td align="center" width="150px" height="30px">房号</td>
				<td>
					<input type="text" name="roomid" required="required" style="color:white" />*
				</td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">门的数量</td>
				<td>
					<input type="text" name="door_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td>
					<input type="text" name="door_stat" style="color:white" />
				</td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">柜子的数量</td>
				<td>
					<input type="text" name="cab_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td><input type="text" name="cab_stat" style="color:white" /></td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">桌子的数量</td>
				<td>
					<input type="text" name="desk_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td><input type="text" name="desk_stat" style="color:white" /></td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">椅子的数量</td>
				<td>
					<input type="text" name="chair_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td><input type="text" name="chair_stat" style="color:white" /></td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">灯的数量</td>
				<td>
					<input type="text" name="light_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td><input type="text" name="light_stat" style="color:white" /></td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">电风扇的数量</td>
				<td>
					<input type="text" name="fan_num" style="color:white" />
				</td>
				<td align="center" width="150px" height="30px">现状描述</td>
				<td><input type="text" name="fan_stat" style="color:white" /></td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">其他</td>
				<td>
					<input type="text" name="others" style="color:white" />
				</td>
				<td colspan="2" align="center">
					<input type="submit" value="录入" />
					<input type="reset" value="重置" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>