<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>注册页</title>
</head>
<body>
欢迎注册，请输入用户名和密码
  <form method="post" action="${pageContext.request.contextPath}/LoginServlet">
  <p>姓名：<input type="text" name="name" size="10"></p>
  <p>密码：<input type="password" name="password" size="10"></p>
  <p><input type="submit" value="确定">
     <input type="reset" value="取消"></p><br>
<a href="register.jsp">管理员注册</a>
  </form>
  </body>
</html>