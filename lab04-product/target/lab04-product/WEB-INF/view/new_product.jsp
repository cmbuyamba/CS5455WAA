<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page isELIgnored="false" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <link href="resources/css/main.css" rel="stylesheet">
</head>
<body>

<div id="global">
    <form:form modelAttribute="newProduct" action="product">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="category"><spring:message code="product.category"/> </label>
                <form:select id="category" path="category.id">
                    <form:option value="0" label="--Select Category"/>
                    <form:options items="${categories}" itemLabel="name" itemValue="id"/>
                </form:select>
            </p>

            <p>
                <label for="name"><spring:message code="product.name"/></label>
                <form:input id="name" path="name"/>
            </p>
            <p>
                <label for="description"><spring:message code="product.description"/></label>
                <form:input path="description"/>
            </p>
            <p>
                <label for="price"><spring:message code="product.price"/></label>
                <form:input path="price"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" value="<spring:message code="product.reset" />">
                <input id="submit" type="submit" value="<spring:message code="product.submit" />">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
