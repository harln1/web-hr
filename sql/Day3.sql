

CREATE TABLE FRUIT (
    ID INT PRIMARY KEY,
    NAME VARCHAR(30),
    PRICE INT 
);
INSERT INTO FRUIT (ID, NAME, PRICE)
VALUES  
    (1, '사과', 3000),
    (2, '바나나', 2000),
    (3, '포도', 5000);

select * from FRUIT;
-- 한건추가
insert into FRUIT (ID,NAME,PRICE)
values (4,'복숭아',6000);

select * from FRUIT;

-- SELECT 가 된 결과를 추가하는 법
CREATE TABLE FRUIT_BACKUP(
    ID INT PRIMARY KEY,
    NAME VARCHAR(30),
    PRICE INT 
);

insert into FRUIT_BACKUP(ID,NAME,PRICE)
select ID,NAME,PRICE
from FRUIT
where PRICE <= 3000;

select * from FRUIT_BACKUP;

-- 일부컬럼만 추가
-- 만약 컬럼이 NOTNULL 이면 무조건 써야함
insert into FRUIT(ID)
values (5);

select * from FRUIT;
-- 컬럼명 생략
insert into FRUIT values (6, '딸기', 3900);

-- NULL 값 넣기
insert into FRUIT values (7, '키위',null );

