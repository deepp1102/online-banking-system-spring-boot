# 🏦 Online Banking System – Spring Boot REST API

A backend-focused **Online Banking System** built using **Spring Boot**, providing secure and scalable **RESTful APIs** for core banking operations such as account management, fund transfers, and transaction auditing.

This project was developed as part of an **Advanced Level (Full Stack & Systems)** task with a focus on:

- Enterprise Frameworks (Spring Boot)  
- REST API Design  
- JPA / Hibernate  
- Spring Security  

---

## 🚀 Features

- Create bank accounts
- Transfer funds between accounts
- Automatic transaction audit (history table)
- Layered architecture (Controller → Service → Repository)
- RESTful API design with proper HTTP status codes
- Database integration using JPA & Hibernate
- In-memory H2 database for development
- Spring Security enabled by default
- Embedded Tomcat server

---

## ⚙️ How to Run the Project
Verify:
java -version
mvn -version

RUN LOCALLY
- git clone https://github.com/deepp1102/online-banking-system-spring-boot.git
- cd online-banking-system-spring-boot
- mvn clean
- mvn install
- mvn spring-boot:run

The application will start at:
http://localhost:8080
