DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS product;

CREATE TABLE product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price INT NOT NULL,
    stock INT NOT NULL
);

INSERT INTO product(product_name, category, price, stock) VALUES
('기계식 키보드', '전자기기', 120000, 20),
('무선 마우스', '전자기기', 50000, 50),
('모니터 받침대', '가구', 35000, 30),
('사무용 의자', '가구', 200000, 10),
('텀블러', '생활용품', 25000, 100),
('노트북 거치대', '전자기기', 70000, 15);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    total_price INT NOT NULL,
    order_date DATETIME DEFAULT NOW()
);
SELECT * FROM product ;

-- 전체 상품 조회 프로시저 만들기
-- 이름 : get_all_procedure
-- product 테이블 의 전체 상품을 조회한다
-- 가격이 높은 순서대로 정렬한다

DELIMITER //
CREATE PROCEDURE get_all_procedure()
BEGIN
    SELECT * FROM product 
    ORDER BY price DESC;
END //
DELIMITER ;

CALL get_all_procedure();



-- 상품 id로 상품 조회하기
-- 이름 : get_product_by_id
-- 상품  id 를 전달받아서 해당 상품 정보를 조회
DROP PROCEDURE IF EXISTS get_product_by_id;
DELIMITER //
CREATE PROCEDURE get_product_by_id(IN p_id INT)
BEGIN
    SELECT * FROM product WHERE product_id = p_id;
END //
DELIMITER ;
CALL get_product_by_id(1);


-- 카테고리별 상품 조회하기
-- 이름 : get_product_by_category
-- 카테고리명을 입력받는다
-- 헤당 카테고리의 상품만 조회한다 가격이 낮은 순으로 정렬한다
DROP PROCEDURE IF EXISTS get_product _by_category;

DELIMITER //

CREATE PROCEDURE get_product_by_category(IN p_category VARCHAR(50))
BEGIN
    SELECT * 
    FROM product 
    WHERE category = p_category 
    ORDER BY price ASC;
END //

DELIMITER ;
CALL get_product_by_category('전자기기');


-- 상품 재고를 반환하기
-- 이름 : get_product_stock
-- 상품 ID 를 입력받는다 해당 상품의 재고를 OUT 매개변수로 반환한다
-- 호출 후 세션 변수로 결과를 확인한다
-- 3. 상품 재고 반환 (OUT 매개변수 사용)
-- 기존에 잘못 생성 시도된 프로시저가 있다면 삭제
DROP PROCEDURE IF EXISTS get_product_stock;

DELIMITER //

CREATE PROCEDURE get_product_stock(IN p_id INT, OUT p_stock INT)
BEGIN
    SELECT stock INTO p_stock 
    FROM product 
    WHERE product_id = p_id;
END //

DELIMITER ;

-- 실행 및 확인
CALL get_product_stock(5, @my_stock);
SELECT @my_stock;

-- 상품 추가 프로시저 만들기
-- 이름 :insert_product
-- 상품명 카테고리 가격 재고를 입력받아서 product 테이블에 상품을 추가한다 추가후 전체 상품 목록을 조회한다

-- 기존 프로시저가 있다면 삭제
DROP PROCEDURE IF EXISTS insert_product;

DELIMITER //
CREATE PROCEDURE insert_product(
    IN p_name VARCHAR(100),
    IN p_category VARCHAR(50),
    IN p_price INT,
    IN p_stock INT
)
BEGIN
    INSERT INTO product(product_name, category, price, stock)
    VALUES (p_name, p_category, p_price, p_stock);
    SELECT * FROM product ORDER BY price DESC;
END //
DELIMITER ;

CALL insert_product('웹캠', '전자기기', 80000, 25);

-- 상품 가격 수정하기
-- 이름 : update_product_price
-- 상품 id 와 변경할 가격을 입력받는다
-- 해당 상품의 가격을 수정한다
-- 수정된 행이 있으면 " 가격이 수정되었습니다 " 출력 , 수정된 행이 없으면 " 해당 상품이 없습니다 " 출력
-- row_count() : 변경된 행의 갯수
DELIMITER //
CREATE PROCEDURE update_product_price(
	IN p_id INT ,
	IN p_new_price INT
)
BEGIN
	UPDATE product
	SET price = p_new_price
	WHERE product_id = p_id;
	IF ROW_COUNT() > 0 THEN
		SELECT '가격이 수정되었습니다' AS 결과;
	ELSE 
		SELECT '해당 상품이 없습니다' AS 결과;
	 END IF;
