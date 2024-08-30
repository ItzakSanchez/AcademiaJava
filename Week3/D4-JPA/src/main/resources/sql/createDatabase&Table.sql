DROP DATABASE IF EXISTS restaurant;
CREATE DATABASE restaurant;

use restaurant;

DROP TABLE IF EXISTS tbl_menu;
CREATE TABLE tbl_menu(
	MenuId int NOT NULL AUTO_INCREMENT,
    ItemName varchar(255) NOT NULL,
    Description varchar(255),
    Category varchar(255),
    Price DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (MenuId)
);
