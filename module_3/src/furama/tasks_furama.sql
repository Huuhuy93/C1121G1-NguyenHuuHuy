use case_study_furama;

-- task 1 : thêm mới tất cả!!!
insert into vi_tri(ten_vi_tri) values('Quản Lý'), ('Nhân Viên');

INSERT INTO `case_study_furama`.`trinh_do`(ten_trinh_do) VALUES ('Trung cấp'), ('Cao đẳng'),
('Đại học'), ('Sau đại học');

INSERT INTO `case_study_furama`.`bo_phan` (`ma_bo_phan`, `ten_bo_phan`) VALUES ('1', 'Sale-Marketing');
INSERT INTO `case_study_furama`.`bo_phan` (`ma_bo_phan`, `ten_bo_phan`) VALUES ('2', 'Hành chính');
INSERT INTO `case_study_furama`.`bo_phan` (`ma_bo_phan`, `ten_bo_phan`) VALUES ('3', 'Phục vụ');
INSERT INTO `case_study_furama`.`bo_phan` (`ma_bo_phan`, `ten_bo_phan`) VALUES ('4', 'Quản lý');

INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('1', 'Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', '1', '3', '1');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('2', 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('3', 'Hồ Thị Yến', '1995-12-12', '999231723', '14000000', '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', '1', '3', '2');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('4', 'Võ Công Toản', '1980-04-04', '123231365', '17000000', '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', '1', '4', '4');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('5', 'Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '6000000', '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', '2', '1', '1');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('6', 'Khúc Nguyễn An Nghi', '2000-11-08', '964542311', '7000000', '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', '2', '2', '3');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('7', 'Nguyễn Hữu Hà', '1993-01-01', '534323231', '8000000', '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', '2', '3', '2');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('8', 'Nguyễn Hà Đông', '1989-09-03', '234414123', '9000000', '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', '2', '4', '4');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('9', 'Tòng Hoang', '1982-09-03', '256781231', '6000000', '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', '2', '4', '4');
INSERT INTO `case_study_furama`.`nhan_vien` (`ma_nv`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('10', 'Nguyễn Công Đạo', '1994-01-08', '755434343', '8000000', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', '2', '3', '2');

INSERT INTO `case_study_furama`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('1', 'Diamond');
INSERT INTO `case_study_furama`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('2', 'Platinium');
INSERT INTO `case_study_furama`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('3', 'Gold');
INSERT INTO `case_study_furama`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('4', 'Silver');
INSERT INTO `case_study_furama`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('5', 'Member');

INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('1', 'Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng', 5);
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('2', 'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị', 3);
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('3', 'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh', '1');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('4', 'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng', '1');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('5', 'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai', '4');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('6', 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng', '4');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('7', 'Nguyễn Mỹ Kim', '1984-04-08', 0, '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh', '1');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('8', 'Nguyễn Thị Hào', '1999-04-08', 0, '965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum', '3');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('9', 'Trần Đại Danh', '1994-07-01', 1, '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi', '1');
INSERT INTO `case_study_furama`.`khach_hang` (`ma_kh`, `ho_ten`, `ngay_sinh`, `gioi_tinh`, `so_cmnd`, `so_dt`, `email`, `dia_chi`, `ma_loai_khach`) VALUES ('10', 'Nguyễn Tâm Đắc', '1989-07-01', 1, '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng', '2');

INSERT INTO `case_study_furama`.`kieu_thue` VALUES ('1', 'year');
INSERT INTO `case_study_furama`.`kieu_thue` VALUES ('2', 'month');
INSERT INTO `case_study_furama`.`kieu_thue` VALUES ('3', 'day');
INSERT INTO `case_study_furama`.`kieu_thue` VALUES ('4', 'hour');

INSERT INTO `case_study_furama`.`loai_dv` VALUES ('1', 'Villa');
INSERT INTO `case_study_furama`.`loai_dv` VALUES ('2', 'House');
INSERT INTO `case_study_furama`.`loai_dv` VALUES ('3', 'Room');

INSERT INTO `case_study_furama`.`dich_vu` VALUES ('1', 'Villa Beach Front', '25000', '10000000', '10', 'vip', 'Có hồ bơi', '500', '4', '3', '1');
INSERT INTO `case_study_furama`.`dich_vu` VALUES ('2', 'House Princess 01', '14000', '5000000', '7', 'vip', 'Có thêm bếp nướng', null, '3', '2', '2');
INSERT INTO `case_study_furama`.`dich_vu` VALUES ('3', 'Room Twin 01', '5000', '1000000', '2', 'normal', 'Có tivi', null, null, '4', '3');
INSERT INTO `case_study_furama`.`dich_vu` VALUES ('4', 'Villa No Beach Front', '22000', '9000000', '8', 'normal', 'Có hồ bơi', '300', '3', '3', '1');
INSERT INTO `case_study_furama`.`dich_vu` VALUES ('5', 'House Princess 02', '10000', '4000000', '5', 'normal', 'Có thêm bếp nướng', null, '2', '3', '2');
INSERT INTO `case_study_furama`.`dich_vu` VALUES ('6', 'Room Twin 02', '3000', '900000', '2', 'normal', 'Có tivi', null, null, '4', '3');

INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('1', 'Karaoke', '10000', 'giờ', 'tiện nghi, hiện tại');
INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('2', 'Thuê xe máy', '10000', 'chiếc', 'hỏng 1 xe');
INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('3', 'Thuê xe đạp', '20000', 'chiếc', 'tốt');
INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('4', 'Buffet buổi sáng', '15000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('5', 'Buffet buổi trưa', '90000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `case_study_furama`.`dv_di_kem` VALUES ('6', 'Buffet buổi tối', '16000', 'suất', 'đầy đủ đồ ăn, tráng miệng');

INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('1', '2020-12-08', '2020-12-08', '0', '3', '1', '3');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('2', '2020-07-14', '2020-07-21', '200000', '7', '3', '1');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('3', '2021-03-15', '2021-03-17', '50000', '3', '4', '2');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('4', '2021-01-14', '2021-01-18', '100000', '7', '5', '5');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('5', '2021-07-14', '2021-07-15', '0', '7', '2', '6');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('6', '2021-06-01', '2021-06-03', '0', '7', '7', '6');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('7', '2021-09-02', '2021-09-05', '100000', '7', '4', '4');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('8', '2021-06-17', '2021-06-18', '150000', '3', '4', '1');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('9', '2020-11-19', '2020-11-19', '0', '3', '4', '3');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('10', '2021-04-12', '2021-04-14', '0', '10', '3', '5');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('11', '2021-04-25', '2021-04-25', '0', '2', '2', '1');
INSERT INTO `case_study_furama`.`hop_dong`  VALUES ('12', '2021-05-25', '2021-05-27', '0', '7', '10', '1');

INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('1', '2', '4', '5');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('2', '2', '5', '8');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('3', '2', '6', '15');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('4', '3', '1', '1');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('5', '3', '2', '11');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('6', '1', '3', '1');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('7', '1', '2', '2');
INSERT INTO `case_study_furama`.`hop_dong_chi_tiet`  VALUES ('8', '12', '2', '2');



-- task 2 : Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong
-- các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%' and char_length(ho_ten) <= 15 ;

-- task 3 : Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
    where (year(curdate()) - year(ngay_sinh)) - (right(curdate(), 5) < right(ngay_sinh, 5)) between 18 and 50
    and dia_chi like '%Đà Nẵng'
    or dia_chi like '%Quảng Trị';
    
-- task 4 : Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần
--  theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ma_kh, khach_hang.ho_ten, count(hop_dong.ma_hop_dong) as so_luong from hop_dong
join khach_hang on hop_dong.ma_kh = khach_hang.ma_kh
where khach_hang.ma_loai_khach = 1 
group by khach_hang.ma_kh order by so_luong;

-- task 5 : Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
--  (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
--  hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.ma_kh, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
 dich_vu.ten_dv, ifnull(dich_vu.chi_phi_thue, 0) + sum((ifnull(hop_dong_chi_tiet.so_luong, 0) * ifnull(dv_di_kem.gia, 0))) as tong_tien from khach_hang
 left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
 left join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh
 left join dich_vu on hop_dong.ma_dv = dich_vu.ma_dv
 left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 left join dv_di_kem on hop_dong_chi_tiet.ma_dv_di_kem = dv_di_kem.ma_dv_di_kem
 group by hop_dong.ma_hop_dong;

  -- task 6 : Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được
--  khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3)002E
select dich_vu.ma_dv, dich_vu.ten_dv, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dv.ten_loai_dv from dich_vu
join loai_dv on dich_vu.ma_loai_dv = loai_dv.ma_loai_dv
join hop_dong on dich_vu.ma_dv = hop_dong.ma_dv
where dich_vu.ma_dv not in ( select hop_dong.ma_dv from hop_dong where hop_dong.ngay_lam_hop_dong between '2021-01-01 00:00:00' and '2021-03-31 23:59:59' )
group by hop_dong.ma_dv
order by dich_vu.chi_phi_thue desc;

-- task 7 : Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại
--  dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select dich_vu.ma_dv, dich_vu.ten_dv, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dv.ten_loai_dv from dich_vu
join loai_dv on dich_vu.ma_loai_dv = loai_dv.ma_loai_dv
join hop_dong on dich_vu.ma_dv = hop_dong.ma_dv
where hop_dong.ngay_lam_hop_dong between '2020-01-01 00:00:00' and '2020-12-31 23:59:59'
and dich_vu.ma_dv not in ( select hop_dong.ma_dv from hop_dong where hop_dong.ngay_lam_hop_dong between '2021-01-01 00:00:00' and '2021-12-31 23:59:59')
group by hop_dong.ma_dv;

-- task 8 : Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
select distinct ho_ten from khach_hang;

-- task 9 : Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng
-- thực hiện đặt phòng.
select month(hop_dong.ngay_lam_hop_dong) as thang, count(month(hop_dong.ngay_lam_hop_dong)) from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2021
group by thang order by thang;

-- task 10 : Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
--  ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, sum(ifnull(hop_dong_chi_tiet.so_luong, 0))
as so_luong_dich_vu_di_kem
from hop_dong
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dv_di_kem on hop_dong_chi_tiet.ma_dv_di_kem = dv_di_kem.ma_dv_di_kem
group by hop_dong.ma_hop_dong;

-- task 11 : Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi
--  ở “Vinh” hoặc “Quảng Ngãi”.
select dv_di_kem.ma_dv_di_kem, dv_di_kem.ten_dv_di_kem from dv_di_kem
join hop_dong_chi_tiet on dv_di_kem.ma_dv_di_kem = hop_dong_chi_tiet.ma_dv_di_kem
join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join khach_hang on hop_dong.ma_kh = khach_hang.ma_kh
join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where loai_khach.ten_loai_khach like '%Diamond' and khach_hang.dia_chi like '%Vinh' or khach_hang.dia_chi like '%Quảng Ngãi';

-- task 12 : Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng),
--  ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các
--  dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hop_dong.ma_hop_dong, nhan_vien.ho_ten as ten_nhan_vien, khach_hang.ho_ten as ten_khach_hang, khach_hang.so_dt, dich_vu.ma_dv,
 dich_vu.ten_dv, sum(ifnull(hop_dong_chi_tiet.so_luong, 0)) as so_luong_dich_vu_di_kem, hop_dong.tien_dat_coc from dich_vu
left join hop_dong on dich_vu.ma_dv = hop_dong.ma_dv
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join nhan_vien on hop_dong.ma_nv = nhan_vien.ma_nv
left join khach_hang on hop_dong.ma_kh = khach_hang.ma_kh

-- select hop_dong.ma_hop_dong, nhan_vien.ho_ten as ho_ten_nhan_vien, khach_hang.ho_ten as ho_ten_khach_hang,
-- khach_hang.so_dt, dich_vu.ma_dv, dich_vu.ten_dv,
-- sum(ifnull(hop_dong_chi_tiet.so_luong, 0)) as so_luong_dich_vu_di_kem, hop_dong.tien_dat_coc
-- from  hop_dong_chi_tiet -- on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
-- right join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
-- right join dich_vu on hop_dong.ma_dv = dich_vu.ma_dv
-- right join nhan_vien on hop_dong.ma_nv = nhan_vien.ma_nv
-- right join khach_hang on hop_dong.ma_kh = khach_hang.ma_kh
where (hop_dong.ngay_lam_hop_dong between '2020-10-01 00:00:00' and '2020-12-31 23:59:59')
and (dich_vu.ma_dv not in ( select hop_dong.ma_dv from hop_dong where hop_dong.ngay_lam_hop_dong
 between '2021-01-01 00:00:00' and '2021-06-30 23:59:59'))
 group by hop_dong.ma_hop_dong;


-- task 13 : Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dv_di_kem.ma_dv_di_kem, dv_di_kem.ten_dv_di_kem, sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem from dv_di_kem
join hop_dong_chi_tiet on dv_di_kem.ma_dv_di_kem = hop_dong_chi_tiet.ma_dv_di_kem
group by dv_di_kem.ma_dv_di_kem
having so_luong_dich_vu_di_kem >= all (select sum(hop_dong_chi_tiet.so_luong) from hop_dong_chi_tiet group by hop_dong_chi_tiet.ma_dv_di_kem);

-- task 14 : Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong,
--  ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem)
select hop_dong.ma_hop_dong, loai_dv.ten_loai_dv, dv_di_kem.ten_dv_di_kem, count(dv_di_kem.ma_dv_di_kem) as so_lan_su_dung from hop_dong 
join dich_vu on hop_dong.ma_dv = dich_vu.ma_dv
join loai_dv on dich_vu.ma_loai_dv = loai_dv.ma_loai_dv
join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dv_di_kem on hop_dong_chi_tiet.ma_dv_di_kem = dv_di_kem.ma_dv_di_kem
group by dv_di_kem.ma_dv_di_kem
having count(dv_di_kem.ma_dv_di_kem) = 1
order by hop_dong.ma_hop_dong;

-- task 15 : Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai,
--  dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select nhan_vien.ma_nv, nhan_vien.ho_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi, 
count(hop_dong.ma_hop_dong) from nhan_vien
join hop_dong on nhan_vien.ma_nv = hop_dong.ma_nv
join trinh_do on nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
group by nhan_vien.ma_nv
having count(hop_dong.ma_hop_dong) <= 3;

-- task 16 : Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
create temporary table temp_xoa_nhan_vien_chua_lap_hd(
	select hop_dong.ma_nv from hop_dong
	join nhan_vien on hop_dong.ma_nv = nhan_vien.ma_nv
	where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021
);
set sql_safe_updates = 0;
delete from nhan_vien where nhan_vien.ma_nv not in (select * from temp_xoa_nhan_vien_chua_lap_hd);
set sql_safe_updates = 1;

-- task 17 : Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng 
-- đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
update khach_hang set khach_hang.ma_loai_khach = 1
where khach_hang.ma_loai_khach = 2
and khach_hang.ma_kh in (select hop_dong.ma_kh from hop_dong
join dich_vu on hop_dong.ma_dv = dich_vu.ma_dv
join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dv_di_kem on hop_dong_chi_tiet.ma_dv_di_kem = dv_di_kem.ma_dv_di_kem
group by hop_dong.ma_kh
having sum(ifnull(dich_vu.chi_phi_thue, 0) + (ifnull(hop_dong_chi_tiet.so_luong, 0) * ifnull(dv_di_kem.gia, 0))) > 10000000
);

-- task 18 : Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
create temporary table temp_khach_hang_truoc_2021(
	select khach_hang.ma_kh from khach_hang
    join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh
    where year(hop_dong.ngay_lam_hop_dong) < 2021
);
set sql_safe_updates = 0;
delete from hop_dong_chi_tiet where hop_dong_chi_tiet.ma_hop_dong in (select hop_dong.ma_hop_dong from hop_dong
where hop_dong.ma_kh in (select ma_kh from temp_khach_hang_truoc_2021));
delete from hop_dong where hop_dong.ma_kh in (select ma_kh from temp_khach_hang_truoc_2021);
delete from khach_hang where khach_hang.ma_kh in (select ma_kh from temp_khach_hang_truoc_2021);

-- task 20 : Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.	
select nhan_vien.ma_nv as id, nhan_vien.ho_ten, nhan_vien.email, nhan_vien.so_dien_thoai, nhan_vien.ngay_sinh, nhan_vien.dia_chi from nhan_vien
union
select ma_kh as id, khach_hang.ho_ten, khach_hang.email, khach_hang.so_dt, khach_hang.ngay_sinh, khach_hang.dia_chi from khach_hang;


























