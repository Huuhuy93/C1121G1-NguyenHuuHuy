create database benh_vien;
use benh_vien;

create table benh_nhan(
id_benh_nhan int not null auto_increment,
ma_benh_nhan varchar(45) unique,
ten_benh_nhan varchar(45),
primary key(id_benh_nhan)
);

create table benh_an(
id_benh_an int not null auto_increment,
ma_benh_an varchar(45) unique,
ma_benh_nhan varchar(45) unique,
ngay_nhap_vien varchar(45),
ngay_ra_vien varchar(45),
ly_do_nhap_vien varchar(45),
primary key(id_benh_an),
foreign key(ma_benh_nhan) references benh_nhan(ma_benh_nhan)

);
