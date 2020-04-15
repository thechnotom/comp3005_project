delete from bank_account;
delete from shopper;
delete from store_owner;
delete from cart;
delete from tracked_order;
delete from publisher;
delete from book;
delete from book_instance;
delete from author;
delete from written_by;

insert into bank_account values ('0123456789', 1343.32);
insert into bank_account values ('2382946732', 732.98);
insert into bank_account values ('3829405930', 12732.98);

insert into shopper values ('Thomas', 'Roller', '0000000001', '0123456789');
insert into shopper values ('Alice', 'Smith', '0000000002', '2382946732');
insert into shopper values ('Bob', 'Apple', '0000000003', '3829405930');

insert into store_owner values ('0000000003');

insert into cart values ('1111100001', '0000000001');
insert into cart values ('1111100002', '0000000001');
insert into cart values ('1111100003', '0000000002');

insert into tracked_order values ('1111100001', '0000012345');
insert into tracked_order values ('1111100003', '0000012346');

insert into publisher values ('1000000000', 'Good Book Publishers', '1st Street');
insert into publisher values ('2000000000', 'We Like Books', '8th Cresent');

insert into book values ('1984', '9789590308635', 'dystopian', 237, 11.87, '1000000000', 3);
insert into book values ('Divergent', '9780062077011', 'sci-fi', 487, 13.65, '1000000000', 1);
insert into book values ('Insurgent', '9780062024046', 'sci-fi', 525, 14.43, '1000000000', 2);
insert into book values ('Three Day Road', '9780670063628', 'historical fiction', 354, 15.23, '2000000000', 7);

insert into book_instance values ('9789590308635', '1111100001');
insert into book_instance values ('9780062077011', '1111100001');
insert into book_instance values ('9780670063628', '1111100002');
insert into book_instance values ('9780670063628', '1111100003');

insert into author values ('0000010001', 'George Orwell');
insert into author values ('0000010002', 'Veronica Roth');
insert into author values ('0000010003', 'Joseph Boyden');

insert into written_by values ('9789590308635', '0000010001');
insert into written_by values ('9780062077011', '0000010002');
insert into written_by values ('9780062024046', '0000010002');
insert into written_by values ('9780670063628', '0000010003');