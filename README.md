CRUD Operations with Spring Boot
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

Method: POST
Endpoint: /post
Description: Add a new student
Request Body Example: { "name": "Hemanth", "address": "Vijayawada", "email": "hemanth@example.com" }

Method: GET
Endpoint: /get
Description: Get all students

Method: GET
Endpoint: /get/{id}
Description: Get a student by ID

Method: POST
Endpoint: /update/{id}
Description: Update a student by ID
Request Body Example: { "name": "New Name", "address": "New Address", "email": "newmail@example.com" }

Method: GET
Endpoint: /delete/{id}
Description: Delete a student by ID

🗄 Database Configuration
Before running the app, create a MySQL database:

CREATE DATABASE student_data;

Update application.properties with your MySQL credentials:

spring.application.name=CRUD Operations
spring.datasource.url=jdbc:mysql://localhost:3306/student_data
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

▶️ Running the Application
Clone the repository
git clone https://github.com/hemanthh79/spring-boot-CRUD-operations.git

Navigate to the project directory
cd CRUD_Operations

Run the application with Maven
mvn spring-boot:run

Test APIs in Postman
http://localhost:8080/students

📌 Notes
spring.jpa.hibernate.ddl-auto=update automatically updates your database schema
to match entity classes.

Ensure that your MySQL server is running.

To change the default server port, add this to application.properties:
server.port=8081

✨ Author
Developed by Hemanth Chowdary (https://github.com/hemanthh79)
