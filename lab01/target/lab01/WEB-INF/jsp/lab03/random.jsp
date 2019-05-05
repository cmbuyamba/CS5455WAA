<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Random</title>
    <style type="text/css">
        body{
            font-family: Helvetica;
        }
        div{
            background-color: antiquewhite;
            width: 40%;
        }
        h2{
            color: purple;
        }
        .equal{
            color: blue;
        }
        .greater{
            color: green;
        }
        .less{
            color: red;
        }
    </style>
</head>
<body>
<c:forEach varStatus="status" var="item" items="${randomModel.generatedNumbers}">
    <c:choose>
        <c:when test="${status.index eq 0 and randomModel.randomNumber eq item}">
            <div class="equal">
                <h2>And the results are:</h2>
                The number ${item} is equal to ${randomModel.randomNumber}
            </div>
        </c:when>
        <c:when test="${status.index eq 1 and randomModel.randomNumber gt item}">
            <div class="greater">
                <h2>And the results are:</h2>
                The number ${item} is less than ${randomModel.randomNumber}
            </div>
        </c:when>
        <c:when test="${status.index eq 2 and randomModel.randomNumber lt item}">
            <div class="less">
                <h2>And the results are:</h2>
                The number ${item} is greater than ${randomModel.randomNumber}
            </div>
        </c:when>
    </c:choose>
</c:forEach>
<div>
    <h2>And the results are:</h2>
    The number ${randomModel.randomNumber}
    <c:forEach varStatus="status" var="item" items="${randomModel.generatedNumbers}">

        <c:choose>
            <c:when test="${status.index eq 0 and randomModel.randomNumber != item}">
                <div class="equal">
                    is NOT equal to ${item}
                </div>
            </c:when>
            <c:when test="${status.index eq 1 and randomModel.randomNumber >= item}">
                <div class="greater">
                    is NOT less than ${item}
                </div>
            </c:when>
            <c:when test="${status.index eq 2 and randomModel.randomNumber <= item}">
                <div class="less">
                    is NOT greater than ${randomModel.randomNumber}
                </div>
            </c:when>
        </c:choose>
    </c:forEach>
</div>
<a href="index.jsp">Home</a>
</body>
</html>