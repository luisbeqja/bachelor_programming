SELECT *
FROM employees;

SELECT employee_id, project_id, hours FROM tasks;
SELECT * FROM TASKS;

SELECT DISTINCT department_id, INITCAP(location) as location
FROM employees;


SELECT CURRENT_DATE;
SELECT now();

SELECT to_char(150-0.15*150, 'L999.99') as calculation;


SELECT employee_id, last_name, location
FROM EMPLOYEES
WHERE UPPER(location)='MAASTRICHT';


/*
Which employees worked between 20 and 35 hours (both inclusive) on project 10?
Display the employee number, project number, and number of hours worked
*/

/*SELECT *
FROM tasks
WHERE BETWEEN 25 AND 35
AND project_id = 10*/


SELECT  project_id, hours
FROM tasks
WHERE hours < 10 and employee_id = '999222222';

SELECT employee_id , last_name, province
FROM employees
WHERE upper(province) = 'GR'
OR upper(province) = 'NB'
ORDER BY last_name asc;


SELECT *
FROM tasks
WHERE hours IS NOT null
ORDER BY hours ASC;

/*
Are there any employees with first name Suzan, Martina, Henk or Douglas and in which
department do they work? Sort by department number (in descending order) and within
that alphabetically by first name.
*/

SELECT first_name, department_id
FROM employees
WHERE lower(first_name) IN ('suzan', 'martina', 'henk', 'douglas')
ORDER BY department_id DESC, first_name ASC

