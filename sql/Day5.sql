
-- **LENGTH()** 몇바이트 인지 반환

	-- 제목(title)의 길이 확인 
SELECT title, LENGTH(title) FROM film_practice ;

-- 테이블에 저장된 데이터가 아니라, 값 자체를 함수에 직접 전달해서 결과 확인가능
SELECT LENGTH('가나다'); -- >>글자수 x 바이트 수 => 9


-- **CHAR_LENGTH()** 글자수를 반환
	-- 한글 이모지를 포함해서 실제 글자 수를 보고 싶을때
SELECT CHAR_LENGTH('가나다'); -- >> 3(공백도 셈)
SELECT title,CHAR_LENGTH(title) FROM film_practice ;

-- SELECT 절에 사용하는 것 = 조회해서 확인을 하겠다

-- 문제1. 영화제목이 10자 이하인 것만 영화제목 (title)을 조회하세요
SELECT title , CHAR_LENGTH(title)
FROM film_practice
WHERE CHAR_LENGTH(title) <= 10;

-- **UPPER()** , **UCASE()**
-- UPPER() 문자열을 대문자로 변환
SELECT UPPER('Hellow MySQL');
-- >>검색에서 대소문자 무시하고 비교하고 싶을 때 사용합니다

CREATE TABLE customer_practice AS
SELECT * FROM sakila.customer; -- customer 복사해오기

SELECT * FROM customer_practice;

-- **LOWER()** 모든 글자를 소문자로 출력
-- 문제1 customer 테이블의 이름을 모두 소문자로 조회하기
SELECT first_name, LOWER(first_name)
FROM customer_practice;

-- 테이블에 들어있는 데이터가 , 대문자인지 소문자 일지 모를때
-- 전부다 대문자로 바꾸거나, 소문자로 변환해서 사용


-- **TRIM()** , **LTRIM()** , **RIRIM()**
-- 공백제거하기
SELECT TRIM( '      HI      '); -- 양쪽공백제거

SELECT LTRIM( '     HI     '); -- 왼쪽 공백제거

SELECT RTRIM( '     HI     '); -- 오른쪽 공백제

-- 특정 문자 지우기 문법 제공
SELECT TRIM('X' FROM 'XXXHELLOXXX');

-- **LPAD()** , **RPAD()**
-- 왼쪽 ㅣ 오른쪽 에 문자열을 채워 넣는 함수
-- LPAD(문자열,총길이,채울문자);
SELECT LPAD('HELLO',10,'*');
SELECT RPDAD('HELLO',10,'*');


-- 문자열 길이를 초과하게 되면 자른다
select LPAD('ABCDEF',4,'0');

-- 고객테이블에서 회원번호의 자리수를 5로 만들고
-- 빈자리는 0 으로 채워 고객 번호와 이름 조회
-- 수정된 쿼리
SELECT LPAD(CUSTOMER_ID, 5, '0'), FIRST_NAME 
FROM CUSTOMER_PRACTICE;


-- **SUBSTRING(문자열,시작위치,길이)
select SUBSTRING('Hello MYSQL',1,5);
-- 글자를 셀 때 1부터 시작
-- >> 길이를 생략하면 끝 까지 자른다
-- 음수 사용 가능함
select  MId('Hello MYSQL ',-5)

-- 문제1. '900101-1234567' 문자열에서 주민번호 앞 6자리만 자르기
select left('900101-1234567',6);

-- 문제2. photo.png 파일확장하 추출하기
select right('photo.png',4);

-- **INSTR(전체문자열 , 찾을문자열)**
-- 찾을 문자열이 시작되는 위치번호를 반환 ㅡ 위치	번호는 1부터 찾지못하면 0을반환
select 
	INSTR('HELLO','L'),
	INSTR('사과바나나포도','바나나');-- 둘다 3 , 만약 없는 딸기를 찾는다면 0
	
-- 이메일 위치 찾기
	-- USER01@TEST.COM
-- 이메일에서 아이디 부분 추출
select 
MID('USER01@TEST.COM',1,
INSTR('USER01@TEST.COM','@')-1);

select*from customer_practice;

-- 고객테이블에서 고객번호와 이메일에서 추출한 아이디를 조회하기
select CUSTOMER_ID,MID(EMAIL,1,INSTR(EMAIL,'@')-1)
from CUSTOMER_PRACTICE;

-- 고객테이블에서이메일에 @SAKILACUSTOMER.ORG 가 포함되 ㄴ 고객의 고객번호와 이름

