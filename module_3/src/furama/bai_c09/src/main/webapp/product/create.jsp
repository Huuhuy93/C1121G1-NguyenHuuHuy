<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/24/2022
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <%--    remix icon--%>
    <link
            href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
            rel="stylesheet"/>
    <%--    font anysome : cac icon--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
          integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>

    <%--    phan trang datatable--%>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">


</head>
<body>
<div class="card-header bg-white" style="height: 120px">
    <div class="row">
        <div class="col-auto col-sm-5 col-lg-3 d-flex align-items-center bestel-logo" style="margin-bottom: 10px">
            <a href="#" class="header-logo">
                <img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png"
                     alt="logo" class="img-fluid" height="90" width="70">
            </a>
        </div>

        <div class="col col-md-auto col-lg-3 d-flex">
        </div>

        <div class="col-sm-3 d-none d-lg-block bg-white">
            <p style="font-size: 13px"><i style="color: #046056" class="ri-map-pin-2-fill"></i>
                103 – 105 Đường Võ Nguyên Giáp,<br> Phường Khuê Mỹ, Quận Ngũ hành Sơn,<br>
                Tp. Đà Nẵng, Việt Nam
            </p>
            <p class="txt-sm" style="font-size: 13px">
                <span style="color: #005cbf">7.0 km</span> từ Sân bay Quốc tế Đà Nẵng </p>
        </div>

        <div class="col-sm-3 d-none d-lg-block">
            <div class="header-contact d-flex">
                <div class="header-contact-icon"><i class="icon-telephone"></i></div>
                <div class="header-contact-txt">
                    <p class="txt-lg" style="font-size: 15px">
                        <i style="color: #046056" class="ri-phone-fill"></i>
                        84-236-3847 333/888 </p>
                </div>
            </div>
            <div class="header-contact d-flex">
                <div class="header-contact-icon"><i style="color: #046056" class="icon-closed-envelope"></i></div>
                <div class="header-contact-txt" style="font-size: 13px">
                    <i style="color: #046056" class="ri-mail-fill"></i>
                    <a style="color: black" href="mailto:reservation@furamavietnam.com">
                        reservation@furamavietnam.com </a>
                </div>
            </div>
        </div>
    </div>
</div>


<center>
    <h1>Product Management</h1>
</center>


<div class="container">
    <form method="post">
        <div class="form-group">
            <label for="name">Product Name:</label>
            <input type="text" class="form-control" name="name" id="name" required>
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

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</html>