END //
DELIMITER ;

CALL update_product_price(1,150000);
SELECT * FROM product;



-- 상품이 있으면 수정하고 없으면 추가하기
-- 이름 : upsert_product 
--  상품id 상품명 카테고리 가격 재고를 입력받는다
-- 입력받은 상품 id 가 product 테이블에 존재하면 상품 정보를 수정한다
-- 존대하지 않으면 새로운 상품을 추가한다
-- 처리 결과 메시지를 출력한다
DELIMITER //
CREATE PROCEDURE upsert_product (
	IN p_id INT,
	IN p_name VARCHAR(100),
	IN p_category VARCHAR(50),
	IN p_price INT,
	IN p_stock INT 
)
BEGIN 
	IF EXISTS (SELECT 1 FROM product WHERE product_id = p_id)THEN
	UPDATE product
	SET product_name = p_name,
		category = p_category,
		 price = p_price, 
         stock = p_stock
    WHERE product_id = p_id;
        
    SELECT '상품 정보가 수정되었습니다.' AS 결과;
ELSE
        INSERT INTO product(product_id, product_name, category, price, stock)
        VALUES (p_id, p_name, p_category, p_price, p_stock);
        
        SELECT '새로운 상품이 추가되었습니다.' AS 결과;
    END IF;

 
    SELECT * FROM product WHERE product_id = p_id;
END //
DELIMITER ;

CALL upsert_product(1,'업그레이드 키보드','전자기기',150000,10);
CALL upsert_product(10, '새로운 웹캠', '전자기기', 45000, 20);
SELECT * FROM product ;


-- 상품이 있으면 수정하고 없으면 추가하기
-- 이름 : upsert_product
-- 상품 id, 상품명, 카테고리, 가격, 재고를 입력받는다
-- 입력받은 상품 id가 product테이블에 존재하면 상품 정보를 수정한다.
-- 존재하지 않으면 새로운 상품을 추가한다.
-- 처리 결과 메시지를 출력한다. 
DELIMITER //
CREATE PROCEDURE upser_product(
	IN p_id int,
	IN p_name varchar(100),
	IN p_category varchar(50),
	IN p_price int,
	IN p_stock int 
)
BEGIN 
	IF EXISTS (
	SELECT 1 FROM product WHERE product_id = p_id) THEN
	UPDATE product 
	SET product_name = p_name,category = p_category,
            price = p_price,
            stock = p_stock
        WHERE product_id = p_id;
        
        SELECT '기존 상품 정보가 수정되었습니다.' AS message;
    ELSE
        -- 존재하지 않으면 새 상품으로 추가
        -- p_id를 직접 지정하여 삽입 (AUTO_INCREMENT가 있어도 수동 입력 가능)
        INSERT INTO product (product_id, product_name, category, price, stock)
        VALUES (p_id, p_name, p_category, p_price, p_stock);
        
        SELECT '새로운 상품이 추가되었습니다.' AS message;
    END IF;

    -- 최종 결과 확인을 위한 조회
    SELECT * FROM product WHERE product_id = p_id;
END //
DELIMITER ;

CALL upsert_product(1, '최고급 기계식 키보드', '전자기기', 150000, 10);

-- 상품 id가 있으면 삭제하고 없으면 없다 메시지 출력하기
-- 이름 : delete_product_if_exists
-- 상품 id를 입력받고 해당 상품 id가 있으면 삭제한다.
-- 해당 상품 id가 없으면 "데이터가 없습니다."를 출력한다.
-- 삭제 성공 시 "삭제되었습니다."를 출력한다.

