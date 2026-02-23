CREATE DATABASE classroom;

USE classroom;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    department VARCHAR(50)
);


INSERT INTO students VALUES
(1, 'Amit Kumar', 21, 'CSE'),
(2, 'Sneha Patil', 22, 'ECE'),
(3, 'Rahul Verma', 23, 'ME'),
(4, 'Kumkum Kumari', 32, 'IT');


SELECT * FROM students;
