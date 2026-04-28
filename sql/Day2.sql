-- actor  테이블에서 모든 배우 정보를 조회 하고 싶을때

select actor_id , first_name , last_name , last_update
from actor;

-- 이름 , 성만 조회
select first_name, last_name
from actor;

-- film 테이블에서 영화 제목과 대여 기간 조회
select title,rental_duration from film ;

-- film 테이블에서 rental_rate  가 2.99이상인 영화 제목과 rental_rate를 조회하세요
select title , rental_rate 
from film 
where rental_rate >= 2.99;

-- film 테이블에서 영화 길이가 120분 이상인 영화의 제목과 길이를 조회
select title , length from film 
where length >= 120;

-- customer 테이블에서 actie 가 1인 고객만 조회하세요
select * from customer
where active = 1;

-- null,not null 데이터 판별하는법
-- address 테이블에서 address2 가 null인 주소를 조회하세요
select * from address 
where address2 is null;


select * from address 
where address2 is not null;


-- customer 테이블에서 성이 Smith 인 고객 조회하기
select * from customer
where last_name = 'Smith';

-- AND 두가지 이상의 조건을 비교(그리고)

-- film 테이블에서 대여요금 (rental_rate) 가 2.99 이상이고
-- 영화길이가 120 이상

select * from film
where rental_rate >= 2.99 and length >= 120;

-- or(또는 )

-- film 테이블에서 영화 등급이 PG 이거나 G 인 영화를 조회 ( rating )
select * from film 
where rating = 'PG' or rating ='G';

-- film 테이블이ㅔ서 영화길이가 60 분 이하거나 180 분 이상인 영화 조회
select title , length from film 
where length <= 60 or length >= 180;

-- payment 테이블에서 2020년 1월 1일 이후에 결제된 내역을 조회
select * from payment;

select *from payment 
where payment_date >= '2020-01-01';

-- film 테이블에서 길이가 60분이상 90분이하 영화 조회
select title, length from film
where length between  60 and 90;

-- film 테이블에서 등급이 G 또는 PG-13 인 영화의 제목,길이,등급을 조회
select title,length,rating from film
where rating in('G', 'PG_13');

-- actor 테이블에서 이름이 A 로 시작하는 배우의 이름
select last_name , first_name from actor 
where first_name like 'A%' ;

-- film 테이블에서 제목에 LOVE 가 포홤된 영화의 제목
select title from film 
where title like '%LOVE%';

-- actor 테이블에서 이름이 A로 시작하고 총 3글자인 배우의 이름을 조회
select FIRST_NAME  from actor 
where FIRST_NAME like 'A__';

-- 배우테이블에서 이름의 두번째 글자가  A 인배우
select FIRST_NAME  from ACTOR
where FIRST_NAME like '_A%'; 

-- 배우 테이블에서 이름이 정확히 4글자인 배우의 이름 조회
select FIRST_NAME from ACTOR 
where first_name like '____';

-- NOT LIKE
-- 패턴이 일치하지 않는 데이터를 조회할때
select TITLE
from FILM 
where TITLE not like 'A%';

-- CUSTOMER 테이블에서 이메일이.ORG 로 끝나는 고객을 조회
select first_name,email  from customer 
where email like '%.org';

-- film 테이블에서 제목에 dinosaur 가 포함되어 있지 않은 영화의 제목을 조회하기
select title from film 
where title not like '%dinosaur%';