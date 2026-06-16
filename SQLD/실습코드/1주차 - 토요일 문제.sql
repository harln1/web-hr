--1. EMPLOYEES 테이블에서 보너스가 있는 직원들의 정보를 모두 출력하세요.
SELECT * FROM employees
WHERE commission_pct IS NOT NULL;

--2. EMPLOYEES 테이블에서 월급(SALARY)이 5000 이상, 
--    10000 이하인 직원들을 조회하세요. 단, BETWEEN을 사용하여 조회하셔야 합니다.
SELECT * FROM employees
WHERE salary BETWEEN 5000 AND 10000;

--3. JOBS_HISTORY 테이블에서 START_DATE가 2005-01-01 이후이고 
--   END_DATE가 2007-01-01인 데이터를 조회하세요.
SELECT * FROM job_history
WHERE start_date >= '2005-01-01'
AND end_date = '2007-01-01';

--4. EMPLOYEES 테이블에서 JOB_ID가 SH_CLERK, AD_ASST, MK_MAN이 아닌 직원들을 
--   조회하세요. 단, IN을 사용하여 조회하며 오름차순으로 정렬히세요.
SELECT * 
FROM employees
WHERE job_id NOT IN('SH_CLERK', 'AD_ASST', 'MK_MAN')
ORDER BY JOB_ID ASC;

--5. EMPLOYEES 테이블에서 월급이 5000 이상이고, 직무가 SA_REP 또는 AD_VP인 
--   직원들의 정보(ID, NAME, JOB_ID)를 출력하세요. 
--   단, IN을 사용하여 조회하며 내림차순으로 정렬하세요.
SELECT employee_id, first_name, job_id
FROM employees
WHERE salary >= 5000
AND job_id IN ('SA_REP', 'AD_VP')
ORDER BY salary DESC;

--6. JOBS 테이블에서 최소 월급(MIN_SALARY)과 최대 월급(MAX_SALARY) 
--   각각 평균을 구하여 조회하세요.
SELECT avg(min_salary), avg(max_salary)
FROM jobs;

--7. EMPLOYEES 테이블에서 JOB_ID를 기준으로 평균 월급이 7000 이상인 
--   JOB_ID를 조회하세요.
SELECT job_id
FROM employees
GROUP BY job_id
HAVING avg(salary) >= 7000;

--8. EMPLOYESS 테이블에서 MANAGER_ID를 기준으로 최소 월급이 3000 이상, 
--   최대 월급이 7000 이상인 MANAGER_ID를 출력하세요.
SELECT manager_id
FROM employees
GROUP BY manager_id
HAVING min(salary) >= 3000
AND max(salary) >= 7000;

--9. JOBS 테이블에서 JOB_ID가 SA로 시작하고, MAX_SALARY가 10000 이상인 데이터의 
--   평균 MIN_SALARY 값을 구하여 조회하세요.
SELECT avg(min_salary) AS "평균월급"
FROM jobs
WHERE job_id LIKE 'SA%'
AND max_salary >= 10000;

--10. LOCATION 테이블에서 COUNTRY_ID를 기준으로 STATE_PROVINCE 컬럼에 NULL이 
--    들어가지 않은 값의 개수를 구하세요.
SELECT count(*)
FROM locations
WHERE state_province IS NOT NULL 
GROUP BY country_id;

--11. EMPLOYEES 테이블에서 DEPARTMENT_ID를 기준으로 부서에 직원 수가 3명 이상이고,
--    평균 월급이 7000 이상인 부서의 정보(DEPARTMENT_ID, 평균 월급) 출력하세요
SELECT department_id, avg(salary) AS "평균 월급"
FROM employees
GROUP BY department_id
HAVING count(*) >= 3
AND avg(salary) >= 7000;







