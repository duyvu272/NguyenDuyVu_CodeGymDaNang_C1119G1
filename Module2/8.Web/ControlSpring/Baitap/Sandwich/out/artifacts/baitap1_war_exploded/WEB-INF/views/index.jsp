<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2020
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<style>
  /* The container */
  .container {
    display: block;
    position: relative;
    padding-left: 35px;
    margin-bottom: 12px;
    cursor: pointer;
    font-size: 22px;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
  }

  /* Hide the browser's default radio button */
  .container input {
    position: absolute;
    opacity: 0;
    cursor: pointer;
  }

  /* Create a custom radio button */
  .checkmark {
    position: absolute;
    top: 0;
    left: 0;
    height: 25px;
    width: 25px;
    background-color: #eee;
    border-radius: 50%;
  }

  /* On mouse-over, add a grey background color */
  .container:hover input ~ .checkmark {
    background-color: #ccc;
  }

  /* When the radio button is checked, add a blue background */
  .container input:checked ~ .checkmark {
    background-color: #2196F3;
  }

  /* Create the indicator (the dot/circle - hidden when not checked) */
  .checkmark:after {
    content: "";
    position: absolute;
    display: none;
  }

  /* Show the indicator (dot/circle) when checked */
  .container input:checked ~ .checkmark:after {
    display: block;
  }

  /* Style the indicator (dot/circle) */
  .container .checkmark:after {
    top: 9px;
    left: 9px;
    width: 8px;
    height: 8px;
    border-radius: 50%;
    background: white;
  }
</style>
<body>

<h1>Sandwich Condiments</h1>

<form action="/choice" method="post" class="check">
<label class="container">Lettuco
  <input type="checkbox" checked="checked" name="condiments" value="lettuco">
  <span class="checkmark"></span>
</label>
<label class="container">Topato
  <input type="checkbox" name="condiments" value="Topato">
  <span class="checkmark"></span>
</label>
<label class="container">Mustard
  <input type="checkbox" name="condiments" value="Mustard">
  <span class="checkmark"></span>
</label>
<label class="container">Sprouts
  <input type="checkbox" name="condiments" value="Sprouts">
  <span class="checkmark"></span>
</label>
    <input style="display: none " type="checkbox" name="condiments" value="None"  checked>
  <input type="submit" value="save">
</form>

<p>${mess}</p>
<c:forEach items="${list}" var="l">
<p>${l}</p>
</c:forEach>
<form>

</form>




</body>
<script>

</script>
</html>
