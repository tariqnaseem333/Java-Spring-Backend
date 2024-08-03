create database jdbc_exercise;
use jdbc_exercise;
drop table guests;

create table guests(
guest_id int, 
guest_name varchar(30), 
guest_city varchar(30)
);

 insert into guests values(101, 'Samantha Jones', 'NY');
 insert into guests values(102, 'Bradley Cooper', 'LA');
 insert into guests values(103, 'Arya', 'Boston');

commit;
