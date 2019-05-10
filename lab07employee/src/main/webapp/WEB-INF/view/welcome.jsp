<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Welcome</title>
    <style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style>
</head>

<body>
<div id="global">
    <H2>WELCOME</H2>
    <a href="?language=en">English</a> | <a href="?language=nl_NL">Nepali</a> | <a href="?language=zh_CN">Chinese</a>

    <form action="employee_input" method="get">
        <input id="submit" type="submit"
               value="Add product">
    </form>
</div>
</body>
</html>