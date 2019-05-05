<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/5/2019
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<h2>Calculator</h2>
<form action="calculator" method="post">
    <p><input name="add1" type="text" size="2" value="${calculator.add1}"/>
        +
        <input name="add2" type="text" size="2" value="${calculator.add2}"/> =
        <input name="sum" type="text" size="4" readonly value="${calculator.sum}"/>
    </p>
    <p><input name="mult1" type="text" size="2" value="${calculator.mult1}"/>
        *
        <input name="mult2" type="text" size="2" value="${calculator.mult2}"/> =
        <input name="product" type="text" size="4" readonly value="${calculator.product}"/>
    </p>
    <p>
        <input type="submit" value="Submit"/>
    </p>
</form>
</body>
</html>
