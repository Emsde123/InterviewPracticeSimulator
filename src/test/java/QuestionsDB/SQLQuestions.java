package QuestionsDB;

import java.util.ArrayList;

public class SQLQuestions {

    public static ArrayList<String> sqlQuestions = new ArrayList<>(){{
        add("What is Database testing?");
        add("How DB testing is done manually, explain with example?");
        add("What is joins and mention different types of joins?");
        add("What is Stored Procedure and how to test the Stored Procedures?");
        add("What do you mean by DBMS?");
        add("What is DML? What is DDL?");
        add("How to write a query to get the second largest value from a given column of a table?");
        add("What does the RDBMS stand for and what are the major RDBMS used by SQL?\n");
        add("How do we use DISTINCT statement? What is its use?\n");
        add("What are different Clauses used in SQL?");
        add("Have you used Aggregate Functions at your work?");
        add("What is the difference between SQL and MySQL? (tricky, pay attention)");
        add("What do you mean by Subquery?");
        add("How to write a query to show the details of a student from Students table whose name starts with K?");
        add("What is the syntax to add a record to a table?");
        add("Write a SQL SELECT query that only returns each name only once from a table?");
        add("What is the difference between Commit and Rollback?\n");
        add("Can we rename a column in the output of SQL query?");
        add("Will Adding Alias to column or table update that column or table name in the database?");
        add("Give the order of SQL SELECT?");
        add("What are SQL comments? How comment out in SQL");
        add("What is schema?");
        add("What is the difference between Having clause and Where clause?");
        add("What is a Primary key?");
        add("What is a Foreign key?");
        add("How would you avoid duplicate records in a SELECT query?");
        add("When and why do we use ORDER BY Clause?");
        add("What is the difference between BETWEEN and IN condition operators?");
        add("What is the difference between the WHERE and HAVING clauses?");
        add("What is the difference between an inner and outer join?");
        add("Let’s say there are some null values in my table. How would you test those values?");
        add("When and why do we use GROUP BY Clause?");
        add("What is a Subquery?");
        add("What is the difference between AND and OR operators?");
        add("Are you familiar with functions in SQL? What type?");
        add("How would you retrieve data that is located in 2 different tables?");
        add("How would you find a second highest salary from the table? Third highest?");
        add("What is the difference between DELETE and TRUNCATE?");
        add("What is the difference between UNION and UNION ALL?");
        add("What is the difference between DML & DDL Commands? DCL?");
    }};

