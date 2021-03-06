CREATE DATABASE HENRY;

USE HENRY;


CREATE TABLE BRANCH (
	BRANCH_NUM DECIMAL(2,0) NOT NULL PRIMARY KEY,
	BRANCH_NAME CHAR(50),
	BRANCH_LOCATION CHAR(50),
	NUM_EMPLOYEES DECIMAL(2,0),
);

CREATE TABLE PUBLISHER (
	PUBLISHER_CODE CHAR(3) NOT NULL PRIMARY KEY,
	PUBLISHER_NAME CHAR(25),
	CITY CHAR(20),
);

CREATE TABLE AUTHOR (
	AUTHOR_NUM DECIMAL(2,0) NOT NULL PRIMARY KEY,
	AUTHOR_LAST CHAR(12),
	AUTHOR_FIRST CHAR(10),
	
);

CREATE TABLE BOOK (
	BOOK_CODE CHAR(4) NOT NULL PRIMARY KEY,
	TITLE CHAR(40),
	PUBLISHER_CODE CHAR(3),
	TYPE CHAR(3),
	PRICE DECIMAL(4,2),
	PAPERBACK CHAR(1),
);

CREATE TABLE WROTE (
	BOOK_CODE(4) NOT NULL PRIMARY KEY,
	AUTHOR_NUM DECIMAL(2,0) NOT NULL PRIMARY KEY,
	SEQUENCE DECIMAL(1,0),
);


CREATE TABLE INVENTORY (
	BOOK_CODE CHAR(4) NOT NULL PRIMARY KEY,
	BRANCH_NUM DECIMAL(2,0) NOT NULL PRIMARY KEY
	ON_HAND DECIMAL(2,0) 
);