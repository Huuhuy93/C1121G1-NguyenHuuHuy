<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/20/2022
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link
            href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
            rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
          integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>

</head>
<body>
<!-- Phần header website -->

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
<!-- Kết thúc phần header website -->

<!--phần navbar-->
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #046056">
    <a class="navbar-brand" href="#" style="color: white"><i class="ri-home-2-fill"></i></a>
    <a class="navbar-brand" href="../home.jsp" style="color: white">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="../employee.jsp" style="color: white">Employee <span
                        class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="list_customer.jsp" style="color: white">Customer</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" style="color: white">Contract</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                   data-toggle="dropdown"
                   aria-expanded="false" style="color: white">
                    Service
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>


<div class="card-body">
    <h2 style="text-align: center">Customer Management</h2>
    <h3 style="text-align: center">
        <a href="/customer?action=createCustomer">Add New Customer</a>
        <a href="#">Get List All</a>
    </h3>
    <h3 style="text-align: center">
        <a href="#">Sort by name</a>
    </h3>
    <form method="post" action="#">
        <input type="text" name="countryForSearch" placeholder="Search By Country">
        <input type="hidden" name="action" hidden value="search">
        <button type="submit">Search</button>
    </form>

    <c:if test="${message!=null}">
        <p style="color: red;text-align: center;font-size: 18px">${message}</p>
    </c:if>

    <div align="center">
        <table border="1" id="example" class="table table-striped table-bordered">
            <thead>

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
                <th>ACTIONS</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="customerDTO" items="${customerDTOList}">
                <tr>
                    <td><c:out value="${customerDTO.customerId}"/></td>
                    <td><c:out value="${customerDTO.customerName}"/></td>
                    <td><c:out value="${customerDTO.customerBirthday}"/></td>

                    <c:if test="${customerDTO.customerGender==0}">
                        <td><c:out value="Female"/></td>
                    </c:if>
                    <c:if test="${customerDTO.customerGender==1}">
                        <td><c:out value="Male"/></td>
                    </c:if>
                    <td><c:out value="${customerDTO.customerIdCard}"/></td>
                    <td><c:out value="${customerDTO.customerPhone}"/></td>
                    <td><c:out value="${customerDTO.customerEmail}"/></td>
                    <td><c:out value="${customerDTO.customerAddress}"/></td>
                    <td><c:out value="${customerDTO.customerTypeName}"/></td>
                    <td>
                        <a href="/customer?action=editCustomer&id=${customerDTO.customerId}"
                           class="btn btn-outline-info"><i class="fa-solid fa-pen-clip"></i> Edit</a>

                        <!-- Button delete trigger modal -->
                        <button type="button" class="btn btn-primary" data-toggle="modal"
                                onclick="setIdDelete(${customerDTO.customerId})" data-target="#exampleModal">
                            <i class="fa-solid fa-trash-can"></i>Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form method="post" action="/customer?action=deleteCustomer">
                            <input name="id" id="idDelete">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Are you want delete this customer ? </h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                Yes or No ?
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Save changes</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>


            </tbody>

        </table>
    </div>
</div>


<footer class="container-fluid bg-dark py-3">
    <div class="container text-white text-center">
        Copyright &copy; by Nguyen Huu Huy
    </div>
</footer>

</body>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
        crossorigin="anonymous"></script>

<script>
    function setIdDelete(customerId) {
        document.getElementById("idDelete").value = customerId;
    }

</script>
</html>