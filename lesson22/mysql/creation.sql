create database itclassdb_sql;

use itclassdb_sql;

create table product
(
	maker varchar(10) not null,
    model varchar(50) not null unique,
    type varchar(50)
);

create table pc
(
	code int auto_increment primary key,
    model varchar(50) not null,
    speed smallint not null,
    ram smallint not null,
    hd real not null,
    cd varchar(10) not null,
    price int null,
    foreign key (model) references product(model)
);

create table laptop
(
	code int auto_increment primary key,
    model varchar(50) not null,
    speed smallint not null,
    ram smallint not null,
    hd real not null,
    price int null,
    screen tinyint not null,
    foreign key (model) references product(model)
);

create table printer
(
	code int auto_increment primary key,
    model varchar(50) not null,
    color char(1) not null,
    type varchar(10) not null,
    price int null,
    foreign key (model) references product(model)
);


