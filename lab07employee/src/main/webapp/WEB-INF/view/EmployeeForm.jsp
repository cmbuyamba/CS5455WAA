<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Employee Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
    <form:form modelAttribute="employee" action="employee_save" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend>Add an employee</legend>
            <p>
                <form:errors path="*" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="firstName"><spring:message code="employee.form.firstName"/></label>
                    <form:input path="firstName"/>

            <div style="text-align: center;">
                <form:errors path="firstName" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="lastName"><spring:message code="employee.form.lastName"/> </label>
                    <form:input path="lastName"/>

            <div style="text-align: center;">
                <form:errors path="lastName" cssStyle="color : red;"/>
            </div>
            </p>

            <p>
                <label for="birthDate"><spring:message code="employee.form.birthDate"/> </label>
                <form:input path="birthDate" id="birthDate"/>
                <form:errors path="birthDate" cssStyle="color : red;"/>
            </p>
            <p>
                <label for="id">ID: </label>
                    <form:input path="id" id="id"/>

            <div style="text-align: center;">
                <form:errors path="id" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="salaryLevel">Salary: </label>
                    <form:input path="salaryLevel" id="salaryLevel"/>

            <div style="text-align: center;">
                <form:errors path="salaryLevel" cssStyle="color : red;"/>
            </div>
            </p>
            <h4>Address:</h4>
            <p>
                <label for="street"><spring:message code="employee.form.address.street"/> </label>
                    <form:input path="address.street" id="street"/>
            <div style="text-align: center;">
                <form:errors path="address.street" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                <label for="state"><spring:message code="employee.form.address.state"/> </label>
                    <form:input path="address.state" id="state"/>

            <div style="text-align: center;">
                <form:errors path="address.state" cssStyle="color : red; "/>
            </div>
            </p>
            <p>
                <label for="zipCode"><spring:message code="employee.form.address.zipCode"/> </label>
                    <form:input path="address.zipCode" id="zipCode"/>

            <div style="text-align: center;">
                <form:errors path="address.zipCode" cssStyle="color : red; "/>
            </div>
            </p>
            <div>
                <label for="image"><spring:message code="employee.form.image"/></label>
                <form:input id="image" path="image" type="file"/>
            </div>

            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5"
                       value="Add Employee">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
