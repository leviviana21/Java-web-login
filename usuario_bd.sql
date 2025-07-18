create database banco_dados;
use banco_dados;

create table dados (
	id int auto_increment primary key,
	nome varchar(100),
    idade int,
    sexo char(2),
    email varchar(50),
    senha varchar(50)
);

select * from dados