# --- !Ups
delete from user;

insert into user (type,email,name,password,role) values ( 'admin','admin@products.com', 'Alice Admin', 'password', 'admin' );

insert into user (type,email,name,password,role) values ('manager', 'manager@products.com', 'Bob Manager', 'password', 'manager' );

insert into user (type,email,name,password,role) values ('customer', 'customer@products.com', 'Charlie Customer', 'password', 'customer' );