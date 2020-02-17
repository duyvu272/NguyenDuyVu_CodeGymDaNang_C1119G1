<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2020
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Directory</title>
    <style>
      input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
      }

      input[type=submit] {
        width: 50%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-left:auto;
        margin-right:auto;
        display:block
      }

      input[type=submit]:hover {
        background-color: #45a049;
      }

      div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
      }
    </style>
  </head>
  <body>
  <form action="/input" method="post">
    <label>English</label>
    <input type="text" name="english" placeholder="input words" value="${en}">
    <input type="submit" value="translate">
  </form>
  <form action="output" method="get">
    <label>VietNam</label>
    <input type="text" name="vietnam" placeholder="input words" value="${vn}">
  </form>
  </body>
</html>
