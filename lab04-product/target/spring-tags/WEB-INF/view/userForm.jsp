<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/6/2019
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Product</title>
</head>
<body>
Create New Product
<form:form modelAttribute="newUser" id="newUser">
    <p><label for="username">Username: </label><form:input path="username" id="username"/></p>
    <p><label for="password">Password: </label><form:input path="password" id="password"/></p>
    <p><input type="submit" id="submit"/></p>
</form:form>
</body>
</html>
