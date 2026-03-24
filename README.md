# 🚀 Social Media REST API (Spring Boot)

A backend REST API for a simple social media application built using **Spring Boot**.
This project demonstrates CRUD operations, REST principles, and layered architecture.

---

## 📌 Features

* 👤 User Management
* 📝 Post Management
* 🔗 User-Post Relationship
* ✅ RESTful API Design
* ⚠️ Exception Handling
* 📦 Layered Architecture (Controller → Service → Repository)

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 / MySQL (mention what you used)
* Maven

---

## 📂 API Endpoints

### 👤 Users API

| Method | Endpoint    | Description              |
| ------ | ----------- | ------------------------ |
| GET    | /users      | Retrieve all users       |
| GET    | /users/{id} | Retrieve a specific user |
| POST   | /users      | Create a new user        |
| DELETE | /users/{id} | Delete a user            |

---

### 📝 Posts API

| Method | Endpoint                   | Description              |
| ------ | -------------------------- | ------------------------ |
| GET    | /users/{id}/posts          | Get all posts for a user |
| POST   | /users/{id}/posts          | Create a post for a user |
| GET    | /users/{id}/posts/{postId} | Get a specific post      |

---

## 📦 Sample Request

### Create User

POST /users

```json
{
  "name": "Rishu",
  "birthDate": "2000-01-01"
}
```

---

## ⚠️ Exception Handling

* User Not Found → 404
* Validation Errors → 400

---

## ▶️ How to Run

```bash
mvn clean install
mvn spring-boot:run
```

App runs at:
http://localhost:8080

---

## 🔥 Future Improvements

* Add Authentication (JWT)
* Add Pagination
* Add Swagger Documentation
* Deploy on AWS / Render
* Replace H2 with MySQL/PostgreSQL

---

## 💡 Learnings

* REST API Design
* Spring Boot Architecture
* Exception Handling
* Entity Relationships (OneToMany)

---


