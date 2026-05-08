-- 1. rollup_practice라는 이름의 데이터베이스 만들기
-- 2. 스크립트를 데이터베이스와 연결하기
-- 3. sales테이블 만들기
DROP TABLE IF EXISTS sales;
CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    region VARCHAR(20) NOT NULL,
    category VARCHAR(20) NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    sales_amount INT NOT NULL,
    sales_date DATE NOT NULL
);

INSERT INTO sales (region, category, product_name, sales_amount, sales_date) VALUES
('서울', '전자제품', '노트북', 1200000, '2026-05-01'),
('서울', '전자제품', '마우스', 50000, '2026-05-01'),
('서울', '가구', '의자', 150000, '2026-05-02'),
('서울', '가구', '책상', 300000, '2026-05-02'),
('부산', '전자제품', '노트북', 1100000, '2026-05-01'),
('부산', '전자제품', '키보드', 80000, '2026-05-02'),
('부산', '가구', '의자', 130000, '2026-05-03'),
('부산', '가구', '책상', 280000, '2026-05-03'),
('대구', '전자제품', '마우스', 45000, '2026-05-01'),
('대구', '전자제품', '키보드', 75000, '2026-05-02'),
('대구', '가구', '의자', 120000, '2026-05-03'),
('대구', '가구', '책상', 250000, '2026-05-03');

SELECT * FROM sales;

--  별칭(alias)
-- SELECT 컬럼명 AS 별칭 FROM 테이블명;
-- FROM 테이블명 AS 별칭;
-- AS  생략가능

-- 컬럼이나 테이블에 임시 이름을 붙이는 기능
-- 컬럼의 이름을 보기좋게 변경하거나 , 테이블 이름을 짧게 줄인다
-- 아니면, 함수를 걸었을 때 너무 길지면 별명주기 가능

SELECT category 카테고리 , avg_amount AS "평균판매량"
FROM(
SELECT category , avg(sales_amount) AS avg_amount
FROM sales 
GROUP BY category
)AS t;
-- 서브쿼리로 조회된 결과에는 이름이 없기 때문애
-- 섭브쿼리로 조회된 테이블에는 별칭이 필수다


-- 부서별 평균을 inline view 를 활용해서 조회하기
-- 출력 컬럼 ㅣdepartment, avg_salary

SELECT 
    e_avg.부서명, 
    e_avg.평균급여
FROM (
    SELECT 
        department AS 부서명, 
        AVG(salary) AS 평균급여
    FROM employee
    GROUP BY department
) AS e_avg;
 
 
-- 학생 테이블
CREATE TABLE student (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO student (id, name) VALUES
(1, '철수'),
(2, '영희'),
(3, '민수');

-- 수강 테이블
CREATE TABLE enroll (
  id INT PRIMARY KEY,
  student_id INT,
  class_name VARCHAR(50)
);

INSERT INTO enroll (id, student_id, class_name) VALUES
(1, 1, '데이터베이스'),
(2, 1, '자바'),
(3, 2, '데이터베이스');

SELECT s.name, e.class_name
FROM student s
INNER JOIN enroll e 
ON s.id = e.student_id;
-- on = where 역할을함
  -- on 절로 연결기준을 알려줘야한다



CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(30),
    grade VARCHAR(20)
);

CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    category VARCHAR(30),
    price INT
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    quantity INT,
    order_date DATE,

    CONSTRAINT fk_orders_customer
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),

    CONSTRAINT fk_orders_product
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);


 INSERT INTO customer VALUES
(1, '김민준', 'VIP'),
(2, '이서연', '일반'),
(3, '박지훈', 'VIP'),
(4, '최유나', '일반'),
(5, '정하늘', '실버');

INSERT INTO product VALUES
(101, '노트북', '전자제품', 1200000),
(102, '마우스', '전자제품', 50000),
(103, '키보드', '전자제품', 80000),
(201, '의자', '가구', 150000),
(202, '책상', '가구', 300000);

INSERT INTO orders VALUES
(1, 1, 101, 1, '2026-05-01'),
(2, 1, 102, 2, '2026-05-01'),
(3, 2, 201, 1, '2026-05-02'),
(4, 3, 101, 1, '2026-05-02'),
(5, 3, 202, 1, '2026-05-03'),
(6, 4, 103, 3, '2026-05-03'),
(7, 5, 201, 2, '2026-05-04'),
(8, 5, 102, 1, '2026-05-04');


-- 고객명 상품명 주문수량 주문일자 조회하기
SELECT 
    c.customer_name AS "고객명",
    SUM(p.price * o.quantity) AS "총 구매금액"
FROM customer c
JOIN orders o ON c.customer_id = o.customer_id   
JOIN product p ON o.product_id = p.product_id    
GROUP BY c.customer_id, c.customer_name;


-- VIP 고객의 주문내역 조회하기
-- 이름 등급 제품명 주문수량 주문날짜
SELECT 
    c.customer_name AS "이름",
    c.grade AS "등급",
    p.product_name AS "제품명",
    o.quantity AS "주문수량",
    o.order_date AS "주문날짜"
FROM customer c
JOIN orders o ON c.customer_id = o.customer_id
JOIN product p ON o.product_id = p.product_id
WHERE c.grade = 'VIP';

SELECT name , class_name
FROM student s 
LEFT OUTER JOIN enroll e
ON s.id = E.student_id ;
-- 민수는 수강내역이 없지만 왼쪽 테이블에 있었으므로 반드시 나온다
-- 대신 enroll쪽 값이 없기때문에 null로 채워진다

INSERT INTO customer VALUES
(6, '한지민', '일반');

INSERT INTO product VALUES
(203, '소파', '가구', 700000);

