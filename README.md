# StaffManagementSystem
Windows Neon &amp; Metro Style Java based Invoice Management System using MySQL as the DB server. The application demonstrates prominent GRASP and GoF pattern implementation having been implemented based upon Use-Case Controller and Factory patterns respectively.

# Development Details
 * Language: Java - JForms (Swing) 
 * Database: MySQL (MariaDB)
 * IDE: Netbeans GUI
 * OS: Any (OS Independent)

# Database Structure

DB Name: employee

DB Credentials: `empadmin / emppassword`
```
CREATE TABLE emp_users(uid int(11) AUTO_INCREMENT NOT NULL PRIMARY KEY, uname VARCHAR(250) NOT NULL, uemail VARCHAR(150) NOT NULL, upass VARCHAR(150) NOT NULL, uadmin BOOLEAN DEFAULT 0 NOT NULL);
Query OK, 0 rows affected (0.028 sec)

MariaDB [invoice]> CREATE TABLE emp_employees(id int(11) AUTO_INCREMENT NOT NULL PRIMARY KEY, name VARCHAR(250) NOT NULL, emp_type NOT NULL VARCHAR(15), email VARCHAR(250), address VARCHAR(500), doj DATE NOT NULL, salary DOUBLE, rate DOUBLE, hours DOUBLE);
Query OK, 0 rows affected (0.105 sec)

MariaDB [invoice]> show tables;
+---------------------------+
| Tables_in_invoice         |
+---------------------------+
| emp_employees             |
| emp_users                 |
+---------------------------+
4 rows in set (0.000 sec)

MariaDB [employees]> desc emp_employees;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | int(11)      | NO   | PRI | NULL    | auto_increment |
| name     | varchar(250) | NO   |     | NULL    |                |
| emp_type | varchar(15)  | NO   |     | NULL    |                |
| email    | varchar(250) | YES  |     | NULL    |                |
| address  | varchar(500) | YES  |     | NULL    |                |
| doj      | date         | NO   |     | NULL    |                |
| salary   | double       | YES  |     | NULL    |                |
| rate     | double       | YES  |     | NULL    |                |
| hours    | double       | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
9 rows in set (0.007 sec)

MariaDB [employees]> desc emp_users;
+--------+--------------+------+-----+---------+----------------+
| Field  | Type         | Null | Key | Default | Extra          |
+--------+--------------+------+-----+---------+----------------+
| uid    | int(11)      | NO   | PRI | NULL    | auto_increment |
| uname  | varchar(250) | NO   |     | NULL    |                |
| uemail | varchar(150) | NO   |     | NULL    |                |
| upass  | varchar(150) | NO   |     | NULL    |                |
| uadmin | tinyint(1)   | NO   |     | 0       |                |
+--------+--------------+------+-----+---------+----------------+
5 rows in set (0.005 sec)
```
