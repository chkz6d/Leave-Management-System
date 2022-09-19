DROP database if exists leave_management_system;

CREATE SCHEMA IF NOT EXISTS `leave_management_system` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `leave_management_system`;

CREATE TABLE IF NOT EXISTS `leave_management_system`.`employee` (
  `id` INT NOT NULL,
  `leave_count` INT NOT NULL,
  `manager_id` INT NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

insert into employee values (1000029349, 24, "1000023456", "Bob");
insert into employee values (1000023456, 21, "1000087232", "Joe");
insert into employee values (1000077777, 12, "1000023456", "Tom");
insert into employee values (1000098989, 31, "1000087232", "Henry");

SELECT * FROM leave_management_system.employee;
describe leave_management_system.employee;