-- 주문내역이 한번도 없는 고객의 이름을 조회하기 LEFT JOIN
SELECT c.customer_name
FROM customer c
LEFT JOIN orders o ON c.customer_id = o.customer_id
WHERE o.order_id IS NULL;


-- 오른쪽 테이블 기준 전부 출력하는 right join
SELECT 
    c.customer_name, 
    o.order_id, 
    o.order_date
FROM customer c
RIGHT JOIN orders o ON c.customer_id = o.customer_id;
-- 실무에서는  left join 을 더 자주 사용한다

-- 양쪽 테이블의 모든 데이터를 조회 full outer join
-- 일치하면 연결 일치하지 않으면 없는쪽으로 null 표시

CREATE TABLE color (
  name VARCHAR(20)
);

INSERT INTO color VALUES ('빨강'), ('파랑');

CREATE TABLE size (
  name VARCHAR(20)
);

INSERT INTO size VALUES ('S'), ('M'), ('L');

-- 색상과 싸이즈의 모든 조합을 만들어보자
SELECT c.name , e.name
FROM color c 
CROSS JOIN size e ;
CREATE TABLE employee (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  manager_id INT  -- 상사의 id
);

DROP TABLE IF EXISTS employee; -- 기존 데이터를 싹 지웁니다.

DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
    id INT PRIMARY KEY,         
    name VARCHAR(50),           
    manager_id INT              
);

INSERT INTO employees VALUES
(1, '대표', NULL),
(2, '팀장', 1),
(3, '사원A', 2),
(4, '사원B', 2);


SELECT 
    e.name AS employee_name,
    m.name AS manager_name
FROM employees e                
LEFT OUTER JOIN employees AS m
ON e.manager_id = m.id;


-- 모든 고객과 상품의 가능한 조합을 조회하세요
SELECT 
    c.customer_name, 
    p.product_name
FROM customer c
CROSS JOIN product p;

-- 모든 상품 조합 개수 조회
SELECT COUNT(*) AS total_combinations
FROM product p1
CROSS JOIN product p2;


ALTER TABLE customer ADD COLUMN recommender_id INT;

UPDATE customer
SET recommender_id = NULL
WHERE customer_id = 1;

UPDATE customer
SET recommender_id = 1
WHERE customer_id = 2;

UPDATE customer
SET recommender_id = 1
WHERE customer_id = 3;

UPDATE customer
SET recommender_id = 2
WHERE customer_id = 4;

UPDATE customer
SET recommender_id = 3
WHERE customer_id = 5;


SELECT * FROM customer ;

-- 모든 고객과 전자제품 카테고리 상품 조합 조회
SELECT 
    c.customer_name , p.product_name 
FROM customer c
CROSS JOIN product p;

-- 모든 상품 조합 개수 조회
SELECT count(*)
FROM customer c 
CROSS JOIN product p ;

-- 모든 고객과 전자제품 카테고리 상품 조합 조회
SELECT c.customer_name , p.product_name,p.category 
FROM customer c
CROSS JOIN product p
WHERE p.category = '전자제품';

-- 고객명과 추천인 이름을 조회
SELECT c.customer_name ,r.customer_name
FROM customer c
LEFT JOIN customer r
ON c.recommender_id = r.customer_id;

-- 추천인이 없는 고객 조회
SELECT customer_name
FROM customer
WHERE recommender_id IS NULL;

-- 추천 관계 문장 출력하기
-- 이시연의 추천인은 김민준 등등
SELECT 
    CONCAT(c.customer_name, '의 추천인은 ', IFNULL(r.customer_name, '없음'), '입니다.') AS "추천 관계"
FROM customer c 

LEFT JOIN customer r ON c.recommender_id = r.customer_id;

-- 가장많은 고객 을 추천한 사람순으로 조회하기
SELECT 
    r.customer_name AS "추천인", 
    COUNT(c.customer_id) AS "추천수"
FROM customer c
JOIN customer r ON c.recommender_id = r.customer_id
GROUP BY r.customer_id, 

r.customer_name
ORDER BY 추천수 DESC;

create view customer_address_view as
select c.first_name, c.last_name, a.address
from customer c 
inner join address a
on c.address_id = a.address_id;
-- 복잡한 SELECT를 테이블처럼 사용할 수 있다.
select * from customer_address_view;

-- 영화 번호(film),
-- 영화 제목(film), 
-- 카테고리(film_category), 
-- 대여료(film)를 조회하는 SELECT문을
-- film_category_view라는 이름의 view로 만들기





create view film_category_view as
select f.film_id, f.title, c.name as category_name, f.rental_rate
from film f 
inner join film_category fc
on f.film_id = fc.film_id
inner join category c 
on c.category_id = fc.category_id
order by film_id;

select * from film_category_view;

-- 고객별 영화 대여 횟수를 customer_rental_count_view로 만들기
create view customer_rental_count_view as
select 
	c.customer_id,
	c.first_name,
	c.last_name,
	count(r.rental_id) as rental_count
from customer c
inner join rental r
on c.customer_id = r.customer_id
group by
	c.customer_id,
	c.first_name,
	c.last_name;

select * from customer_rental_count_view;

-- 30번 이상 빌려본 고객의 정보를 조회하세요
select * from customer_rental_count_view
where rental_count >= 30;

-- view를 사용하면 좋은 경우
-- 1. 복잡한 join과 조건이 반복될 때
-- 2. 비즈니스 규칙을 숨겨둘 때
-- 3. 보안,권한 제어용으로 사용한다.

-- 고객이름 , 주문한 제품명을 left outer join 을 이용하여 조회하기
SELECT c.customer_name, p.product_name
FROM customer c
LEFT OUTER JOIN orders o 
ON c.customer_id = o.customer_id
LEFT OUTER JOIN product p 
ON o.product_id = p.product_id 
 WHERE product_name = '노트북';



