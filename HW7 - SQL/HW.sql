create table users (id   int primary key, name varchar(20), last_name varchar(40),
phone_number varchar(13), gender enum('male', 'female'));

create table devices (user_id int, foreign key (user_id) references users (id), product_name varchar(30),
MAC varchar(17));


insert into users values (1, 'Brad', 'Pitt', '+380501234567', 'male' );
insert into users values (2, 'Dwayne', 'Johnson', '+380671234567', 'male' );
insert into users values (3, 'Will', 'Smith', '+380679876543', 'male' );
insert into users values (4, 'Cardi', 'B', '+380632223344', 'female' );

insert into devices values
(1, 'Macbook', '00:11:22:33:44:55'),
(1, 'Ipad', '08:00:69:02:01:FC'),
(2, 'Ihone', '00:1B:44:11:3A:B7'),
(2, 'Router', '00:E0:4C:F5:2B:36'),
(2, 'LapTop', '00:21:70:7E:CC:F1'),
(3, 'Xbox', '00:0F:B5:8D:AC:82'),
(3, 'Nintendo', '00:24:81:81:C1:11'),
(4, 'Phone', '00:50:BA:5D:8C:FD'),
(4, 'TV', '00:0C:29:F5:7B:4C'),
(4, 'Watch', '00:16:3E:25:5F:3A');

SELECT * from users;

select * from users order by name ASC;

select * from users where name = 'Brad';

select * from users where id between 2 and 3;

Select * from users where phone_number like '+38067%';

select max(id) from users;

SELECT * from users inner join devices on users.id = devices.user_id;





select
    users.*,
    count(users.id) as 'кол-во устройств'
from users
inner join devices on devices.user_id = users.id
group by users.id
ORDER BY count(users.id) DESC;


SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));




