drop database jdbc_demo;
create database jdbc_demo;
use jdbc_demo;
drop table employee;

create table employee(
emp_id int, 
emp_name varchar(30), 
emp_age int
);

insert into employee values(101, 'Alex', 24);
insert into employee values(102, 'Martin', 24);

commit;
