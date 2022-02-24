create database quan_ly_nhap_xuat;
use quan_ly_nhap_xuat;

create table nha_cung_cap(
	ma_NCC varchar(20) not null,
    ten_NCC varchar(30) not null,
    dia_chi varchar(60),
    primary key(ma_NCC)
);

create table so_dien_thoai(
	ma_SDT int not null auto_increment,
    so_DT varchar(20),
    ma_NCC varchar(20) not null,
    primary key(ma_SDT),
    foreign key(ma_NCC) references nha_cung_cap(ma_NCC)
);

create table don_dat_hang(
	so_DH int not null auto_increment,
    ngay_DH date not null,
    ma_NCC varchar(20) not null,
    primary key(so_DH),
    foreign key(ma_NCC) references nha_cung_cap(ma_NCC)
);

create table cung_cap(
	so_DH int not null,
    ma_NCC varchar(20) not null,
    foreign key(so_DH) references don_dat_hang(so_DH),
    foreign key(ma_NCC) references nha_cung_cap(ma_NCC)
);

create table vat_tu(
	ma_VTu varchar(20) not null,
    ten_VTu varchar(50) not null,
    primary key(ma_VTu)
);

create table chi_tiet_dat_hang(
	so_DH int not null,
    ma_VTu varchar(20) not null,
    unique(so_DH, ma_VTu),
    foreign key(so_DH) references don_dat_hang(so_DH),
    foreign key(ma_VTu) references vat_tu(ma_VTu)
);

create table phieu_nhap(
	so_PN int not null auto_increment,
    ngay_nhap datetime not null,
    primary key(so_PN)
);

create table chi_tiet_PN(
	don_gia_nhap double not null,
    SL_nhap int not null,
    so_PN int not null,
    ma_VTu varchar(20) not null,
    primary key(so_PN, ma_VTu),
    unique(so_PN, ma_VTu),
    foreign key(so_PN) references phieu_nhap(so_PN),
    foreign key(ma_VTu) references vat_tu(ma_VTu)
);

create table phieu_xuat(
	so_PX int not null auto_increment,
    ngay_xuat datetime not null,
	primary key(so_PX)
);

create table chi_tiet_PX(
	don_gia_xuat double not null,
    SL_xuat int not null,
    ma_VTu varchar(20) not null,
    so_PX int not null,
    primary key(so_PX, ma_VTu),
    unique(so_PX, ma_VTu),
    foreign key(so_PX) references phieu_xuat(so_PX),
    foreign key(ma_VTu) references vat_tu(ma_VTu)
);













