create database furama_manage_database;
use furama_manage_database;

create table `position` (
position_id int primary key,
position_name varchar(45)
);

create table education_degree (
education_degree_id int primary key,
education_degree_name varchar(45)
);

create table division (
division_id int primary key,
division_name varchar(45)
);
create table `user` (
username varchar(255) primary key,
`password` varchar(255)
);
create table employee(
employee_id int primary key,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
foreign key (position_id) references`position` (position_id),
education_degree_id int,
foreign key (education_degree_id) references education_degree(education_degree_id),
 division_id int,
 foreign key (division_id) references division(division_id),
username varchar(255),
foreign key (username) references user(username)
);
create table `role` (
role_id int primary key,
role_name varchar(255)
);
create table user_role(
role_id int,
foreign key (role_id) references `role`(role_id),
username varchar(255),
foreign key (username) references `user` (username),
primary key(role_id,username)
);
create table customer_type (
customer_type_id int primary key AUTO_INCREMENT,
customer_type_name varchar(45)
);
create table customer (
customer_id int primary key AUTO_INCREMENT,
customer_name varchar(45),
customer_birthday date not null,
customer_gender bit(1) not null,
customer_id_card varchar(45) not null,
customer_phone varchar(45) not null,
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int not null,
foreign key (customer_type_id) references customer_type(customer_type_id)
);
create table service_type(
service_type_id int primary key,
service_type_name varchar(45)
);
create table rent_type (
rent_type_id int primary key AUTO_INCREMENT,
rent_type_name varchar(45),
rent_type_cost double
);
create table service (
service_id int primary key AUTO_INCREMENT,
service_name varchar(45) not null,
service_area int,
service_cost double not null,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
rent_type_id int not null,
service_type_id int not null,
foreign key (rent_type_id) references rent_type (rent_type_id),
foreign key (service_type_id) references service_type (service_type_id)
);
create table attach_service (
attach_service_id int primary key AUTO_INCREMENT,
attach_service_name varchar(45) not null,
attach_service_cost double not null,
attach_service_unit varchar(255) not null,
attach_service_status varchar(45)
);
create table contract (
contract_id int primary key AUTO_INCREMENT,
contract_start_date varchar(45) not null,
contract_end_date varchar(45) not null,
contract_deposit double not null,
contract_total_money double not null,
employee_id int not null,
customer_id int not null,
service_id int not null,
foreign key (employee_id) references employee (employee_id),
foreign key (customer_id) references customer (customer_id),
foreign key (service_id) references service (service_id)
);
create table contract_detail (
contract_detail_id int primary key AUTO_INCREMENT,
quantity int not null,
contract_id int not null,
attach_service_id int not null,
foreign key (contract_id) references contract (contract_id),
foreign key (attach_service_id) references attach_service (attach_service_id)
);
