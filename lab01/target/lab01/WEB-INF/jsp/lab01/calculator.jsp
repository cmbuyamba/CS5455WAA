<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>My Calculator</h1>
<form action='Calculator' method='post'>
    <input type = 'text' size = '2' name = 'add1' value = '${add1}' />+<input type = 'text' size = '2' name = 'add2'value = '${add2}' />=<input type = 'text' size = '4' name = 'sum' value = '${sum}' readonly  />
    <br/><input type = 'text' size = '2' name = 'mult1' value = '${mult1}' />*<input type = 'text' size = '2' name = 'mult2' value = '${mult2}'  />=<input type = 'text' size = '4' name = 'product' value = '${product}' readonly  />
    <br/><input type = 'submit' value = 'Submit'/></form>

<a href="index.jsp">Home</a>
</body>
</html>