select CUSTOMER_ID , FIRST_NAME from CUSTOMER_PRACTICE
where EMAIL like '%@SAKILACUSTOMER.ORG%';

select CUSTOMER_ID , FIRST_NAME
from CUSTOMER_PRACTICE
where INSTR(EMAIL,'@SAKILACUSTOMER.ORG')<>0;

-- CONCAT('문자열1','문자열2',...)
-- 인자로 전달된 문자열을 하나로 이어붙이는 함수이다
-- 괄호안에 들어간 문자열들ㅇ르 순서대로 이어붙인다, 문자열이 아닌 숫자도 자동ㅇ으로 문자열로 변환해서 이어붙인다

select CONCAT('HELLOW','   ','WORLD');

select CONCAT('나이: ',25,'세');

-- 문제1 고객 테이블에서 이름과 성을 연결하여 조회하기
select  CONCAT(FIRST_NAME,' ' , LAST_NAME)
from CUSTOMER_PRACTICE; 

-- REPLACE(문자열,OLD,NEW);
-- 문자열 안에 있는 OLD 문자열을 찾아서 NEW 문자열로 치환
select replace('ABCDAB','AB','XX');

-- 공백문자치환
select replace ('HELLO WORLD',' ', '_');


-- REPEAT(문자열,횟수)
-- 같은 문자열을 여러번 반복해서 이어붙임
select REPEAT('ABC',3);
select REPEAT('*',5);

CREATE TABLE member (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  email VARCHAR(100),
  phone VARCHAR(50),
  nickname VARCHAR(50)
);

INSERT INTO member VALUES
(1, '홍길동', 'gildong@test.com', '010-1234-5678', '길동이'),
(2, '김영희', 'younghee@test.com', '010-999-8888', '영희짱'),
(3, '이철수', 'chulsoo@oldmail.com', '010-7777-3333', '철수'),
(4, 'Jane', 'jane@example.com', '010-1212-3434', NULL);

select * from member;
-- 이름과 이메일을 하나의 문자열로 합쳐서 출력하기
-- 홍길동 - GILDONG@TEST.COM
select CONCAT(NAME,'-',EMAIL) from member;
-- 전화번호에서 하이픈을 모두 제거한 결과 출력하기
-- 01012345678  
select REPLACE(PHONE,'-','' ) from member;

-- 이름을 3번 반복하여 출력하기
-- 홍길동홍길동홍길동
select REPEAT(NAME,3) from member;

-- 이메일 도메인에서 @TEST.COM은 @SCHOOL.COM으로 변경하여 출력하기
select replace(EMAIL, '@TEST.COM', '@SCHOOL.COM') AS UPDATED_EMAIL
FROM member;
-- 전화번호 앞 3자리는 그냥 두고 뒤 숫자는 *로 마스킹하기
-- 010-****-****

SELECT CONCAT(LEFT(PHONE, 3), '********') AS MASKED_PHONE
FROM member;

-- 이름의 글자수와 닉네임의 글자수 구하기 
 select LENGTH(NAME) , LENGTH(NICKNAME) 
 from member;
-- 전화번호가 010 으로 시작하지 않는 회원을 찾고 국내번호아님 : 전화번호 붙여서 출력
select CONCAT('국내번호아님: ',PHONE)
from member
where left(PHONE,3) <> '010';

      
-- CUSTOMER_PRACTICE  테이블에서 이름의 첫 글자만 남기고 나머지는 다 *로 마스킹하기
SELECT RPAD(LEFT(FIRST_NAME, 1), CHAR_LENGTH(FIRST_NAME), '*') AS MASKED_NAME
FROM CUSTOMER_PRACTICE;

-- FILM 테이블에서 제못이 'A' 로 시작하는 영화만 조회하기 (LIKE X);
-- LIKE 대신 LEFT를 사용하여 'A'로 시작하는 영화 조회
SELECT title
FROM film_practice
WHERE LEFT(title, 1) = 'A';

select 10+null;
select 'A'+null;

select * from member;

-- **IFNULL()** : NULL을 다른 문자열로 치환
select CONCAT(
      NAME, 
      ' -> ', 
      CHAR_LENGTH(NAME), 
      IFNULL(NICKNAME,' 없음'), 
      ' -> ', 
      IFNULL(CHAR_LENGTH(NICKNAME),'0'))
from MEMBER;

select SUBSTRING_INDEX('A-B-C-D','-',3);


