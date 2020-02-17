<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/2/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer detail</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" name="name" id="id" value="${requestScope["customer"].getName()}" disabled="disabled"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["customer"].getName()}" disabled="disabled"></td>
            </tr>
            <tr>
                <td>Brithday: </td>
                <td><input type="text" name="email" id="email" value="${requestScope["customer"].getBirthday() }" disabled="disabled"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["customer"].getAddress()}" disabled="disabled"></td>
            </tr>
            <tr>
                <td>Image: </td>
                <td style="width:120px; height:120px; background-color:red;text-align:center; vertical-align:middle">
                    <img src="${requestScope["customer"].getPicture()}" alt="image" style="max-height:100%; max-width:100%"> </td>
            </tr>
            <tr>
                <td></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
