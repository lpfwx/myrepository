<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/loginController/insertUser" method="post">
用户名：<input type="text" name="username"><br><br>
密码：<input type="password" name="password"><br><br>
<input type="submit">
</form>
<a href="<%=request.getContextPath() %>/loginController/login">查询所有用户信息
</a><br>
删除一个用户：
<form action="<%=request.getContextPath() %>/loginController/delete" method="post">
用户ID：<input type="text" name="id">
<input type="submit">
</form>

修改用户信息：
<form action="<%=request.getContextPath() %>/loginController/update" method="post">
id:<input type="text" name="id"><br>
用户名：<input type="text" name="username"><br>
密码：<input type="password" name="password"><br>
电话：<input type="text" name="phone"><br>
邮件：<input type="text" name="email"><br>
角色id：<input type="text" name="roleId"><br>
<input type="submit">
</form>
</body>
</html>