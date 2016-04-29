create database db_shopper;

use db_shopper;

create table customer
(
id_customer int not null auto_increment,
nm_customer varchar(60) not null,
qt_age int not null, -- o correto seria usar o ano de nascimento ao invés da idade
id_rg varchar(14) not null,
nm_address varchar(100) not null,
id_cep varchar(10) not null,
constraint pk_customer
primary key(id_customer)
);