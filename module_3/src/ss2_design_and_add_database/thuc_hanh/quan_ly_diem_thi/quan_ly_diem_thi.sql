create database quan_ly_diem_thi;
use quan_ly_diem_thi;

create table hoc_sinh(
	ma_hs varchar(20) not null,
    ten_hs varchar(50) not null,
    ngay_sinh datetime,
    lop varchar(20) not null,
    gt varchar(20),
    primary key(ma_hs)
);

create table mon_hoc(
	ma_mh varchar(20) not null,
    ten_mh varchar(20) not null,
    primary key(ma_mh)
);

create table bang_diem(
	ma_hs VARCHAR(20) not null,
    ma_mh VARCHAR(20) not null,
    diem_thi INT,
    ngay_kt DATETIME,
    primary key(ma_hs, ma_mh),
    foreign key(ma_hs) references hoc_sinh(ma_hs),
    foreign key(ma_mh) references mon_hoc(ma_mh)
);

create table giao_vien(
	ma_gv varchar(20) not null,
    ten_gv varchar(20) not null,
    sdt varchar(20),
    primary key(ma_gv)
);

alter table mon_hoc add ma_gv varchar(20);
alter table mon_hoc add constraint fk_ma_gv foreign key (ma_gv) references giao_vien(ma_gv);
