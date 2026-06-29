# 🛒 E-Commerce Backend API

A RESTful E-Commerce Backend API built using **Java, Spring Boot, Spring Data JPA, Hibernate, MySQL, Maven, Docker, and Render**. This project demonstrates backend development concepts such as REST APIs, CRUD operations, database integration, Docker containerization, and cloud deployment.

---

## 🚀 Features

* ✅ Create Product
* ✅ Get All Products
* ✅ Get Product by ID
* ✅ Update Product
* ✅ Delete Product
* ✅ RESTful API
* ✅ Spring Data JPA & Hibernate
* ✅ MySQL Integration
* ✅ Docker Support
* ✅ Exception Handling
* ✅ Cloud Deployment on Render

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Docker
* Render
* Git & GitHub
* Postman

---

## 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── exception
├── config
└── resources
```

---

## ⚙️ Running Locally

### Clone Repository

```bash
git clone https://github.com/<your-github-username>/E-Commerce-Backend-API.git
```

### Move into Project

```bash
cd E-Commerce-Backend-API
```

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

Application runs at:

```text
http://localhost:8080
```

---

## 🐳 Docker

### Build Docker Image

```bash
docker build -t ecommerce-api .
```

### Run Docker Container

```bash
docker run -p 8080:8080 ecommerce-api
```

---

## ☁️ Deployment (Render)

This application is containerized using Docker and deployed on **Render**.

### Deployment Steps

1. Push the project to GitHub.
2. Log in to Render.
3. Create a new **Web Service**.
4. Connect your GitHub repository.
5. Select **Runtime: Docker**.
6. Render automatically detects the `Dockerfile`.
7. Click **Create Web Service**.
8. Render builds the Docker image and deploys the application.
9. Access the application using the generated Render URL.

## 📡 REST API Endpoints

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| GET    | `/products`      | Get all products  |
| GET    | `/products/{id}` | Get product by ID |
| POST   | `/products`      | Create a product  |
| PUT    | `/products/{id}` | Update a product  |
| DELETE | `/products/{id}` | Delete a product  |

---

## 🗄️ Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📚 Concepts Demonstrated

* Spring Boot
* REST API
* MVC Architecture
* Dependency Injection
* Spring Data JPA
* Hibernate ORM
* CRUD Operations
* Exception Handling
* MySQL Database
* Docker Containerization
* Cloud Deployment (Render)

---

## 🔮 Future Enhancements

* JWT Authentication
* Spring Security
* Role-Based Authorization
* Swagger/OpenAPI Documentation
* Product Search
* Pagination & Sorting
* Order Management
* Payment Gateway Integration
* CI/CD Pipeline using GitHub Actions

---

If you found this project useful, please give it a ⭐ on GitHub.
