-- 1. ORDER BY
--	- 조회된 데이터를 정렬해주는 구문
--  - 옵션
--		> ASC : 기본값으로 사용되는 옵션이며 오름차순
--		> DESC : 내림차순
--		> NULLS FIRST : NULL이 존재할 경우 NULL을 앞에 정렬
--		> NULLS LAST : NULL이 존재할 경우 NULL을 뒤에 정렬
SELECT * 
FROM EMPLOYEES
ORDER BY employee_id DESC NULLS FIRST;

-- 2. 그룹 함수
SELECT MAX(SALARY) -- MIN, AVG, SUM
FROM EMPLOYEES;

-- 조회된 행의 개수를 반환
--	ex) COUNT(*) : 모든 컬럼을 기준으로 행의 개수 조회
--	ex) COUNT(FIRST_NAME) : first_name 컬럼 기준으로 행의 개수 조회
SELECT COUNT(COMMISSION_PCT) -- NULL 제외
FROM EMPLOYEES;

SELECT * FROM EMPLOYEES;


--DEPARTMENT_ID가 80인 직원들의 월급 합계를 구하세요.
SELECT SUM(salary)
FROM employees
WHERE department_id = 80;

--JOB_ID가 IT_PROG인 직원들의 수를 구하세요.
SELECT COUNT(*)
FROM employees
WHERE job_id = 'IT_PROG';

--HIRE_DATE가 2006년 이후인 직원들의 평균 월급을 구하세요.
SELECT AVG(salary)
FROM employees
WHERE hire_date >= '2006-01-01';

--직원들 중 가장 월급이 낮은 값과 가장 월급이 큰 값을 구하세요.
SELECT MIN(salary), MAX(salary)
FROM employees;


-- GROUP BY
--	- 조회된 데이터의 여러 개 행을 특정 컬럼 기준으로 묶어 그룹화

-- 부서별 월급 합계 조회
--	> 부서번호와 합계 금액을 조회
SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id;

-- 직무별 월급 평균
SELECT job_id, avg(salary)
FROM EMPLOYEES
GROUP BY job_id;

-- 직무별 월급 평균인데, 월급 평균이 15000 이상인 직무만 조회
SELECT job_id, avg(salary)
FROM employees
GROUP BY job_id
HAVING avg(salary) >= 15000; -- GROUP BY에서 조건을 제시할 때 사용

-- 직무별 가장 낮은 월급이 5000 이상이면서
-- 가장 높은 월급이 10000 미만인 직원 조회
--	> JOB_ID, 낮은월급, 높은월급
SELECT job_id, min(salary) AS "낮은 월급", max(salary) AS "높은 월급"
FROM employees
GROUP BY job_id
HAVING min(salary) >= 5000
AND max(salary) < 10000;

-- * 쿼리의 실행 순서 *
--	- FROM부터 ORDER BY를 만나기 전까지는 순서대로
--	- SELECT, ORDER BY
SELECT JOB_ID, MIN(salary) -- 5
FROM employees -- 1
WHERE salary < 10000 -- 2
GROUP BY job_id -- 3
HAVING min(salary) >= 5000 -- 4
ORDER BY job_id DESC; -- 6

-------------------------------------------------------------
-- 집합 연산자
--	- 하나의 쿼리문 안에 여러개의 쿼리가 들어가는 형태를 가지는 연산자

-- 집합 연산자의 종류
--	- UNION : 두 개의 쿼리문에 대한 수행 결과를 더하고 중복 제거
--	- UNION ALL : 두 개의 쿼리문에 대한 수행 결과를 더하고 중복을 제거하지 않음
--	- INTERSECT : 두 개의 쿼리문에 대한 결과 값 중 중복된 부분만 조회
--	- MINUS : 먼저 실행된 첫 번째 쿼리문의 수행 결과에서
--			  그 다음으로 수행된 쿼리문의 수행 결과를 뺀 나머지 부분

SELECT employee_id, first_name, salary, department_id
FROM employees
WHERE department_id = 80 -- 34건
UNION ALL 
SELECT employee_id, first_name, COMMISSION_PCT, department_id
FROM employees
WHERE salary >= 10000; -- 19건


SELECT first_name, Last_name, salary
FROM employees
WHERE salary BETWEEN 5000 AND 10000
MINUS
SELECT first_name, last_name, salary
FROM employees
WHERE first_name LIKE 'A%';

----------------------------------------------------
-- INNER JOIN
--	- 두 테이블의 공통된 컬럼 값을 기준으로 반환

-- ANSI 방식
SELECT e.department_id, e.first_name, d.department_name
FROM employees e
JOIN departments d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID ;

-- 오라클 방식
SELECT e.department_id, e.first_name, d.department_name
FROM employees e, departments d
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID;

------------------------------------------------------------
-- LEFT OUTER JOIN
--  - 왼쪽 테이블의 모든 행과, 오른쪽 테이블의 일치하는 행을 반환
-- ANSI 방식
SELECT e.department_id, e.first_name, d.department_name
FROM employees e
LEFT OUTER JOIN departments d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID ;

-- 오라클 방식
--	- (+)가 오른쪽 테이블에 붙으면 LEFT
--	- (+)가 왼쪽 테이블에 붙으면 RIGHT
SELECT e.department_id, e.first_name, d.department_name
FROM employees e, departments d
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID(+);

-- 직원들의 이름과 근무 기간 조회
--	> 직원 정보는 employees
--	> 근무 정보는 job_history
SELECT first_name, last_name, start_date, end_date
FROM employees e
JOIN job_history jh
ON e.job_id = jh.job_id
WHERE start_date >= '2001-01-01';

-- department_id가 100인 직원의 이름과 부서 이름 조회
SELECT first_name, department_name
FROM EMPLOYEES e 
JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE d.DEPARTMENT_ID = 100;

-- department_id, street_address, city 조회
--	> departments 테이블과 locations 테이블 조인
SELECT department_id, street_address, city
FROM DEPARTMENTS d 
JOIN LOCATIONS l 
ON d.LOCATION_ID = l.LOCATION_ID;


-- 직원 번호, 이름, 직무명, 근무 기간
--  > employees 테이블에 직원 번호와 이름이 있음
--	> jobs 테이블에 직무명이 있음
--	> job_history 테이블에 근무 기간이 있음(start_date, end_date)
SELECT e.employee_id, first_name, job_title, start_date, end_date
FROM employees e
JOIN jobs j ON e.JOB_ID = j.JOB_ID
LEFT OUTER JOIN job_history jh ON e.EMPLOYEE_ID = jh.EMPLOYEE_ID ;













