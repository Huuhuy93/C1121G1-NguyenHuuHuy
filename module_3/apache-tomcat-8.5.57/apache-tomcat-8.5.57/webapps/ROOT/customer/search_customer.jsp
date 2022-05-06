<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/23/2022
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<center>
  <h1>Result Search By Name</h1>
  <h2>
    <a href="/customer">Back to Customer List</a>
  </h2>
</center>
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of Customer</h2></caption>
    <tr>
      <th>ID</th>
      <th>NAME</th>
      <th>BIRTHDAY</th>
      <th>GENDER</th>
      <th>ID CARD</th>
      <th>PHONE</th>
      <th>EMAIL</th>
      <th>ADDRESS</th>
      <th>TYPE</th>
    </tr>
    <c:forEach var="customer" items="${customerDTOList}">
      <tr>
        <td><c:out value="${customer.customerId}"/></td>
        <td><c:out value="${customer.customerName}"/></td>
        <td><c:out value="${customer.customerBirthday}"/></td>

        <c:if test="${customer.customerGender==0}">
          <td><c:out value="Female"/></td>
        </c:if>
        <c:if test="${customer.customerGender==1}">
          <td><c:out value="Male"/></td>
        </c:if>

        <td><c:out value="${customer.customerIdCard}"/></td>
        <td><c:out value="${customer.customerPhone}"/></td>
        <td><c:out value="${customer.customerEmail}"/></td>
        <td><c:out value="${customer.customerAddress}"/></td>
        <td><c:out value="${customer.customerTypeName}"/></td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>
