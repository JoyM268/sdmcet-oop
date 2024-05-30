/* Write a Java program to implement the following scenario: 
Consider the following table available in the MySQL instance of StudentDB:

+-------------------------+
|       StudentInfo       |  
+-----------+-------------+
| RollNo    | int         |
| Name      | varchar(20) |
| USN       | varchar(10) |
| Division  | varchar(1)  |
+-----------+-------------+

Write a Java program that displays contents of the above-mentioned table on the console. */

/* SQL Script */

CREATE DATABASE StudentDB;

USE StudentDB;

CREATE TABLE StudentInfo(
    RollNo int,
    Name varchar(20),
    USN varchar(10),
    Division varchar(1)
);

INSERT INTO StudentInfo VALUES("35", "Joy", "2SD22CS038", "A");
INSERT INTO StudentInfo VALUES("100", "ABC", "2SD22CS100", "C");
INSERT INTO StudentInfo VALUES("600", "EFG", "2SD22CS800", "E");

-- View the contents of table
SELECT * FROM StudentInfo;