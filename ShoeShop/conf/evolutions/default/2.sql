# --- Sample dataset
 
# --- !Ups
 
delete from product;
delete from category;

insert into category (id,name) values ( 1,'Mens' );
insert into category (id,name) values ( 2,'Womens' );
insert into category (id,name) values ( 3,'Kids' );
insert into category (id,name) values ( 4,'Sales' );
insert into category (id,name) values ( 5,'Trending' );
insert into category (id,name) values ( 6,'Comfort' );
insert into category (id,name) values ( 7,'Running' ); 
insert into category (id,name) values ( 8,'Formal' ); 
 
insert into product (id,name,description,stock,price) values ( 1,'Adidas','Yeezy',100,55.00 );
insert into product (id,name,description,stock,price) values ( 2,'Adidas','Ultra-Boost',45,799.00 );
insert into product (id,name,description,stock,price) values ( 3,'Adidas','Superstars',5,99.00 );
insert into product (id,name,description,stock,price) values ( 4,'Adidas','Gazelles',45,799.00 );
insert into product (id,name,description,stock,price) values ( 5,'Adidas','Y3',5,99.00 );
insert into product (id,name,description,stock,price) values ( 6,'Nike','Uptempos',12,2799.00 );
insert into product (id,name,description,stock,price) values ( 7,'Nike','Airmax',50,699.00 );
insert into product (id,name,description,stock,price) values ( 8,'Nike','Airforce',45,799.00 );
insert into product (id,name,description,stock,price) values ( 9,'Nike','Hurraches',5,299.00 );
insert into product (id,name,description,stock,price) values ( 10,'Reeboks','Old',10,399.00 );
insert into product (id,name,description,stock,price) values ( 11,'Puma','Hybrid NX',5,899.00 );
insert into product (id,name,description,stock,price) values ( 12,'Vans','Old Skool',50,29.00 );
 
insert into category_product (category_id,product_id) values (5,1);
insert into category_product (category_id,product_id) values (5,2);
insert into category_product (category_id,product_id) values (1,3);
insert into category_product (category_id,product_id) values (3,4);
insert into category_product (category_id,product_id) values (3,5);
insert into category_product (category_id,product_id) values (8,6);
insert into category_product (category_id,product_id) values (6,7);
insert into category_product (category_id,product_id) values (7,8);  
insert into category_product (category_id,product_id) values (3,9);
insert into category_product (category_id,product_id) values (5,10);
insert into category_product (category_id,product_id) values (4,11);
insert into category_product (category_id,product_id) values (2,12);
insert into category_product (category_id,product_id) values (5,7);
insert into category_product (category_id,product_id) values (3,8);
insert into category_product (category_id,product_id) values (3,3);  
