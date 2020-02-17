<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/2/2020
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CONVERT CURRENCY</title>
  </head>
  <body>
  <form action="/convert" method="post">
    <label >USD</label>
    <input type="text" name="usd" placeholder="input usd" value="${usds}">
  <input type="submit" value="Convert">
</form>
  <form action="/display" method="get">
    <label >VND</label>
    <input type="text" name="vnd" placeholder="vnd" value="${ketqua}">
  </form>
  </body>
</html>
