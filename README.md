<h2>CRUD Operations with Spring Boot</h2>

This project is a simple Spring Boot CRUD application that demonstrates how to perform
Create, Read, Update, and Delete operations on a Students table using:

Spring Boot

Spring Data JPA (Hibernate)

MySQL Database

RESTful APIs

Tested with Postman

🚀 Features
Create a new student

Read all students or a student by ID

Update student details

Delete a student by ID

🛠 Tech Stack
Language: Java

Framework: Spring Boot

Database: MySQL

ORM: Spring Data JPA with Hibernate

Build Tool: Maven

Testing: Postman

⚙️ Endpoints
Base URL: http://localhost:8080/students

<h4>Method: POST</h4><br>
Endpoint: /post<br>
Description: Add a new student<br>
Request Body Example: { "name": "Hemanth", "address": "Vijayawada", "email": "hemanth@example.com" }

<h4>Method: GET</h4><br>
Endpoint: /get<br>
Description: Get all students

<h4>Method: GET</h4><br>
Endpoint: /get/{id}<br>
Description: Get a student by ID

<h4>Method: POST</h4><br>
Endpoint: /update/{id}<br>
Description: Update a student by ID<br>
Request Body Example: { "name": "New Name", "address": "New Address", "email": "newmail@example.com" }

<h4>Method: GET</h4><br>
Endpoint: /delete/{id}
Description: Delete a student by ID

<h3>🗄 Database Configuration</h3>
Before running the app, create a MySQL database:

CREATE DATABASE student_data;

Update application.properties with your MySQL credentials:

spring.application.name=CRUD Operations<br>
spring.datasource.url=jdbc:mysql://localhost:3306/student_data<br>
spring.datasource.username=root<br>
spring.datasource.password=yourpassword<br>
spring.jpa.hibernate.ddl-auto=update<br>

▶️ Running the Application
Clone the repository:<br>
git clone https://github.com/hemanthh79/spring-boot-CRUD-operations.git

Navigate to the project directory<br>
cd CRUD_Operations

Run the application with Maven<br>
mvn spring-boot:run

Test APIs in Postman<br>
http://localhost:8080/students

📌 Notes
spring.jpa.hibernate.ddl-auto=update automatically updates your database schema
to match entity classes.

Ensure that your MySQL server is running.

To change the default server port, add this to application.properties:
server.port=8081

✨ Author
Developed by Hemanth Chowdary (https://github.com/hemanthh79)
