-- 외래키 설정
-- constrain 이름 forign key컬럼명 references 테이블명(컬럼명);
-- customer 테이블
CREATE TABLE customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY, 
    customer_name VARCHAR(50),                 
    city VARCHAR(30),                          
    grade VARCHAR(20)                          
);


CREATE TABLE product(
product_id int AUTO_INCREMENT PRIMARY KEY,
product_name varchar(100),
category varchar(50),
price int,
stock int 
);

-- 주문내역
CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    status VARCHAR(20),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);
-- 상품정보저장
CREATE TABLE order_item (
    order_item_id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    product_id INT,
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

INSERT INTO customer (customer_name, city, grade) VALUES
('김민준', '서울', 'VIP'),
('이서연', '부산', 'GOLD'),
('박지훈', '대구', 'SILVER'),
('최유진', '서울', 'VIP'),
('정하늘', '광주', 'GOLD');

INSERT INTO product (product_name, category, price, stock) VALUES
('기계식 키보드', '전자기기', 120000, 20),
('무선 마우스', '전자기기', 50000, 50),
('모니터 받침대', '가구', 35000, 30),
('사무용 의자', '가구', 200000, 10),
('텀블러', '생활용품', 25000, 100),
('노트북 거치대', '전자기기', 70000, 15);

INSERT INTO orders (customer_id, order_date, status) VALUES
(1, '2026-05-01', '완료'),
(1, '2026-05-03', '완료'),
(2, '2026-05-04', '완료'),
(3, '2026-05-05', '취소'),
(4, '2026-05-06', '완료'),
(5, '2026-05-07', '완료');

INSERT INTO order_item (order_id, product_id, quantity) VALUES
(1, 1, 1),
(1, 2, 2),
(2, 5, 3),
(3, 3, 2),
(3, 6, 1),
(4, 1, 1),
(5, 4, 2),
(6, 5, 5);


-- view 이름 : v_order_detail
-- 조회할 컬럼
-- order_id
-- customer_name
-- city
-- product_name
-- category
-- quantity
-- price * quantity (별칭  order_amount)
-- order_date
-- status
CREATE VIEW v_order_detail AS
SELECT 
    o.order_id,
    c.customer_name,
    c.city,
    p.product_name,
    p.category,
    oi.quantity,
    (p.price * oi.quantity) AS order_amount,
    o.order_date,
    o.status
FROM orders o
JOIN customer c ON o.customer_id = c.customer_id
JOIN order_item oi ON o.order_id = oi.order_id
JOIN product p ON oi.product_id = p.product_id;

SELECT * FROM v_order_detail;

-- v_order_detail view 를 사용해서
-- 주문금액이 100,000 원 이상인 데이터만 조회하기
-- 조회컬럼 : 주문자 이름, 제품명 , 주문금액
SELECT 
    customer_name, 
    product_name, 
    order_amount
FROM v_order_detail
WHERE order_amount >= 100000;

-- view 기반 통계 view 생성하기
-- v_order_detail 을 사용하여 고객별 총 구매금액을 저장하는 v_customer_datail view 만들기
-- customer_name ㅡ 총 구매금액 (total_amount)
-- 취소주문은 제외한다
CREATE VIEW v_customer_detail AS
SELECT 
    customer_name, 
    SUM(order_amount) AS total_amount
FROM v_order_detail
WHERE status != '취소'  
GROUP BY customer_name;

SELECT * FROM v_customer_detail;

-- v_customer_detail 를 활용하여 총 구매금액이 200000이상인 고객만 조회하는 v_vip_customer 뷰 만들기
CREATE VIEW v_vip_customer AS
SELECT *
FROM v_customer_detail
WHERE total_amount >= 200000;


DROP VIEW IF EXISTS v_vip_customer; -- 가장 마지막에 만든 뷰 삭제
-- 혹시나 삭제를 하게 된다면 마지막부터 역순으로 삭제를 하는것을 권장합니다


SELECT * FROM  v_vip_customer;

-- v_customer_detail 을 활용하여 
-- 구매금액 순위를 조회하세요
-- 이름 , 구매가격 , 순위
SELECT 
    customer_name, 
    total_amount,  
    RANK() OVER (ORDER BY total_amount DESC) AS rank_val
FROM v_customer_detail;
 
-- v_customer_detail 뷰를 사용하여 전체 평균 구매 금액보다 높으 녹객만 조회하새요
SELECT 
    customer_name, 
    total_amount 
WHERE total_amount > (SELECT AVG(total_amount) FROM v_customer_detail);

 
