create table bank_account
    (account_ID     varchar(10),
     balance        numeric(8,2),
     primary key (account_ID)
    );

create table user
    (first_name     varchar(15),
     last_name      varchar(15),
     user_ID        varchar(10),
     account_ID     varchar(10),
     primary key (user_ID)
     foreign key (account_ID) references bank_account
    );

create table owner
    (user_ID        varchar(10),
     primary key (user_ID),
     foreign key (user_ID) references user
    );

create table cart
    (cart_ID        varchar(10),
     user_ID        varchar(10),
     primary key (cart_ID),
     foreign key (user_ID) references user
    );

create table tracked_order
    (cart_ID            varchar(10),
     tracking_number    varchar(10),
     primary key (tracking_number),
     foreign key (cart_ID) references cart
    );

create table publisher
    (publisher_ID   varchar(10),
     name           varchar(30),
     address        varchar(30),
     primary key (publisher_ID)
    );

create table book
    (name           varchar(30),
     ISBN           varchar(13),
     genre          carchar(30),
     num_pages      numeric(4,0),
     price          numeric(3, 2),
     publisher_ID   varchar(10),
     stock          numeric(3,0),
     primary key (ISBN),
     foreign key (publisher_ID) references publisher
    );

create table book_instance
    (ISBN           varchar(13),
     cart_ID        varchar(10),
     primary key (ISBN, cart_ID),
     foreign key (ISBN) references book,
     foreign key (cart_ID) references cart
    );

create table author
    (author_ID      varchar(10),
     name           varchar(30),
     primary key (author_ID)
    );

create table written_by
    (ISBN           varchar(13),
     author_ID      varchar(10),
     primary key (ISBN, author_ID),
     foreign key (ISBN) references book,
     foreign key (author_ID) references author
    );