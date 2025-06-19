
This is a simple Task Management CRUD (Create, Read, Update, Delete) application built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. It supports basic API endpoints to manage tasks.


 Features

- Add new tasks ✅
- Fetch all tasks or a specific task by ID 🔍
- Update task details ✏️
- Delete single task or all tasks 🗑️
- Auto-generated `createdAt` and `updatedAt` timestamps ⏰

---

 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

 🔧 Setup Instructions

1. Clone the repository

```bash
git clone https://github.com/gopetanmay404/Spring_boot_TASk.git
cd Spring_boot_TASk
````

2. *Configure database in `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. Run the project

```bash
./mvnw spring-boot:run
```

---

## 🔌 API Endpoints

| Method | Endpoint            | Description      |
| ------ | ------------------- | ---------------- |
| POST   | `/tasks`            | Add new task     |
| GET    | `/tasks/check`      | Get all tasks    |
| GET    | `/tasks/{id}`       | Get task by ID   |
| PUT    | `/tasks/{id}`       | Update task      |
| DELETE | `/tasks/{id}`       | Delete by ID     |
| DELETE | `/tasks/delete-all` | Delete all tasks |

---

## 📮 Sample JSON (POST)

```json
{
  "title": "Finish Spring Boot Task",
  "completed": false
}
```

---

## 🧑‍💻 Author

**Tanmay Gope**
GitHub: [@gopetanmay404](https://github.com/gopetanmay404)

---

## 📄 License

This project is licensed under the MIT License.

```

---

Let me know if you also want this README automatically pushed to your GitHub repo.
```
