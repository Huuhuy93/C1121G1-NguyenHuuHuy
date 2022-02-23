create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
	customer_id int not null auto_increment,
    customer_name varchar(20) not null,
    customer_age int,
    primary key(customer_id)
);

create table `order`(
	order_id int not null auto_increment,
    customer_id int not null,
    order_date datetime not null,
    order_total_price double not null,
    primary key(order_id),
    foreign key(customer_id) references customer(customer_id)
);

create table product(
	product_id int not null auto_increment,
    product_name varchar(255) not null,
    product_price double not null,
    primary key(product_id)
);

create table order_detail(
	order_id int not null,
    product_id int not null,
    order_QTY varchar(60),
    unique(order_id, product_id),
    foreign key(order_id) references `order`(order_id),
    foreign key(product_id) references product(product_id)
);



















