-- DEFAULT 값 사용
insert into tbl_student (ID,NAME,MAJOR,BIRTH)
values (1, '홍길동' , '컴퓨터 공학','2020-01-01');

select * from tbl_student ts ;

-- 문자열데이터, 날짜데이터  넣을떼 작은 따옴표

insert into tbl_student (ID,NAME,MAJOR,GENDER,BIRTH)
values (2,'이영희','산업디자인','W','2020-01-01');

insert into tbl_student (ID,NAME,MAJOR,GENDER,BIRTH)
values (3, '김철수','화학공학','M','1980-01-02');

select * from tbl_student ts ;


select * from flower ;
INSERT INTO flower (FLOWER_NAME, FLOWER_COLOR, FLOWER_PRICE)
VALUES  
    ('장미', '빨간색' , 3000),
    ('해바라기', '노란색' , 6000),
    ('튤립', '보라색' , 5000),
    ('안개꽃', '흰색' , 2000);

select * from POT;
INSERT INTO POT (pot_ID, potCOLOR, SHAPE, FLOWER_NAME) 
VALUES ('2026001', '흰색', '타원형', '장미'),
		('2026002', '검은색', '네모', '해바라기');

select * from 

-- TBL_STUDENT 테이블에 홍길동 이름을 김길동변경
select * from tbl_student ts ;

update tbl_student ts 
set name = '김길동'
where id = 1;

-- DEFAULT 값으로 바꾸기
update tbl_student 
set GENDER = default
where ID = 3;

select * from tbl_student ts ;


-- 여러 조건으로 UPDATE 하기
-- AND 를 사요ㅕㅇ해서 조건을 모두 만족싴티는 행만 수정
-- 꽃 테이블에서 색이 보라색이고 가격이 5000원 이상인 꽃의ㅣ 이름을 진달래도 바꾸기
select * from FLOWER;
UPDATE flower 
SET flower_name = '진달래'           
WHERE flower_color = '보라색'        
  AND flower_price >= 5000;         

create table actor_practice as
select actor_id , first_name , last_name , last_update
from sakila.actor;

select * from actor_practice;

-- 배우번호가 1인 배우의 이름을 'JAMES' 로 수정
update actor_practice
set first_name = 'JAMES'
where actor_id = 1;

select * from actor_practice;

-- 배우번호가 2인 배우의 이름을 'MINA' 성을 'LEE'
update  actor_practice
set first_name = 'MINA' , last_name = 'LEE'
where actor_id = 2;

-- sakila데이터베이스에 있는 film 테이블을 film_practice 로 복사
create table film_practice as
select * from  sakila.film;

select * from film_practice;
-- 영화번호가ㅣ 1인 영화의 대여가격 rental_rate 를 4.99 로 수정
update film_practice
set rental_rate = 4.99
where film_id = 1;


-- 배우 테이블에서 이름이 A 로 시작하는 배우의 성을 'TEST' 로 바꾸기
update actor_practice
set last_name = 'TEST'
where first_name = 'A%';

-- 영화테입르에서 등급이 'R' , 또는 'NC-17' 인 영화의 대여기간 3ㅇ,러수ㅈㅇ
update film_practice
set rental_duration = 3 -- 수정하고자 하는 속성
where rating in ('R','NC17'); -- 조건

select * from FILM_PRACTICE;
-- 영화번호가 1인 영화에 대해 대여기간을 1증가시키기
select TITLE , RENTAL_DURATION from FILM_PRACTICE
where FILM_ID = 1;

update FILM_PRACTICE
set RENTAL_DURATION = RENTAL_DURATION + 1
where FILM_ID = 1;

select * from FILM_PRACTICE; 

-- 영화 테이블의 대여료 를 10퍼센트인상
update FILM_PRACTICE
set RENTAL_RATE =RENTAL_RATE * 1.1 ;



select title , rental_rate from film_practice;

select * from actor_practice;
-- 배우 테이블에서 id 가 1인 배우 삭제
delete from actor_practice
where actor_id = 1;

select * from actor_practice
where actor_id = 1;

-- 여러행을삭제
-- 이름이 john 인 배우 모두 삭제
delete from actor_practice
where first_name = 'JOHN';

select * from actor_practice
where FIRST_NAME = 'JOHN';

-- LIKE 를 이용한 삭제
-- 이름이 A 로 시작하는 배우삭제
-- `where 컬럼명 like '패턴';`
delete from ACTOR_PRACTICE
where FIRST_NAME like 'A%';

select * from ACTOR_PRACTICE
where FIRST_NAME = 'A';
-- 데이터만 전부 삭제
delete from ACTOR_PRACTICE;

-- FLOWER 테이블의 장미 삭제
select * from flower f ;

delete from flower 
where FLOWER_NAME = '장미'; -- >> POT에서 장미를 참조하고있기 때문에 삭제 불가!!!!!!!
