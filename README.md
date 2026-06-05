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

1. Install Java 11+, Maven, and Tomcat 10.1.x.
2. Start MySQL in XAMPP.
3. Create a MySQL database named `jdbc_jsp_db` in phpMyAdmin.
4. Check `src/main/resources/db.properties` for your MySQL settings.
5. Build the project:
   ```bash
   mvn clean package
   ```
6. Copy `target/jdbc-jsp-basic-project-1.0.0.war` to Tomcat's `webapps` folder or deploy it from your IDE.
7. Open:
   ```text
   /students
   ```

## Notes

- The `students` table is created automatically on first access.
- Default connection settings assume XAMPP MySQL running on `localhost:3306` with user `root` and an empty password.

## Easier Local Setup

- `src/main/resources/db.properties` stores database settings in one place.
- Environment variables `DB_URL`, `DB_USER`, and `DB_PASSWORD` can override the file.
- `src/main/webapp/META-INF/context.xml` is included so Tomcat can auto-detect the webapp metadata.
- `.project` and `.classpath` make the project easier to import into Eclipse.
- IntelliJ can open the Maven project directly from the root folder.

## IntelliJ

1. Open the project root in IntelliJ.
2. Let IntelliJ import it as a Maven project.
3. Add a Tomcat 10.1 run configuration.
4. Deploy the artifact and run.

## Eclipse

1. Use `File > Import > Existing Maven Projects`.
2. Select this project root.
3. Start Tomcat from the Servers view.
4. Run the project on Tomcat.