DELIMITER //
CREATE PROCEDURE delete_product_if_exists(IN p_id INT)
BEGIN
    DELETE FROM product 
    WHERE product_id = p_id;

    IF ROW_COUNT() > 0 THEN
        SELECT '삭제되었습니다.' AS 결과;
    ELSE
        SELECT '데이터가 없습니다.' AS 결과;
    END IF;
END //
DELIMITER ;

CALL delete_product_if_exists(10);

-- 주문 처리 프로시저 만들기
-- 이름 : order_product
-- 상품 ID와 주문 수량을 입력받는다.
-- 상품이 존재하지 않으면 "상품이 존재하지 않습니다." 출력하기
-- 재고가 부족하면 "재고가 부족합니다" 출력하기
-- 재고가 충분하면 orders 테이블에 주문을 추가한다.
-- 주문 후 product테이블의 재고를 차감한다.
-- 주문 성공 시 "주문이 완료되었습니다."를 출력한다.
DROP PROCEDURE IF EXISTS order_product;
delimiter //
create procedure order_product(
   in p_product_id int,
   in p_quantity int
)
begin
   declare v_count int;
   declare v_stock int;
   declare v_price int;
   
   select count(*)
   into v_count
   from product
   where product_id = p_product_id;
   
   if v_count = 0 then
      select '상품이 존재하지 않습니다' as message;
   else
      -- 가격과 재고를 조회하여 사용하기 위해 변수에 담는다.
      select price, stock
      into v_price, v_stock
      from product
      where product_id = p_product_id;
   
      if v_stock < p_quantity then
         select '재고가 부족합니다.' as message;
      else -- v_stock >= p_quantity
         -- 주문내역을 orders 테이블에 추가
         insert into orders (product_id, quantity, total_price)
         values (p_product_id, p_quantity, v_price * p_quantity);
         
         -- 주문한 수량만큼 제품의 재고를 차감
         update product
         set stock = stock - p_quantity
         where product_id = p_product_id;
         
         select '주문이 완료되었습니다.' as message;
      end if;
   end if;
end //
delimiter ;

call order_product(1,2);

-- 가격 등급 조회 프로시저
-- 이름 : get_price_grade
-- 상품 id를 입력받는다.
-- 가격이 100,000원 이상이면 "고가 상품"이라고 출력하기
-- 50,000원 이상 100,000 미만이면 "중간 가격 상품"을 출력하기
-- 상품 가격이 50,000원 미만이면 "저가 상품" 출력하기
-- 상품이 없으면 "상품이 없습니다." 출력하기


DELIMITER //

CREATE PROCEDURE get_price_grade(IN p_id INT)
BEGIN
    DECLARE v_price INT;

    SELECT price INTO v_price 
    FROM product 
    WHERE product_id = p_id;

    IF v_price IS NULL THEN
        SELECT '상품이 없습니다.' AS 결과;
    ELSEIF v_price >= 100000 THEN
        SELECT '고가 상품' AS 결과;
    ELSEIF v_price >= 50000 THEN
        SELECT '중간 가격 상품' AS 결과;
    ELSE 
        SELECT '저가 상품' AS 결과;
    END IF;
END //

DELIMITER ;

CALL get_price_grade(4);

-- 기본문법
-- CASE
-- when 조건식1 then 결과1
-- when 조건식2 then 결과2
-- when 조건식3 then 결과3
-- else 기본결과
-- end

-- product 테이블에서 상품명, 재고
-- 재고가 50 개 이상이면 '재고많음'
-- 10 개 이상이면 '재고보통'
-- 그 미만은 '재고부족'
SELECT 
	product_name
	stock,
	CASE
		WHEN stock >= 50 THEN '재고많음'
		WHEN stock >= 10 THEN '재고보통'
		ELSE '재고부족'
	END AS stock_status
FROM product;

-- when 은 조건
-- then 은 조건이 참일때 반환하는 값
-- else 은 어떠한 조건도 만족하지 않을 때 반환할 값
-- end 는 case문의 끝을 의미한다
-- case문은 위에서 아래로 조건을 검사한다
-- 범위 조건은 큰 조건부터 작은 조건 순서대로 작성해야한다

