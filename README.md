📝 Task Manager - Spring Boot CRUD Application

This is a simple Task Manager built using Spring Boot, Spring Data JPA, and MySQL. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on tasks.

 Features

- Add a new task
- View all tasks
- View task by ID
- Update a task
- Delete a task by ID
- Delete all tasks
- Automatically records creation and update timestamps

 ⚙️ Technologies Used

- Java 17
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Lombok

 📁 Project Structure
'''
src
├── main
│ ├── java
│ │ └── com.basiccrud.crudoperation
│ │ ├── entity
│ │ │ └── Task.java
│ │ ├── repository
│ │ │ └── TaskRepository.java
│ │ ├── Taskservice
│ │ │ └── TaskService.java
│ │ └── TaskController
│ │ └── TaskController.java
│ └── resources
│ └── application.properties


 🔄 API Endpoints

| Method | Endpoint              | Description            |
|--------|-----------------------|------------------------|
| POST   | `/tasks`              | Add a new task         |
| GET    | `/tasks/check`        | View all tasks         |
| GET    | `/tasks/{id}`         | View task by ID        |
| PUT    | `/tasks/{id}`         | Update a task          |
| DELETE | `/tasks/{id}`         | Delete task by ID      |
| DELETE | `/tasks/delete-all`   | Delete all tasks       |

 🗃️ Sample JSON for POST Request

json
{
  "title": "Finish Spring Boot project",
  "completed": false
}
 How to Run
Clone the repository:

git clone https://github.com/gopetanmay404/Spring_boot_TASk.git
cd Spring_boot_TASk
Set up your MySQL database and update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
Build and run the app:

mvn clean install
mvn spring-boot:run
The app will be available at: http://localhost:9044

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.



