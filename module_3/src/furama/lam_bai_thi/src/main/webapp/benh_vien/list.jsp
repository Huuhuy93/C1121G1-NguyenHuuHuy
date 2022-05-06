<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/23/2022
  Time: 11:12 PM
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
    <title>Benh Vien</title>

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

<div class="card-body">
    <h2 style="text-align: center">Quản Lý Bệnh Viện</h2>
    <h3 style="text-align: center">
        <a href="/benh_vien?action=create" style="font-size: 20px">Add New Customer ||</a>
        <a href="/benh_vien?action=benh_vien" style="font-size: 20px">Get List All</a>



    <c:if test="${message!=null}">
        <p style="color: red;text-align: center;font-size: 18px">${message}</p>
    </c:if>

    <div align="center">
        <table border="1" id="example" class="table table-striped table-bordered">
            <thead>

            <tr>
                <th>STT</th>
                <th>Mã Bệnh Án</th>
                <th>Mã Bệnh Nhân</th>
                <th>Tên Bệnh Nhân</th>
                <th>Ngày nhập viện</th>
                <th>Ngày ra viện</th>
                <th>Lý do nhập viện</th>
                <th>Thao tác</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="benhAnDTO" items="${benhAnDTOList}">
                <tr>
                    <td><c:out value="${benhAnDTO.idBenhNhan}"/></td>
                    <td><c:out value="${benhAnDTO.maBenhAn}"/></td>
                    <td><c:out value="${benhAnDTO.maBenhNhan}"/></td>
                    <td><c:out value="${benhAnDTO.tenBenhNhan}"/></td>
                    <td><c:out value="${benhAnDTO.ngayNhapVien}"/></td>
                    <td><c:out value="${benhAnDTO.ngayRaVien}"/></td>
                    <td><c:out value="${benhAnDTO.lyDoNhapVien}"/></td>
                    <td>
                        <a href="/benh_vien?action=edit&id=${benhAnDTO.idBenhNhan}"
                           class="btn btn-outline-info"><i class="fa-solid fa-pen-clip"></i> Edit</a>

                        <!-- Button delete trigger modal -->
                        <button type="button" class="btn btn-primary" data-toggle="modal"
                                onclick="setIdDelete(${benhAnDTO.idBenhNhan})" data-target="#exampleModal">
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