-- 특정 컬럼의 값이 무엇인지 비교할 때 사용할 수 있다
SELECT 
	product_name,
	category,
	CASE category
		WHEN '전자기기' THEN '전자제품 코너'
		WHEN '가구' THEN '가구코너'
		WHEN '생활용품' THEN '생활용품 코너'
		ELSE '기타코너'
	END AS display_area
FROM product;

-- case 문은 order by에서도 사용가능
SELECT
	product_name,
	stock
FROM product
ORDER BY 
	CASE 
		WHEN stock < 10 THEN 1
		WHEN stock < 30 THEN 2
		ELSE 3
	END ASC, 
	stock ASC;

-- update 문에서도 사용가능
ALTER TABLE product ADD status varchar(20);

UPDATE product 
SET status = 
	CASE 
		WHEN stock <= 10 THEN '재고부족'
		ELSE '판매중'
	END;
SELECT * FROM product;
	

-- group by 와 집걔애도 자주 사용된다

-- 상품이 가격대별로 몇개씩 있는지 조회하기
SELECT 
	CASE
		WHEN price >= 100000 THEN '고가'
		WHEN price >= 50000 THEN '중가'
		ELSE '저가'
	END AS price_level,
	count(*) AS product_count
FROM product
GROUP BY price_level;
	
-- sum 과 case 를 같이 사용하면 조건별 집계가 가능하다
-- 조건별 갯수를 직접 하나하나 계산한다
SELECT 
	sum(CASE WHEN category = '전자기기' THEN 1 ELSE 0 END ) AS electronics_count,
	sum(CASE WHEN category = '가구' THEN 1 ELSE 0 END ) AS furniture_count,
	sum(CASE WHEN category = '생활용품' THEN 1 ELSE 0 END ) AS life_count
FROM product;

-- 카테고리 별로 그룹을 만듦
SELECT
	category,count(*)
FROM product p 
GROUP BY category ;

CREATE TABLE student_score (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(30),
    subject VARCHAR(30),
    score INT,
    attendance_rate INT
);
INSERT INTO student_score VALUES
(1, '김철수', 'Java', 95, 98),
(2, '이영희', 'Java', 82, 90),
(3, '박민수', 'Java', 67, 75),
(4, '최유리', 'Database', 88, 92),
(5, '정하늘', 'Database', 73, 80),
(6, '한지민', 'Database', 55, 60),
(7, '강민호', 'Python', 100, 100),
(8, '윤서연', 'Python', 45, 50);
SELECT * FROM student_score;
-- 점수 등급 출력하기
-- 90점이상 A
-- 80점 이상 B
-- 70점이상 C
-- 60점 이상 D
-- 그외 F
-- 출력 컬럼 student_name,score,grade
SELECT
	student_name, 
    score,
    CASE 
        WHEN score >= 90 THEN 'A'
        WHEN score >= 80 THEN 'B'
        WHEN score >= 70 THEN 'C'
        WHEN score >= 60 THEN 'D'
        ELSE 'F'
    END AS grade
FROM student_score;

-- 출석상태 출력하기
-- 95이상 우수
-- 80 이상 보통 . 그외 위험
-- 출력 컬럼 이름, 출석률,출석상태
SELECT 
	student_name, attendance_rate,
	CASE
		WHEN attendance_rate >= 95 THEN '우수'
		WHEN attendance_rate >= 80 THEN '보통'
		ELSE '위험'
	END AS attendance
FROM student_score ;

-- 과목별 난이도 표시
-- java -> 중급
-- database -> 어려움
-- python -> 쉬움
-- 출력컬럼
-- subject
-- difficulty
SELECT 
    subject,
    CASE subject
        WHEN 'Java' THEN '중급'
        WHEN 'Database' THEN '어려움'
        WHEN 'Python' THEN '쉬움'
        ELSE '미분류'
    END AS difficulty
FROM student_score;


-- 장학생여부출력
-- 점수 >= 90 이고 출석률 >= 90
-- 둘다 만족하면 '장학생'
-- 아니면 '일반학생'
-- 출력 컬럼 
-- 이름 점수 출석률 장학생여부
SELECT 
    student_name, 
    score, 
    attendance_rate,
    CASE 
        WHEN score >= 90 AND attendance_rate >= 90 THEN '장학생'
        ELSE '일반학생'
    END AS scholarship_status