    public static ArrayList<String> sqlAnswers = new ArrayList<>(){{
        add("Database testing/Back-end testing is a process of checking the impact of back-end database operation on front-end web/desktop applications.\n" +
                "Database testing is divided into following different categories,\n" +
                "Data validity testing: While doing this testing, testers should be having good knowledge of SQL queries.\n" +
                "Data Integrity testing: While doing this testing, testers/developers should know referential integrity and different constraints.\n");
        add("One way to do it is:\n" +
                "While adding a record (XYZ) from the front-end to the back-end database, manually check if the record has been affected on the back-end database or not. \n" +
                "Similarly, it will work for delete, update, etc.\n" +
                "For Example: To keep the record of students who are giving the exam; enter the student's detail from the front-end system,\n" +
                " and manually check the effect of this addition on the back-end database.\n");
        add("Inner Join\n" +
                "Left-Outer Join\n" +
                "Right-Outer Join\n" +
                "Full-Outer Join\n");
        add("A stored procedure is a prepared SQL code that you can save, so the code can be reused repeatedly. So if you have an SQL query that you write over and over again, save it as a stored procedure, \n" +
                " and then just call it to execute it. You can also pass parameters to a stored procedure, so that the stored procedure can act based on the parameter value(s) that is passed.\n" +
                " A stored procedure is a set of SQL queries which can take input and send back output.\n" +
                "How to test:\n" +
                "Create different sets of input parameters, verify the procedure calling name, calling parameters, and expected responses. \n" +
                " Manually, run the procedure with database client programs like; TOAD, MySQL, or Apex. To verify results against expected values; re-run the procedure by giving different parameters.");
        add("A database is a structured set of data and a database management system (DBMS) is a computer software application that create a communication network between users, \n " +
                "others applications and database to store, \n" +
                " modify, and extract information from a database. Famous DBMSs are My SQL, Postgre SQL, Microsoft SQL Server, Oracle, SAP and IBM DB2.");
        add("DML stand for Data Manipulation Language. Any actions that does SELECT, INSERT, UPDATE, DELETE etc is considered DML action.\n" +
                " DDL stands for Data Definition Language and any action that does CREATE, ALTER, DROP, TRUNCATE etc is called DDL.");
        add("This is a query to get the second largest value from a given column of a table,\n" +
                "SELECT MAX(COLUMN_NAME) FROM TABLE_NAME\n" +
                "WHERE COLUMN_NAME < (SELECT MAX(COLUMN_NAME) FROM TABLE_NAME)\n" +
                "Explanation: so first you need to select the biggest number by using MAX function and then filter the data by using a subquery \n " +
                "to select the data that’s the smallest from the First biggest number, \n" +
                " which in this case going to be the second biggest number\n");
        add("RDBMS stands for Relational Database Management Systems. Major RDBMS that are involved with SQL are Sybase, Oracle, Access, Ingres, Microsoft SQL server etc.");
        add("The DISTINCT statement is used with the SELECT statement. If the records contain duplicate values then DISTINCT is used to select different values among duplicate records.");
        add("Select Clause, From Clause, Where Clause etc.");
        add("Yes, I did use Aggregate Functions (SRFs). SQL Aggregate Functions calculates values from multiple columns in a table and returns a single value.\n" +
                "There are 7 aggregate functions we use in SQL\n" +
                "AVG(): Returns the average value from specified columns\n" +
                "COUNT(): Returns number of table rows\n" +
                "MAX(): Returns largest value among the records\n" +
                "MIN(): Returns smallest value among the records\n" +
                "SUM(): Returns the sum of specified column values\n" +
                "FIRST(): Returns the first value\n" +
                "LAST(): Returns Last value");
        add("SQL is a structured query language that is used for manipulating and accessing the relational databases, like Oracle, MySql. \n " +
                "IBM BD2. On the other hand, MySQL itself is a relational database that uses SQL as the standard database language.");
        add("Query within another query is called as Subquery. A subquery is called an inner query which returns output that is to be used by another query.");
        add("SELECT * FROM Student WHERE Student_Name like ‘K%’;");
        add("Answer: To add a record in a table INSERT syntax is used.\n" +
                "Example: INSERT into table_name VALUES (value1, value2..);");
        add("Answer: To get each name only once, we need to use the DISTINCT keyword.\n" +
                "SELECT DISTINCT name FROM table_name;\n");
        add("Answer: Both ROLLBACK and COMMIT Commands are TCC (Transaction Control\n" +
                "Commands), they have differences:\n" +
                "COMMIT is used to save the changes permanently on the server ROLLBACK is used to undo the changes and restore the previous state.\n");
        add("Answer: Yes using the following syntax we can do this. This is called giving an Alias\n" +
                "SELECT column_name AS new_name FROM table_name;\n");
        add("Answer: NO!");
        add("Answer: Order of SQL SELECT clauses is: SELECT, FROM, WHERE, GROUP BY, HAVING, ORDER BY. \n" +
                "Only the SELECT and FROM clause are mandatory. (San Francisco Warriors Grouped by having order)");
        add("Answer: SQL comments can be put by two consecutive hyphens (–).");
        add("Answer: A schema is a collection of database objects of a User. YOLL.EMP (Yoll is schema, under that schema there are a lot of tables)");
        add("Answer: Both specify a search condition but Having clause is used only with the SELECT statement and typically used with GROUP BY clause.\n" +
                "If the GROUP BY clause is not used then Having behaves like WHERE clause only.\n");
        add("PK is a column in the Table that uniquely identifies each record and the value is never duplicated in the same table. PK cannot contain NULL Values\n" +
                "OR\n" +
                "A primary key is a special relational database table column (or combination of columns) designated to uniquely identify all table records. \n" +
                " A primary key's main features are: It must contain a unique value for each row of data. It cannot contain null values.\n");
        add("Is existence of PK in another table\n" +
                "Is a key used to link two tables together\n" +
                "It can accept Null Values\n" +
                "We can have more than one Foreign Key in a table.\n" +
                "OR\n" +
                "In the context of relational databases, a foreign key is a field (or collection of fields) in one table that uniquely identifies a row of another table or the same table. \n" +
                "In simpler words, the foreign key is defined in a second table, but it refers to the primary key or a unique key in the first table.\n");
        add("DISTINCT identifier eliminates duplicate records.\n" +
                "SELECT DISTINCT DEPARTMENT_ID\n" +
                "FROM EMPLOYEES\n" +
                "ORDER BY DEPARTMENT_ID;\n");
        add("The ORDER BY keyword is used to sort the result-set in ascending or descending order.\n" +
                "The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.\n" +
                "SELECT EMPLOYEE_ID, FIRST_NAME\n" +
                "FROM EMPLOYEES\n" +
                "ORDER BY 1 DESC;\n");
        add("Both of these operators are used to find out the multiple values from the table.\n" +
                "Difference between these operators is that the BETWEEN operator is used to select a range of data between two values while The IN operator allows you to specify multiple values.\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE SALARY IN (6000, 10000);\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE SALARY BETWEEN 6000 AND 10000;\n");
        add("WHERE clause is used for filtering rows and it applies on each and every row, while HAVING clause is used to filter groups in SQL.\n" +
                "One syntax level difference between WHERE and HAVING clause is that, WHERE is used before GROUP BY clause, while HAVING is used after GROUP BY clause.\n" +
                "SELECT COUNT(*), DEPARTMENT_ID\n" +
                "FROM EMPLOYEES\n" +
                "WHERE DEPARTMENT_ID IN(10,50,80,100,110,120,150)\n" +
                "GROUP BY DEPARTMENT_ID\n" +
                "HAVING COUNT(*)>5;\n");
        add("An inner join returns rows when there is at least some matching data between two (or more) tables that are being compared.\n" +
                "An outer join returns rows from both tables that include the records that are unmatched from one or both the tables.\n" +
                "SELECT COUNT(EMPLOYEE_ID), E.DEPARTMENT_ID,\n" +
                "DEPARTMENT_NAME\n" +
                "FROM EMPLOYEES E INNER JOIN DEPARTMENTS D\n" +
                "ON E.DEPARTMENT_ID=D.DEPARTMENT_ID\n" +
                "GROUP BY E.DEPARTMENT_ID, DEPARTMENT_NAME;\n" +
                "******\n" +
                "SELECT COUNT(EMPLOYEE_ID), E.DEPARTMENT_ID,\n" +
                "DEPARTMENT_NAME\n" +
                "FROM EMPLOYEES E FULL OUTER JOIN DEPARTMENTS D\n" +
                "ON E.DEPARTMENT_ID=D.DEPARTMENT_ID\n" +
                "GROUP BY E.DEPARTMENT_ID, DEPARTMENT_NAME;\n");
        add("A field with a NULL value is a field with no value. NULL value cannot be compared with other NULL values. \n" +
                " Hence, It is not possible to test for NULL values with comparison operators, such as =, <, or <>. For this, we have to use the IS NULL operator.\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE COMMISSION_PCT IS NULL;\n" +
                "*****\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE COMMISSION_PCT IS NOT NULL;\n");
        add("Group by clause is used to group the results of a SELECT query based on one or more columns.\n" +
                "The GROUP BY statement is often used with aggregate functions (COUNT, MAX, MIN, SUM,AVG) to group the result-set by one or more columns.\n" +
                "SELECT COUNT(*), DEPARTMENT_ID\n" +
                "FROM EMPLOYEES\n" +
                "WHERE DEPARTMENT_ID IN(10,50,80,100,110,120,150)\n" +
                "GROUP BY DEPARTMENT_ID\n" +
                "HAVING COUNT(*)>5;\n");
        add("A subquery is a query within another query, also known as a nested query. A subquery is used to return data that will be used in the main query as a condition to further restrict the data to be retrieved.\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE SALARY>(SELECT AVG(SALARY) FROM EMPLOYEES);\n" +
                "******\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE DEPARTMENT_ID IN\n" +
                "(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE\n" +
                "DEPARTMENT_NAME LIKE 'A%');\n");
        add("The AND and OR operators are used to filter records based on more than one condition:\n" +
                "The AND operator displays a record if all the conditions separated by AND is TRUE.\n" +
                "The OR operator displays a record if any of the conditions separated by OR is TRUE.\n" +
                "SELECT FIRST_NAME, LAST_NAME, SALARY\n" +
                "FROM EMPLOYEES\n" +
                "WHERE DEPARTMENT_ID = 90 AND LAST_NAME='King';\n" +
                "******\n" +
                "SELECT FIRST_NAME, LAST_NAME, SALARY\n" +
                "FROM EMPLOYEES\n" +
                "WHERE DEPARTMENT_ID = 90 OR LAST_NAME='King';\n");
        add("LOWER, UPPER, and INITCAP MAX, MIN, AVG\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE HIRE_DATE=(SELECT MIN(HIRE_DATE) FROM EMPLOYEES)\n" +
                "*******\n" +
                "SELECT * FROM EMPLOYEES\n" +
                "WHERE HIRE_DATE=(SELECT MAX(HIRE_DATE) FROM EMPLOYEES);\n" +
                "SELECT UPPER(COUNTRY_NAME)\n" +
                "from COUNTRIES\n" +
                "WHERE LENGTH(COUNTRY_NAME)>6;\n");
        add("Using join of two table base on condition we can retrieve data from two table\n" +
                "SELECT COUNT(EMPLOYEE_ID), E.DEPARTMENT_ID,\n" +
                "DEPARTMENT_NAME\n" +
                "FROM EMPLOYEES E INNER JOIN DEPARTMENTS D\n" +
                "ON E.DEPARTMENT_ID=D.DEPARTMENT_ID\n" +
                "GROUP BY E.DEPARTMENT_ID, DEPARTMENT_NAME;\n");
        add("SELECT MAX(SALARY) FROM EMPLOYEES\n" +
                "WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEES);\n" +
                "SELECT MAX(SALARY) FROM EMPLOYEES\n" +
                "WHERE SALARY < (SELECT MAX (SALARY) FROM EMPLOYEES\n" +
                "WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEES));\n");
        add("DELETE: delete selected rows from the table, WHERE clause can be used for conditional parameters. Deleted records can be rolled back or committed.\n" +
                "TRUNCATE: delete ALL rows from the table >> auto-commits, i.e. cannot be rolled back.\n" +
                "DELETE FROM INSURANCE WHERE POLICY_NUMBER=0002;\n" +
                "TRUNCATE TABLE JOB_HISTORY;\n");
        add("UNION merges the contents of two structurally-compatible tables into a single combined table.\n" +
                "UNION will omit duplicate records whereas and it will also sort the results where UNION ALL will include duplicate records.\n" +
                "The performance of UNION ALL will typically be better than UNION, since UNION requires the server to do the additional work of removing any duplicates.\n" +
                "SELECT FIRST_NAME, LAST_NAME, EMAIL FROM EMPLOYEES UNION ALL\n" +
                "SELECT FIRST_NAME, LAST_NAME, EMAIL FROM MY_TABLE;\n" +
                "SELECT FIRST_NAME FROM EMPLOYEES UNION\n" +
                "SELECT LAST_NAME FROM EMPLOYEES;\n");
        add("Data Definition Language (DDL) - defining and dealing with database schemas and descriptions of how the data should exist in the database.\n" +
                "Data Manipulation Language (DML) - deals with data manipulation (used to retrieve, store, modify, delete and update data in database).\n" +
                "Data Control Language (DCL) - deals with rights, permissions and other controls of the database system.\n" +
                "Transaction Control Language (TCL) – deals with a transaction within a database.\n");
    }};
}
