<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/24/2022
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link
            href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
            rel="stylesheet"
    />

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
    <h1>Quản Lý Bệnh Viện</h1>
    <h2>
        <a href="benh_vien?action=benh_vien">Danh Sách Bệnh Viện</a>
    </h2>
</center>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Thêm mới bệnh án</h2>
            </caption>
            <tr>
                <th>Mã bệnh án :</th>
                <td>
                    <input type="text" name="maBenhAn" id="maBenhAn" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Mã bệnh nhân:</th>
                <td>
                    <input type="text" name="maBenhNhan" id="maBenhNhan" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Tên bệnh nhân:</th>
                <td>
                    <input type="text" name="maBenhNhan" id="maBenhNhan" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Ngày nhập viện:</th>
                <td>
                    <input type="text" name="id_card" id="id_card" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Ngày ra viện:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Lý do nhập viện:</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>


            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>

<footer class="bg-dark py-3">
    <div class="container text-white text-center">
        Copyright &copy; by Nguyen Huu Huy
    </div>
</footer>

</body>
</html>
