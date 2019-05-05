<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Calculator Form</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div id="global">
    <c:if test="${errors != null}">

        <p id="errors">
            Error(s)!
        <ul>
            <c:forEach var="error" items="${errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>


    </c:if>

    <form action="calculate" method="post">
        <fieldset>
            <legend>Numbers </legend>
            <p>
                <input type="number" id="add1" name="add1" value="${calculator.add1}">
                +<input type="number" id="add2" name="add2" value="${calculator.add2}">
                =
                <input type="number" id="sum" name="sum" value="${sum}" readonly>
            </p>
            <legend>Add number</legend>
            <p>
                <input type="number" id="mult1" name="mult1" value="${calculator.mult1}">
                +<input type="number" id="mult2" name="mult2" value="${calculator.mult2}">
                =
                <input type="number" id="product" name="sum" value="${product}" readonly>
            </p>
            <p id="buttons">
                <input id="reset" type="reset">
                <input id="submit" type="submit" value="Calculate">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
