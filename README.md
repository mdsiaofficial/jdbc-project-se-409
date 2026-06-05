# JDBC JSP Basic Project

A simple Java web application built with:

- JSP for the interface
- Servlet for request handling
- JDBC for database operations
- MySQL for the database

## Features

- Add a student
- View all students
- Delete a student

## Project Structure

- `src/main/java` contains Java source code
- `src/main/webapp` contains JSP pages
- `pom.xml` configures the Maven web application

## How to Run

1. Install Java 11+ and Maven.
2. Create a MySQL database named `jdbc_jsp_db` in XAMPP/phpMyAdmin.
3. Update the MySQL username/password in `src/main/java/com/example/jdbcjsp/util/DBConnection.java` if needed.
4. Build the project:
   ```bash
   mvn clean package
   ```
5. Deploy the generated `.war` file to a servlet container like Tomcat 10+.
6. Open:
   ```text
   /students
   ```

## Notes

- The `students` table is created automatically on first access.
- Default connection settings assume XAMPP MySQL running on `localhost:3306` with user `root` and an empty password.