FROM student_score;


-- grade 컬럼을 추가한후 다음 기준으로 update 하기
-- 90이상 A
-- 80이상 B
-- 70이상 C
-- 60이상 D
-- 그외  F
-- 1. 테이블에 grade 컬럼 추가
ALTER TABLE student_score ADD COLUMN grade VARCHAR(5);

UPDATE student_score
SET grade = CASE 
    WHEN score >= 90 THEN 'A'
    WHEN score >= 80 THEN 'B'
    WHEN score >= 70 THEN 'C'
    WHEN score >= 60 THEN 'D'
    ELSE 'F'
END;

SELECT * FROM student_score;

-- while 문의 기본문법
-- while 조건 do
-- 실행문;
-- end while;

-- 1. 테이블 초기화
DROP TABLE IF EXISTS loop_test;
CREATE TABLE loop_test(
    num int 
);

-- 2. 프로시저 생성
DROP PROCEDURE IF EXISTS while_example;

DELIMITER //

CREATE PROCEDURE while_example()
BEGIN
    DECLARE v_num INT DEFAULT 1;
    
    WHILE v_num <= 5 DO 
        INSERT INTO loop_test VALUES(v_num);
        SET v_num = v_num + 1; -- 오타 수정 (v=num -> v_num)
    END WHILE;
END //

DELIMITER ;

-- 3. 프로시저 호출 및 결과 확인
CALL while_example();
SELECT * FROM loop_test;

-- repeat
-- 무조건 한번 실행후 조건검사
-- repeat
-- 실행문;
-- until 조건
-- end repeat;
DELIMITER //
CREATE PROCEDURE feprat_example()
BEGIN 
	DECLARE v_num int DEFAULT 6;

	REPEAT
		INSERT INTO loop_test VALUES(v_num);
	
		SET v_num = v_num +1;
	until v_num > 10 -- 조건이 거짓이면 반복 참이면 종료
	END REPEAT;
END //
DELIMITER ;

CALL feprat_example();
SELECT * FROM loop_test;
-- Loop 
-- 무한반복기반
-- 직접 종료 조건을 만들어야한다
-- label: loop
-- 실행문;
-- if 조건 then leave label;
-- end if;
-- end loof;

delimiter //
CREATE PROCEDURE loop_example()
BEGIN 
	DECLARE v_num int DEFAULT 1;
	my_loop:LOOP
		INSERT INTO loop_test values(v_num);
		SET v_num = v_num+1;
		IF v_num >16 THEN 
			LEAVE my_loop;
		END IF;
	END LOOP;
END //
delimiter ;
SELECT * FROM loop_test;

CREATE TABLE loop_result(
	value_text varchar(100)
);
-- while 문을 이용하여 1~20 까지의 수 중 짝수만 저장하기
DELIMITER //

CREATE PROCEDURE save_even_numbers()
BEGIN
    DECLARE v_num INT DEFAULT 1;
    
    WHILE v_num <= 20 DO
    
        IF v_num % 2 = 0 THEN
            INSERT INTO loop_result (value_text) VALUES (CONCAT(v_num, '은(는) 짝수입니다'));
        END IF;

        SET v_num = v_num + 1;
    END WHILE;
END //

DELIMITER ;


CALL save_even_numbers();
SELECT * FROM loop_result;


DELETE FROM LOOP_result;

-- repeat 문을 사용하여 1부터 10까지의 총 합 구하기


DELIMITER //

CREATE PROCEDURE sum_example()
BEGIN
    DECLARE v_num INT DEFAULT 1;
    DECLARE v_sum INT DEFAULT 0;

    REPEAT
        -- 합계에 현재 숫자를 더함
        SET v_sum = v_sum + v_num;
        -- 다음 숫자로 증가
        SET v_num = v_num + 1;
        
    -- v_num이 10보다 커지면 반복 종료
    UNTIL v_num > 10
    END REPEAT;

    -- 최종 결과 출력
    SELECT v_sum AS total_sum;
END //

DELIMITER ;

-- 실행
CALL sum_example();
