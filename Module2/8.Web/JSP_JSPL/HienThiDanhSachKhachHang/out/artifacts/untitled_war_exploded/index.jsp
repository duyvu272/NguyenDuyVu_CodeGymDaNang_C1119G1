<%@ page import="java.util.List" %>
<%@ page import="model.Customer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
;
<%--
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2020
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<%
  List<Customer> customer = Customer.getList() ;
    request.setAttribute("custom",customer);
%>
<body>
<div>
  <h2 id="h2">Danh Sách Khách Hàng</h2>
  <br/>
  <table border="1" >
    <thead>
    <tr>
      <th class="th">Họ Tên</th>
      <th class="th">Ngày Sinh</th>
      <th class="th">Địa Chỉ</th>
      <th class="th">Hình Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cus" items="${custom}">
      <tr>
        <td><c:out value="${cus.ten}"/></td>
        <td><c:out value="${cus.ngaysinh}"/></td>
        <td><c:out value="${cus.diachi}"/></td>
        <td > <img style="width: 150px ; height: 100px" src="<c:out value="${cus.image}" />"></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>