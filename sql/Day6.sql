-- 숫자함수

-- ABS()
-- 절대값 구하기
SELECT ABS(-10) , ABS(10) , ABS(0); -- >> 10 10 0

-- ROUND(숫자,자릿수)
-- 반올림
SELECT 
	ROUND(1234.567,2),
	ROUND(1234.567,0),
	ROUND(1234.567),
	ROUND(1234.567,-1),
	ROUND(1234.567,-2);

-- FLOOR()
SELECT 
	FLOOR(2),
	FLOOR(2.1),
	FLOOR(-2.1);

-- TRUNCATE()
-- 버림
SELECT TRUNCATE(3.141592,2);

-- CEIL()
-- 올림
SELECT 
	CEIL(2),
	CEIL(2.1),
	CEIL(-2.1);

-- SIGN()
-- 인자로 전달된 숫자가 /양수->1 / 음수->-1 / 0->0 / NULL->NULL
SELECT
	SIGN(-238),
	SIGN(238),
	SIGN(0);

-- MOD()
-- 나누기 했을때 나머지
SELECT 
	MOD(1,3),
	MOD(2,4);

-- POWER(밑값, 지수)
SELECT 
	POWER(2,1),
	POWER(2,2);

-- RAND()
-- 0 이상 1 미만의 난수 반환
SELECT
	RAND();
-- GREATEST() / LEAST()
-- 최대값 , 최솟값을 반환
SELECT
	GREATEST(1,2,10);

SELECT 
	LEAST(10,14,1);

CREATE TABLE sales (
  id INT PRIMARY KEY,
  product VARCHAR(50),
  price DECIMAL(10,2),
  quantity INT,
  discount_rate DECIMAL(5,2)  -- 할인율(예: 0.15 → 15%)
);

INSERT INTO sales VALUES
(1, 'Keyboard', 29900, 2, 0.10),
(2, 'Mouse',    15900, 3, 0.05),
(3, 'Monitor',  199000, 1, 0.20),
(4, 'USB',       8900, 10, 0.00),
(5, 'Speaker',  45500, 4, 0.15);

SELECT * FROM sales;

-- 각 상품의 제품명과 가격을 3으로 나눈 나머지

SELECT id , product, price , MOD(price,3) 
FROM sales;
  

-- 모든 내용을 조회하되, 할인률은 %로 표시하기
SELECT id , product,CONCAT(ROUND(DISCOUNT_RATE*100),'%')
FROM sales;
-- 세일즈 테이블에서 
# 아이디, 제품명, 가격, 재고, 총 가격(소수점 아래 버림)을 조회하시오
SELECT 
    id, 
    product, 
    price, 
    quantity, 
    FLOOR(price * quantity) AS total_price
FROM sales;
-- 1 ~ 100사이의 난수를 생성하세요
SELECT FLOOR(1 + (RAND() * 100)) AS random_number;

-- 실시간 퇴근 카운트다운 (MySQL/MariaDB 기준)
SELECT  
    TIMEDIFF('18:30:00', CURTIME()) AS '남은_시간',
    TIMESTAMPDIFF(SECOND, NOW(), CONCAT(CURDATE(), ' 18:30:00')) AS '남은_초';

-- FORMAT()
-- 숫자를 사람이 보기 좋게 문자열 형태로 포맷팅
-- 천단위 콤마(,) + 소수점 자리수 지정을 자동으로 해준다
SELECT FORMAT(1234567,0);

-- COdate() 

   
