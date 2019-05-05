<%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 5/3/2019
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>
<div id='advice'>
    <h2>Ask for advice about your favorite roast:</h2>
    <p />
    <form action = "AdviceServlet" method="post">
        <select name="roast"  >
            <option value="">--Choose Roast--</option>
            <option value="dark">Dark</option>
            <option value="medium">Medium</option>
            <option value="light">Light</option>
        </select>
        <br/><br/>
        <input type="submit" name="advice" value = "Submit" />
    </form>
</div>
<a href="index.jsp">Home</a>
</body>
</html>
