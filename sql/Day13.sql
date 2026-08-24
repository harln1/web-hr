CREATE TABLE member(
	id int AUTO_INCREMENT PRIMARY KEY ,
	name varchar(50)  NOT NULL,
	email varchar(100) NOT NULL UNIQUE,
	age int 
);

INSERT INTO member (name,email,age)
VALUES
('홍길동','hong@test.com',20),
('김철수','kim@test.con',30);

SELECT * FROM member;

SELECT VERSION();


