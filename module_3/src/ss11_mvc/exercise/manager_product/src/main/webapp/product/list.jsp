<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/14/2022
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<!-- Image and text -->
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <img src="https://vnpeace.com/storage/news/209/1614227720_Artboard%206.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
        Product
    </a>
</nav>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">ORDER</th>
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">DETAIL</th>
        <th scope="col">PRICE</th>
        <th scope="col">UPDATE</th>
        <th scope="col">DELETE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items='${requestScope["productList"]}' varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${product.getId()}</td>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getDetail()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=update&id=${product.getId()}">update</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div class="d-flex justify-content-center">
    <a href="/products?action=create">
        <button  name="create" type="button" class="btn btn-primary">Create new Product</button>
    </a>
</div>

</body>
</html>
