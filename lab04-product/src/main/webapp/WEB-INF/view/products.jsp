<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <link href="resources/css/main.css" rel="stylesheet">
</head>
<body>
<div id="global">
    <h2>List of Products</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
        </tr>

        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.category.name}</td>
                <td>${product.description}</td>
            </tr>
        </c:forEach>
    </table>

    <form action="product" method="get">
        <input id="submit" type="submit" value="Add product">
    </form>

</div>
</body>
</html>