
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2020
  Time: 8:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>

</head>

<body>
<table>
    <tr>
        <th>Ten</th>
        <th>Ngay sinh</th>
        <th>Dia Chi</th>
        <th>Anh</th>
    </tr>
    <c:forEach items="${customers}" var="cus">
        <tr>
            <td>${cus.getName()}</td>
            <td>${cus.getName()}</td>
            <td>${cus.getName()}</td>
            <td><img src="${cus.getName()}" alt="Italian Trulli"></td>
        </tr
        </c:forEach>

</table>
</body>
</html>
