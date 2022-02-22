create database `student-manager`;
use `student-manager`;
drop database `student-manager`;

create database studentmanager;
use studentmanager;
create table Student(
	id int not null,
    name varchar (45) null,
    age int null,
    country varchar(45) null,
    primary key(id)
);
    
    