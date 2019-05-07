<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>

Login:
<form action = "login" method = "post">
    Name: <input type = "text" name = "name" size = "9" value="${user.name}" /><br/>
    Password: <input type = "password" name = "password" size = "9" value="${user.password}"/><br/>
    <br/>
    <input type="submit" value="Log In"/>
</form>
</body>
</html>
