create database student_manager;
use student_manager;
create table student(
	id int not null auto_increment,
    name_student varchar(50) not null,
    primary key(id)
);

create table teacher(
	id int not null auto_increment,
    name_teacher varchar(50) not null,
    age int null,
    country varchar(255) null,
    primary key(id)
);

insert into student(name_student) values ("Huy"), ("Khoa");
insert into teacher(name_teacher, age, country) values ("ChanhTT", 35, "DN"),
("HaiTT", 27, "DN");
