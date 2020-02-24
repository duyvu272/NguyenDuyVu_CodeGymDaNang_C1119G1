<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2020
  Time: 8:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
            text-align: center;
            padding: 8px;
        }


        tr:nth-child(even) {
            background-color: #dddddd;
        }


        .topnav .search-container {
            float: right;
        }

        .topnav input[type=text] {
            padding: 6px;
            margin-top: 8px;
            font-size: 17px;
            border: none;
            background: antiquewhite;
        }

        .topnav .search-container button {
            float: right;
            padding: 6px 10px;
            margin-top: 8px;
            margin-right: 16px;
            background: #ddd;
            font-size: 17px;
            border: none;
            cursor: pointer;
        }

        .topnav .search-container button:hover {
            background: #ccc;
        }

        @media screen and (max-width: 600px) {
            .topnav .search-container {
                float: none;
            }

            .topnav a, .topnav input[type=text], .topnav .search-container button {
                float: none;
                display: block;
                text-align: left;
                width: 100%;
                margin: 0;
                padding: 14px;
            }

            .topnav input[type=text] {
                border: 6px solid #f5424b;
            }
        }

    </style>

</head>

<body>
<h2 style="text-align:center;">CUSTOMER'S INFORMATION</h2>
<p style="text-align:center">
    <a href="/customer?action=create">
        Add New Customer
    </a>
</p>
<div class="topnav">
    <div class="search-container">
        <form  method="post">
            <input type="text" placeholder="Search.." name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
        </form>
    </div>
</div>
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
            <td style="width:50px; height:50px;text-align:center; "><a href="/customer?action=edit&id=${cus.getId() }">edit</a>
            </td>
            <td style="width:50px; height:50px;text-align:center; "><a href="/customer?action=delete&id=${cus.getId()}">delete</a>
            </td>
            <td style="width:50px; height:50px;text-align:center; "><a href="/customer?action=view&id=${cus.getId()}">View</a>
            </td>
        </tr
    </c:forEach>

</table>
</body>
</html>
