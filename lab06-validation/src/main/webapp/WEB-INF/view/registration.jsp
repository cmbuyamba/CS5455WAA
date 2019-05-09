<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br/>
<form:form method="post" modelAttribute="student">
    <table>
        <!--tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr-->
        <tr>
            <td>Id :</td>
            <td><form:input path="id"/> <form:errors path="id" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>FirstName :</td>
            <td><form:input path="firstName"/>
                <form:errors path="firstName" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>LastName :</td>
            <td><form:input path="lastName"/>
                <form:errors path="lastName" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><form:input path="email"/>
                <form:errors path="email" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>Birthday :</td>
            <td><form:input path="birthday" placeholder="MM/dd/yyyy"/>
                <form:errors path="birthday" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>Phone :</td>
            <td><form:input path="phone.area" cssStyle='width:3em'/>
                <form:errors path="phone.area" cssStyle="color : red;"/>
                <form:input path="phone.prefix" cssStyle='width:3em'/>
                <form:errors path="phone.prefix" cssStyle="color : red;"/>
                <form:input path="phone.number" cssStyle='width:4em'/>
                <form:errors path="phone.number" cssStyle="color : red;"/>
            </td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td><form:select path="gender">
                <form:option value="" label="Select Gender"/>
                <form:option value="Male" label="Male"/>
                <form:option value="Female" label="Female"/>
            </form:select></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save Changes"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>