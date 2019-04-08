# --- !Ups
delete from user;

insert into user (type,email,name,password,role) values ( 'a','admin@products.com', 'Alice Admin', 'password', 'admin' );

insert into user (type,email,name,password,role) values ('m', 'manager@products.com', 'Bob Manager', 'password', 'manager' );

insert into user (type,email,name,password,role) values ('c', 'customer@products.com', 'Charlie Customer', 'password', 'customer' );

