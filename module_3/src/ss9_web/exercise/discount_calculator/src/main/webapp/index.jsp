<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/9/2022
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator</title>
</head>
<br>
<h2>Product Discount Calculator</h2>
<br>
<form method="post" action="/discount">
<label>Product Description :</label><br/>
<input type="text" name="product_description" placeholder="Enter Product Description"/></br>
<label>List Price :</label></br>
<input type="text" name="list_price" placeholder="Enter List Price"/></br>
<label>Discount Percent :</label></br>
<input type="text" name="discount_percent" placeholder="Enter Discount Percent"/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
