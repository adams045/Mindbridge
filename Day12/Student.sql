show databases;
create database Student;
use Student;

create table Students_table(
	id int,
	name varchar(10),
    age int,
    mark int
);

select * from Students_table;
truncate table Students_table;


