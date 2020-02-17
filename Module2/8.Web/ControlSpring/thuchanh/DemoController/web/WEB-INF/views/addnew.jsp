<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 2/14/2020
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
<div class="col-md-5">
<h3>Form Add new Student</h3>
<form:form modelAttribute="student" action="/student/addnew" method="post">
    <div class="form-group">
    <label for="id">Id:</label>
        <form:input path="id" cssClass="form-control"/><br/>
    </div>
    <div class="form-group">
    <label for="name">Name:</label>
        <form:input path="name" cssClass="form-control"/><br/>
    </div>
    <div class="form-group">
    <label for="address">Address:</label>
        <form:input path="address" cssClass="form-control"/><br/>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
    </div>
    </div>

    </body>
    </html>
