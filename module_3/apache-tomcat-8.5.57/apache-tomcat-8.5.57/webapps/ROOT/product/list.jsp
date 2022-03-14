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
</head>
<body>
<h2>Products</h2>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>

<table border="1">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>DETAIL</td>
        <td>PRICE</td>
        <td>EDIT</td>
        <td>DELETE</td>
    </tr>
    <c:forEach items='${requestScope["productList"]}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getDetail()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=update&id=${product.getId()}">update</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
