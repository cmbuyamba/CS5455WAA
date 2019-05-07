<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
Hello ${user.name} <a href="logout">Log out</a>
<form method="get" action="AdviceServlet">
    Starbuck's ${roast} Roast Coffees:
    <table>
        <c:forEach var="advice" items="${advices}" varStatus="status">
            <tr style="background-color: ${status.index %2 eq 0? 'cyan':'yellow'}">
                <td>${advice}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="advice">Advice</a>
</form>
</body>
</html>
