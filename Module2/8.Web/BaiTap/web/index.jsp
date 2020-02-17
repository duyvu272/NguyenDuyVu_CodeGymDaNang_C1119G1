<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2020
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount</title>
  </head>
  <body>
  <h2>Informations</h2>
  <form action = "/discounta" method="post">
    <input type="text" name="descriptions" placeholder="Description product"><br/>
    <input type="text" name="price" placeholder="Price"><br/>
    <input type="text" name="discount" placeholder="Discount"><br/>
    <input type="submit" name="submit" value="Calculate Discount">
  </form>
  </body>
</html>
