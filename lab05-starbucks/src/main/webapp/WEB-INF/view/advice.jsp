<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>
Hello ${user.name} <a href="logout">Log out</a>
<div id='advice'>
    <h2>Ask for advice about your favorite roast:</h2>
    <p/>
    <form action="advice" method="post">
        <select name="roastKey">
            <option value="">--Choose Roast--</option>
            <c:forEach var="roast" items="${roasts}">
                <option value="${roast.key}"> ${roast.value}</option>
            </c:forEach>
        </select>
        <br/><br/>
        <input type="submit" name="advice" value="Submit"/>
    </form>
</div>
</body>
</html>
