<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/2/2020
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>

<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["customer"].getName()}"></td>
            </tr>
            <tr>
                <td>Brithday: </td>
                <td><input type="text" name="email" id="birthday" value="${requestScope["customer"].getBirthday()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["customer"].getAddress()}"></td>
            </tr>
            <tr>
                <td>Image: </td>
                <td style="width:70px; height:70px; background-color:red;text-align:center; vertical-align:middle">
                    <img src="${requestScope["customer"].getPicture()}" alt="image" style="max-height:100%; max-width:100%"> </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete customer"></td>
                <td><a href="/customer">Back Main Menu</a></td>
            </tr>>
        </table>
    </fieldset>
</form>
</body>
</html>