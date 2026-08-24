-- Ctrl + Enter
SELECT * FROM employees;

-- 주석
--	- 개발자가 메모할 수 있는 기능

-- 1. DML
--	- 데이터를 조회하거나 변경하기 위한 언어
--	- 종류 : SELECT(조회), INSERT(삽입), DELETE(삭제), UPDATE(수정)

-- 2. SELECT
--	- 데이터를 조회할 때 사용하는 명령어 
--	- 문법 : SELECT 컬럼명 FROM 테이블명
--  - SQLD 자격증 2과목에서 대부분의 문제가 SELECT 문제

-- 직원의 이름(first_name, last_name)과 이메일(email) 조회
SELECT first_name, last_name, email FROM employees;

-- 1. employees 테이블의 employee_id, last_name 조회
SELECT employee_id, last_name FROM employees;

-- 2. employees 테이블의 job_id 조회
SELECT job_id FROM employees;

-- 3. jobs 테이블의 job_title, min_salary, max_salary 조회
SELECT job_title, min_salary, max_salary FROM jobs;

-- 4. departments 테이블의 모든 컬럼 조회
SELECT * FROM departments;


-- 3. 산술 연산자
--	> 사칙 연산 (+, -, /, *)
SELECT employee_id, salary, salary*12 FROM employees;

-- 4. 별칭
--	> 컬럼명에 별칭을 부여함
SELECT employee_id, salary AS "월급" FROM employees;

-- 5. DISTINCT
--	- 조회할 컬럼의 데이터에서 중복을 제거 후 조회
SELECT DISTINCT department_id FROM employees;

-- 6. WHERE  ***
--	- 데이터를 조회할 때 특정 조건을 주어 조건에 만족하는 
--	  데이터만 조회
--  - SELECT 컬럼명 FROM 테이블명 WHERE 조건식;

-- WHERE에서 주의해야할 점
--	- 비교 연산자에서 같지 않다는 2개가 존재(!=, <>)
--	- 이상(>=), 초과(>), 이하(<=), 미만(<) 잘 구분하기

-- employees 테이블에서 월급이 10000 초과인 직원만 조회
SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary >= 10000;

-- employees 테이블에서 first_name이 Diana인 직원 조회
SELECT first_name
FROM employees
WHERE first_name = 'Diana';

-- employees 테이블에서 입사일(hire_date)이 
-- 2006년 1월 1일 이후인 직원의 모든 컬럼 조회
SELECT * FROM employees
WHERE hire_date > '2006-01-01';

-- Q1. 직원 테이블에서 부서 번호가 90번인 직원 조회
--	> 부서 번호의 컬럼명은 department_id
--	> 조회할 컬럼은 first_name, last_name, email
SELECT first_name, last_name, email
FROM employees
WHERE department_id = 90;

-- Q2. 직원 테이블에서 salary가 5000 미만인 직원 조회
SELECT *
FROM employees
WHERE salary < 5000;

-- 7. 논리 연산
--	- NOT : 조건의 반대
--	- AND : 두 피 연산자가 모두 참일 때
--	- OR : 두 피 연산자 중 하나 이상이 참일 때

-- 직원 테이블에서 부서 번호가 80번 이면서
-- 매니저 아이디가 100번인 직원 조회
SELECT * 
FROM EMPLOYEES 
WHERE department_id = 80
AND manager_id = 100;

-- 직원 테이블에서 월급이 5000 이상 이면서(그리고) 10000 미만인 직원 조회
SELECT *
FROM employees
WHERE salary >= 5000
AND salary < 10000;

-- 월급이 1000 이상 이거나(또는) 부서 번호가 100인 직원 조회
SELECT *
FROM employees
WHERE salary >= 1000
OR department_id = 100;

-- AND 연산자와 OR 연산자가 같이 사용될 경우 AND의 우선순위가 높다.
--	- ()가 있으면 무조건 소괄호쪽 먼저 조건 확인
--	- 없다면 AND 먼저 조건을 확인
SELECT first_name, salary, department_id
FROM employees
WHERE department_id = 60
OR department_id = 90 AND salary >= 10000;

-- 8. BETWEEN
--	- 범위를 지정하여 값을 조회할 때 사용
--	- 문법 : SELECT * FROM employees WHERE 컬럼명 BETWEEN 값 AND 값 
SELECT *
FROM employees
WHERE employee_id BETWEEN 100 AND 200;
--						  이상     이하 

SELECT *
FROM employees
WHERE hire_date BETWEEN '2005-01-01' AND '2006-01-01';

-- 9. LIKE
--	- 특정 패턴에 만족하는지 확인할 수 있는 구문
--	- 어떠한 문자들에 대한 패턴을 검색할 때 주로 사용
--	- 표현식 : % (0글자 이상), _ (1글자)

-- first_name이 N으로 시작하는 직원 조회
--	- 이름이 N일 경우 > 조회
--	- 이름이 Na일 경우 > 조회
--	- 이름이 Nabc일 경우 > 조회
--	- 이름이 aN일 경우 > 조회되지 않음 (N으로 시작하지 않기 때문)
SELECT *
FROM employees
WHERE first_name LIKE 'N%';

-- first_name이 en으로 끝나는 직원 조회
SELECT *
FROM employees
WHERE first_name LIKE '%en';

-- first_name이 en이 포함되는 직원 조회
SELECT *
FROM employees
WHERE first_name LIKE '%en%';

-- first_name이 "i"앞에 한글자만 존재하는 직원 조회
SELECT *
FROM employees
WHERE first_name LIKE '_i';

-- "P"로 시작하고 뒤에 2글자가 존재하는 직원 조회
SELECT *
FROM employees
WHERE first_name LIKE 'P__';

-- 10. IS NULL
--	- 데이터가 NULL인지 비교하는 연산자
--	- NULL은 데이터가 없음을 의미 
SELECT * 
FROM employees
WHERE commission_pct IS NULL;

-- 11. IN
--	- 여러 개의 값을 제시하고 해당 값에 일치하는 데이터를 조회
SELECT *
FROM employees
WHERE department_id IN('80', '100'); -- 부서번호가 80번 또는 100번인 직원

-- 12. ||
--	- 여러개의 컬럼을 하나처럼 연결해서 사용할 수 있는 연산자
SELECT first_name || last_name
FROM employees;








