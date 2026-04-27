CREATE DATABASE IF NOT EXISTS academy_db
CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;

# 한 줄 주석
-- 한 줄 주석

/*
 * 범위
 * 주석
 */
# SQL은 스크립트 전체가 실행되지 않는다
#구문별로 실행이 된다
# 테이블을 생성하는 SQL 이기 때문에 다시 실행하면 이미 만들어져 있다고 에러가 발생한다
CREATE TABLE TBL_MEMBER(
	NAME VARCHAR(50),
	AGE INT 
	
);                      

#테이블명 TBL_CAR
#속성
#정수 : id
#문자열 : brand(길이100)
#문자열 : color(길이 100)
#정수 :price
#id 속성에 기본키 제약조건 주기(속성옆에 X)


CREATE TABLE TBL_CAR (
	id INT PRIMARY  key,
	brand VARCHAR(100),
	color VARCHAR(100),
	price INT
#	CONSTRAINT car_pk PRIMARY KEY(id)
);


# 1.테이블의 삭제
#DROP TABLE TBL_CAR ;
# 2.테이블이 존재 할때만 삭제
#drop table if exists 테이블명;



#속성옆에 제약조건을  주는거랑
# CONSTRAINT 써서 제약조겅 주는거랑 무슨차이??

# - 속성옆에 작성하는 방법 (INLINE 방식)
# - 간단하고 직관적이다

# - CONSTRANINT 로 제약조건 작성(TABLE-LEVEL 방식)

# - 차이점 : 1.이름 지정여부
#	- CONSTRAINT CAR_PK PRIMARY KEY(id);
#	- INLINE 방식은 이름이 자동생성 >> 나중에 수정/삭제 가 어렵다
#2. 여러 컬럼 제약조건 가능 여부
#	- INLINE 방식은 단일컬럼에만 가능
#	- CONSTRAINT PK_ORDER PRIMARY KEY(USER_ID , PRODUCT_ID);
#3.가독성과 구조 
#	- INLINE방식 >> 간단 , 빠르게 작성 , 소규모 테이블에 적합하다
#	- CONSTRAINT 방식 >> 구조가 명확 , 제약조건을 한 곳에서 관리 가능 , 실무에서 더 많이 사용됨

create table EXAMPLE(
COL1 VARCHAR(10) not null,
COL2 VARCHAR(10),
CREATE_DATA DATETIME default CURRENT_TIMESTAMP
);
#수정하기 ALTER TABLE 테이블명...

# 1. 컬럼추가하기 >> ADD COLUMN 컬럼명 데이터 타입;
alter table example add column COL3 VARCHAR(50);

# 2. 컬럼삭제하기 >> DROP COLUMN 컬럼명;
alter table example drop column COL2;

# 3. 컬럼명 변경하기 >> RENAME COLUMN 컬럼명 TO 바꿀 컬럼명;
alter table example rename column COL1 to first_col;

# 4. 컬럼의 타입 변경하기 >> MODIFY COLUMN 컬럼명 타입;
alter table example modify column COL3 INT;

# 5. 제약조건 추가 >> ADD 제약조건 종류(대상컬럼);
alter table example add primary key (first_col);

# 6. 제약조건 삭제하기 >> DROP 제약조건 종류
alter table example 
drop primary key;

# 7. 제약 조건에 부여된 이름 찾기 KEY_NAME 부분이 부여된 이름임
show index from TBL_CAR;

# STUDENT 테이블 만들기
# 속성
# ID : 정수, 기본키
# NAME : 문자열(50), NOT NULL
# AGE : 정수
# EMAIL : 문자열(100)

# 다음의 컬럼을 테이블에 추가하세요
# PHONE : 문자열(20)

# AGE컬럼의 타입을 정수 -> TINYINT로 수정하세요

# NAME컬럼의 이름을 STUDENT_NAME으로 변경하세요

# PHONE 컬럼을 삭제하세요

# EMAIL 컬럼을 NOT NULL로 변경하세요
CREATE TABLE STUDENT (
    ID INT PRIMARY KEY,         
    NAME VARCHAR(50) NOT NULL,  
    AGE INT,
    EMAIL VARCHAR(100)         
); 

alter table STUDENT add column PHONE VARCHAR(20);

alter table STUDENT modify column AGE tinyint;

alter table STUDENT rename column NAME to STUDENT_NAME;

alter table STUDENT drop column PHONE; 

alter table STUDENT modify EMAIL VARCHAR(100) not null;

# 8. 여러 컬럼을 한번에 추가
# ADDRESS : 문자열(100)
# GRADE : 정수
alter table STUDENT
add ADDRESS VARCHAR(100),
add GRADE INT;

create table TBL_ANIMAL(
	ID INT primary key,
	type VARCHAR(100),
	AGE INT,
	FEED VARCHAR(100)
);

create table TBL_STUDENT(
	id INT primary key,
	name VARCHAR(100),
	major VARCHAR(100),
	birth date,
	GENDER CHAR(1) not null default 'W', 
	constraint ban_char check(gender in ('M','W')),
	constraint ban_date check(birth >= '1980-01-01')
);

#default : 컬럼에 값이 아예 주어지지 않았을때 자동으로 들어가는 기본값
#not null: 컬럼에 null값 자체를 허용하지 않겠다

#같이 사용하면 값 생략시 'W' 가 들어가게 되고, 누군가 null을 넣으려고 하면 db가 거부한다

# not null 이 없고  default만 있을 때 누군가 gender 자리에 null 라고 넣으면 데이터가 null 이라고 들어가게된다

# gender 에 들어갈수 있느 데이터는 m과 w만 들어갔으면 좋겠을때
# nulll이 들어오면 무결성이 깨진다 

#grade 컬럼의 기본값을 1로설정
alter table student 
modify column GRADE int DEFAULT 1;

#add로 추가하기 >> pk, unique , check
#modify로 추가 >> not null, default 

