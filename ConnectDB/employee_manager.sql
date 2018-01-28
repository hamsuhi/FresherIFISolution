
CREATE SCHEMA `employee_manager` DEFAULT CHARACTER SET utF8;
USE `employee_manager`;
CREATE TABLE `EMPLOYEE` (
`ID` nvarchar(100) NOT NULL ,
`FULL_NAME` nvarchar(150),
`SALARY` DOUBLE
);

Insert into employee_manager.employee(ID,Full_NAME,SALARY)
VALUES('001','Nguyễn Thanh Hương','200');

insert into employee_manager.employee(ID,FULL_NAME,SALARY)
values('002','Nguyễn Xuân Trường','300');

insert into employee_manager.employee(ID,FULL_NAME,SALARY)
values('003','Ngô Hoàng Nam','400');

