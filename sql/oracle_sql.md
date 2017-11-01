# SQL ORACLE
	* INSTALLATION
	* Unlock User HR
	* DML
	* DDL
## INSTALLATION
	1. install oracle => sqlplus (administrasi tool standart)
	2. extract sqldeveloper 
	3. JDK PATH config
	
## Unlock User HR
	* alter user hr identified by hr account unlock;
	* connect hr/hr
	* open connection sql developer
	
## DML -> CRUD 
	* Create 	-> INSERT
	* Read 		-> SELECT
	* Update 	-> UPDATE
	* Delete 	-> DELETE
	
## DDL -> CRUD
	* CREATE 	-> CREATE 
	* READ		-> SHOW / DESCRIBE
	* UPDATE	-> ALTER
	* DELETE	-> DROP
	
## SELECTING DATA
### ALL FIELD
### Define Spesific Column
	SELECT 
	  EMP.LAST_NAME AS NAMA_BELAKANG, 
	  EMP.EMAIL, 
	  EMP.PHONE_NUMBER NOMOR_TELP
	FROM EMPLOYEES EMP;
### FROM DUAL
	SELECT 'HELLO WORLD' FROM DUAL;
	SELECT 
	  1+1 AS JUMLAH, 
	  2 + 2 * 10 AS KALI, 
	  CURRENT_DATE AS TANGGAL_SEKARANG
	FROM DUAL;
	
### Conditon with Equal
	SELECT * FROM employees
	where first_name = 'Diana' OR first_name = 'Lex'

	SELECT * FROM employees
	where first_name = 'Diana' OR 1 = 1;

	SELECT * FROM employees
	where upper(first_name) = upper('diana');
	select lower('heLlo WoRlD') from dual;

### Condtion with like
	select * from employees
	where first_name like '%s'

	select * from employees
	where first_name like 'S%'

	select * from employees
	where upper(first_name) like upper('%s%')

### Condtion with between
	select * from employees 
	where salary between 8200 and 10000

	select * from employees 
	where salary <= 10000 and salary >= 8200

	select * from employees
	where hire_date = to_date('08-20-2005', 'mm-dd-yyyy');
