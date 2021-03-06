<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/25/2022
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
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
                103 ??? 105 ???????ng V?? Nguy??n Gi??p,<br> Ph?????ng Khu?? M???, Qu???n Ng?? h??nh S??n,<br>
                Tp. ???? N???ng, Vi???t Nam
            </p>
            <p class="txt-sm" style="font-size: 13px">
                <span style="color: #005cbf">7.0 km</span> t??? S??n bay Qu???c t??? ???? N???ng </p>
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

<%--ket thuc header--%>

<%--<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #046056">--%>
<%--    <a class="navbar-brand" href="/product?action=create" style="color: white">Add New</a>--%>
<%--    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"--%>
<%--            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--        <span class="navbar-toggler-icon"></span>--%>
<%--    </button>--%>

<%--    <div class="collapse navbar-collapse" id="navbarSupportedContent">--%>
<%--        <ul class="navbar-nav mr-auto">--%>
<%--            <li class="nav-item active">--%>
<%--                <a class="nav-link" href="product?action=product" style="color: white">Get List <span--%>
<%--                        class="sr-only">(current)</span></a>--%>
<%--            </li>--%>

<%--            <form  class="form-inline my-2 my-lg-0" method="post" action="/product?action=searchByName">--%>
<%--                <input class="form-control mr-sm-2" type="search" name="nameForSearch" placeholder="Search by name" aria-label="Search">--%>
<%--                <input type="hidden" name="action" hidden value="search">--%>
<%--                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>--%>
<%--            </form>--%>

<%--        </ul>--%>
<%--    </div>--%>
<%--</nav>--%>

<%--ket thuc nav--%>


<div class="card-body">
    <h2 style="text-align: center">Th???ng k?? s??ch ??ang cho m?????n</h2>


    <c:if test="${message!=null}">
        <p style="color: red;text-align: center;font-size: 18px">${message}</p>
    </c:if>

    <div align="center">
        <table border="1" id="example" class="table table-striped table-bordered">
            <thead>

            <tr>
                <th>M?? m?????n s??ch</th>
                <th>T??n s??ch</th>
                <th>T??c gi???</th>
                <th>T??n h???c sinh</th>
                <th>L???p</th>
                <th>Ng??y m?????n</th>
                <th>Ng??y tr???</th>
                <th>Actions</th>

            </tr>
            </thead>

            <tbody>
            <c:forEach var="muonSach" items="${muonSachDTOList}">
                <tr>
                    <td><c:out value="${muonSach.maMuonSach}"/></td>
                    <td><c:out value="${muonSach.tenSach}"/></td>
                    <td><c:out value="${muonSach.tacGia}"/></td>
                    <td><c:out value="${muonSach.tenHocSinh}"/></td>
<%--                    <td><c:out value="${muonSach.lop}"/></td>--%>
                    <td><c:out value="${muonSach.ngayMuon}"/></td>
                    <td><c:out value="${muonSach.ngayTra}"/></td>

                    <td>
                        <a href="#"
                           class="btn btn-outline-info"><i class="fa-solid fa-pen-clip"></i>Tr??? s??ch</a>

                        <!-- Button delete trigger modal -->
                            <%--                        <button type="button" class="btn btn-primary" data-toggle="modal"--%>
                            <%--                                onclick="setIdDelete(${productDTO.idProduct})" data-target="#exampleModal">--%>
                            <%--                            <i class="fa-solid fa-trash-can"></i>Delete--%>
                            <%--                        </button>--%>
                    </td>
                </tr>
            </c:forEach>

            <!-- Modal -->


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

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>


<script>
    $.extend(true, $.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    });
    $(document).ready(function () {
        $('#example').DataTable({
            "lengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]]
        });
    });
</script>

<script>
    function setIdDelete(customerId) {
        document.getElementById("idDelete").value = customerId;
    }

</script>

</html>