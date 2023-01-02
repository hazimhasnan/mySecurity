
 -- for MYSQL
CREATE TABLE IF NOT EXISTS `myhelp`.`users` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45) NOT NULL,
`enabled` INT NOT NULL,
PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `myhelp`.`authorities` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(45) NOT NULL,
`authority` VARCHAR(45) NOT NULL,
PRIMARY KEY (`id`));


-- --For PSQL
--CREATE SEQUENCE myhelp.users_seq;
--
--CREATE TABLE IF NOT EXISTS myhelp.users (
--id INT NOT NULL DEFAULT NEXTVAL ('myhelp.users_seq'),
--username VARCHAR(45) NOT NULL,
--password VARCHAR(45) NOT NULL,
--enabled INT NOT NULL,
--PRIMARY KEY (id));
--
--CREATE SEQUENCE myhelp.authorities_seq;
--
--CREATE TABLE IF NOT EXISTS myhelp.authorities (
--id INT NOT NULL DEFAULT NEXTVAL ('myhelp.authorities_seq'),
--username VARCHAR(45) NOT NULL,
--authority VARCHAR(45) NOT NULL,
--PRIMARY KEY (id));