<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/2/2020
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        input[type=text] {
            width: 250px;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 3px solid #ccc;
            -webkit-transition: 0.5s;
            transition: 0.5s;
            outline: none;
        }

        input[type=text]:focus {
            border: 3px solid #555;
        }
        .button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;

            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            width: 100px;
            height: 40px;
        }

        .button4 {border-radius: 12px;}
    </style>
</head>
<body>
<form action="op" method="post">
    <label>Num1</label>
    <input type="text" name="num1" value="">
    <label>Num2</label>
    <input type="text" name="num2" value="">
    <br>
        <input class="button button4" type="submit" name="operator" value="cong">
        <input class="button button4" type="submit" name="operator" value="tru">
        <input class="button button4" type="submit" name="operator" value="nhan">
        <input class="button button4" type="submit" name="operator" value="chia">

</form>
<p>Result : ${sum}</p>
</body>
</html>
