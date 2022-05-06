<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/24/2022
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <h1>Product Management</h1>
    <h2>
        <a href="product?action=product">List All Product</a>
    </h2>
    <p>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message">${requestScope["message"]}</span>
        </c:if>
    </p>
</center>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Product
                </h2>
            </caption>
            <c:if test="${product != null}">
                <input type="hidden" name="id" value="<c:out value='${product.idProduct}' />"/>
            </c:if>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${product.nameProduct}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Price:</th>
                <td>
                    <input type="text" name="price" size="45"
                           value="<c:out value='${product.price}' />"
                    />
                </td>
            </tr>

<%--            <tr>--%>
<%--                <th>Customer Gender:</th>--%>
<%--                <td>--%>
<%--                    <select name="gender" >--%>
<%--                        <c:if test="${customer.getCustomerGender() == 0 }">--%>
<%--                            <option selected value="0">FeMale</option>--%>
<%--                            <option value="1">Male</option>--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${customer.getCustomerGender() == 1 }">--%>
<%--                            <option value="0" >FeMale</option>--%>
<%--                            <option selected value="1">Male</option>--%>
<%--                        </c:if>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>

            <tr>
                <th>Quantity:</th>
                <td>
                    <input type="text" name="quantity" size="45"
                           value="<c:out value='${product.quantity}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Color:</th>
                <td>
                    <select name="color" >
                        <option value="Red">Red</option>
                        <option value="Blue">Blue</option>
                        <option value="White">White</option>
                        <option value="Black">Black</option>
                    </select>
                </td>
            </tr>

            <tr>
                <th>Catalogue:</th>
                <td>
                    <input type="text" name="id_catalogue" size="45"
                           value="<c:out value='${product.idCatalogue}' />"
                    />
                </td>
            </tr>

<%--            <tr>--%>
<%--                <th>Catalogue:</th>--%>
<%--                <td>--%>
<%--                    <select name="id_catalogue" >--%>
<%--                        <c:if test="${product.getIdCatalogue() == 1 }">--%>
<%--                            <option selected value="1">Phone</option>--%>
<%--                            <option value="2">Tivi</option>--%>
<%--                            <option value="3">Tu lanh</option>--%>
<%--                            <option value="4">May giat</option>--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${product.getIdCatalogue() == 2 }">--%>
<%--                            <option value="1" >Phone</option>--%>
<%--                            <option selected value="2">Tivi</option>--%>
<%--                            <option value="3">Tu lanh</option>--%>
<%--                            <option value="4">May giat</option>--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${product.getIdCatalogue() == 3 }">--%>
<%--                            <option value="1">Tu Phone</option>--%>
<%--                            <option value="2">Tivi</option>--%>
<%--                            <option selected value="3">Tu lanh</option>--%>
<%--                            <option value="4">May giat</option>--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${product.getIdCatalogue() == 4 }">--%>
<%--                            <option value="1">Phone</option>--%>
<%--                            <option value="2">Tivi</option>--%>
<%--                            <option value="3">Tu lanh</option>--%>
<%--                            <option selected value="4">May giat</option>--%>
<%--                        </c:if>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>


<div class="container">
    <form method="post">
        <c:if test="${product != null}">
            <input type="hidden" name="id" value="<c:out value='${product.idProduct}' />"/>
        </c:if>
        <div class="form-group">
            <label for="name">Product Name:</label>
            <input type="text" class="form-control" name="name" id="name" value="<c:out value='${product.idProduct}' />"  required>
            <small id="emailHelp" class="form-text text-muted">Name of product.</small>
        </div>
        <div class="form-group">
            <label for="quantity">Quantity:</label>
            <input type="text" class="form-control" name="quantity" id="quantity" required>
        </div>
        <div class="form-group">
            <label for="price">Price:</label>
            <input type="text" class="form-control" name="price" id="price" required>
        </div>

        <div>
            <label for="color">Color:</label>
            <select class="form-control" id="color" name="color">
                <option>Red</option>
                <option>Green</option>
                <option>White</option>
                <option>Yellow</option>
                <option>Black</option>
            </select>
        </div>

        <div>
            <label for="catalogue">Catalogue:</label>
            <select class="form-control" id="catalogue" name="id_catalogue">
                <c:forEach var="catalogue" items="${catalogueList}">
                    <option value="${catalogue.getIdCatalogue()}">${catalogue.getNameCatalogue()}</option>
                </c:forEach>
            </select>
        </div>


        <input type="submit" class="btn btn-primary" value="Save"/>
        <button type="submit" class="btn btn-primary" ><a href="product?action=product">Back</a></button>
    </form>
</div>

</body>
</html>
