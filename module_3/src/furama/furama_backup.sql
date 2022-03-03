create database furama_backup;
use furama_backup;

create table vi_tri(
	ma_vi_tri int not null auto_increment,
    ten_vi_tri varchar(45),
    primary key(ma_vi_tri)
);

create table trinh_do(
	ma_trinh_do int not null auto_increment,
    ten_trinh_do varchar(45),
    primary key(ma_trinh_do)
);

create table bo_phan(
	ma_bo_phan int not null auto_increment,
    ten_bo_phan varchar(45),
    primary key(ma_bo_phan)
);

create table nhan_vien(
	ma_nv int not null auto_increment,
    ho_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_vi_tri int,
    ma_trinh_do int,
    ma_bo_phan int, 
    primary key(ma_nv),
    foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
    foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
    foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
	ma_loai_khach int not null auto_increment,
    ten_loai_khach varchar(45),
    primary key(ma_loai_khach)
);

create table khach_hang(
	ma_kh int not null auto_increment,
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dt varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_loai_khach int,
    primary key(ma_kh),
    foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table kieu_thue(
	ma_kieu_thue int not null auto_increment,
    ten_kieu_thue varchar(45),
    primary key(ma_kieu_thue)
);

create table loai_dv(
	ma_loai_dv int not null auto_increment,
    ten_loai_dv varchar(45),
    primary key(ma_loai_dv)
);

create table dich_vu(
	ma_dv int not null auto_increment,
    ten_dv varchar(45),
    dien_tich int,
    chi_phi_thue double,
    so_nguoi_toi_da int,
    tieu_chua_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int,
    ma_kieu_thue int,
    ma_loai_dv int,
    primary key(ma_dv),
    foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
    foreign key(ma_loai_dv) references loai_dv(ma_loai_dv)
);

create table dv_di_kem(
	ma_dv_di_kem int not null auto_increment,
    ten_dv_di_kem varchar(45),
    gia double,
    don_vi varchar(10),
    trang_thai varchar(45),
    primary key(ma_dv_di_kem)
);

create table hop_dong(
	ma_hop_dong int not null auto_increment,
    ngay_lam_hop_dong datetime,
    ngay_ket_thuc datetime,
    tien_dat_coc double,
    ma_nv int,
    ma_kh int,
    ma_dv int,
    primary key(ma_hop_dong),
    foreign key(ma_nv) references nhan_vien(ma_nv),
    foreign key(ma_kh) references khach_hang(ma_kh),
    foreign key(ma_dv) references dich_vu(ma_dv)
);

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tiet int not null auto_increment,
    ma_hop_dong int,
    ma_dv_di_kem int,
    so_luong int,
    primary key(ma_hop_dong_chi_tiet),
    foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
    foreign key(ma_dv_di_kem) references dv_di_kem(ma_dv_di_kem)
);