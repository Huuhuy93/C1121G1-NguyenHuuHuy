create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;

create table class(
	class_id int not null auto_increment,
    class_name varchar(60) not null,
    start_day datetime not null,
    `status` bit,
    primary key(class_id)
);

create table student(
	student_id int not null auto_increment,
    student_name varchar(30) not null,
    address varchar(50),
    phone varchar(20),
    `status` bit,
    class_id int not null,
    primary key(student_id),
    foreign key(class_id) references class(class_id)
);

create table `subject`(
	sub_id int not null auto_increment,
    sub_name varchar(30) not null,
    credit tinyint default 1 check(credit >=1),
    `status` bit default 1,
    primary key(sub_id)
);

create table mark(
	mark_id int not null auto_increment,
    sub_id int not null,
    student_id int not null,
    mark float default 0 check(mark between 0 and 100),
    exam_time tinyint default 1,
    primary key(mark_id),
    unique(sub_id, student_id),
    foreign key(sub_id) references `subject`(sub_id),
    foreign key(student_id) references student(student_id)
);
-- insert into class(class_name, start_day) values ("c12", 24/12/2021);
-- select * from class;

insert into student(student_name, class_id) values ("huy", 1);
select * from student;