<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>

Login:
<form action = "AuthenticationServlet" method = "post">
    Name: <input type = "text" name = "name" size = "9" /><br/>
    Password: <input type = "password" name = "password" size = "9" /><br/>
    <br/>
    <input type="submit" value = "Log In"/>
</form>
<a href="index.jsp">Home</a>
</body>
</html>
