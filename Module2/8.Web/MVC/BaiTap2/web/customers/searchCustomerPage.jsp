<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/2/2020
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<html>
<head>
    <title>Edit customer</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

    </style>
</head>
<body>
<h1>Finding customer</h1>

<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>List Customer information</legend>
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
                    <td>${cus.getBirthday()}</td>
                    <td>${cus.getAddress()}</td>
                    <td style="width:70px; height:70px; background-color:red;text-align:center; vertical-align:middle">
                        <img src="${cus.getPicture()}" alt="image" style="max-height:100%; max-width:100%"></td>
                    <td style="width:50px; height:50px;text-align:center; "><a
                            href="/customer?action=edit&id=${cus.getId() }">edit</a>
                    </td>
                    <td style="width:50px; height:50px;text-align:center; "><a
                            href="/customer?action=delete&id=${cus.getId()}">delete</a>
                    </td>
                    <td style="width:50px; height:50px;text-align:center; "><a
                            href="/customer?action=view&id=${cus.getId()}">View</a>
                    </td>
                </tr
            </c:forEach>

        </table>
    </fieldset>
</form>
</body>
</html>
