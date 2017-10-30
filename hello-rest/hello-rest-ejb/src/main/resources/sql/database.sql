create table products (
id integer not null,
name varchar(50) not null,
quantity integer not null,
constraint pk_products primary key (id)
);
create sequence seq_products;

select * from products;

insert into products (id, name, quantity)
values (nextval('seq_products'), 'Macarrao', 4);
insert into products (id, name, quantity)
values (nextval('seq_products'), 'Arroz', 10);
insert into products (id, name, quantity)
values (nextval('seq_products'), 'Vodka', 5);
