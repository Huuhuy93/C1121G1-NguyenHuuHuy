<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2022
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<h2>Danh sách khách hàng</h2>
<table class="table">
  <thead class="thead-dark">
  <tr>
    <th scope="col">ORDER</th>
    <th scope="col">NAME</th>
    <th scope="col">DATE OF BIRTH</th>
    <th scope="col">ADDRESS</th>
    <th scope="col">IMAGES</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="i" items="${list1}">
    <tr>
      <td>${i.order}</td>
      <td>${i.name}</td>
      <td>${i.dateOfBirth}</td>
      <td>${i.address}</td>
      <td><img width="100" height="100" src="${i.images}" alt=""></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<div class="d-flex justify-content-center">
  <a href="/person">
    <button  name="display" type="button" class="btn btn-primary">Display Customer</button>
  </a>
</div>
</body>
</html>
