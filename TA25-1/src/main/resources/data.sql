
DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

create table fabricantes(
	codigo_fabricante int auto_increment primary key,
	nombre varchar(100)
);

create table articulos(
	codigo_articulo int auto_increment primary key,
	nombre varchar(100),
	precio int,
	fabricante int,
	foreign key (fabricante) references fabricantes(codigo_fabricante) on delete cascade on update cascade
);

insert into fabricantes (nombre) values ('Fabricante 1');
insert into fabricantes (nombre) values ('Fabricante 2');
insert into fabricantes (nombre) values ('Fabricante 3');
insert into fabricantes (nombre) values ('Fabricante 4');
insert into fabricantes (nombre) values ('Fabricante 5');

insert into articulos (nombre, precio, fabricante) values ('Articulo 1', 4, 1);
insert into articulos (nombre, precio, fabricante) values ('Articulo 2', 3, 2);
insert into articulos (nombre, precio, fabricante) values ('Articulo 3', 2, 3);
insert into articulos (nombre, precio, fabricante) values ('Articulo 4', 5, 4);
insert into articulos (nombre, precio, fabricante) values ('Articulo 5', 1, 5);
