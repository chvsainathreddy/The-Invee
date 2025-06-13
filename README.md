# InVee – Inventory Management System

InVee is a Spring Boot-based web application tailored for small businesses to manage their inventory, purchase orders, sales, user roles, and system logs. It supports Admin and Staff functionalities, offering secure role-based access and user-friendly interfaces using Thymeleaf.

## 🛠️ Features

- Role-based login for **Admin** and **Staff**
- Manage Products, Suppliers, Orders, and Stock
- Request and Approve Orders Workflow
- Real-time inventory tracking
- Session management and validation
- Logging of critical application events
- MySQL database integration
- Clean UI with Thymeleaf and Bootstrap

## 🚀 Tech Stack

- **Java 24**
- **Spring Boot 3.5.0-M3**
  - Spring MVC
  - Spring Data JPA
  - Spring Session
  - Spring Validation
- **Thymeleaf** (UI templating)
- **MySQL** (Database)
- **Log4j** (Logging)
- **Lombok** (Boilerplate reduction)
- **Maven** (Build tool)

## 🧾 Project Structure

- `InventoryManagementSystem/`
  - `src/main/java/` – Backend Java code
  - `src/main/resources/templates/` – Thymeleaf HTML views
  - `src/main/resources/application.properties` – DB and session configuration
  - `imsdb.sql` – Database schema
  - `inventory.log` – Generated logs
  - `.idea/` – IntelliJ project files
- `ims_report.pdf` – Documentation report
- `ER Diagram.png` – Entity relationship diagram

## 📦 Setup Instructions

1. **Clone the repo:**
   ```bash
   git clone <your-repo-url>
   ```

2. **Import into IDE:**
   - Open as a Maven project in IntelliJ or Eclipse.

3. **Database Setup:**
   - Create a MySQL database named `imsdb`.
   - Run the `imsdb.sql` script to initialize tables.

4. **Configure DB in `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/imsdb
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

5. **Build and Run:**
   ```bash
   ./mvnw spring-boot:run
   ```

6. **Access the application:**
   - Navigate to: `http://localhost:8080`

## 🧑‍💼 User Roles

- **Admin**: Full access to approve orders, manage inventory and staff.
- **Staff**: Can request orders, view inventory, and manage their profile.


---

## 🧠 Future Enhancements

- Implement Spring Security for advanced authentication
- Generate monthly inventory reports
- Add email notifications for approvals
- Improve dashboard analytics with charts

## 📄 License

This project is built for educational purposes and small business prototyping.


## 🖼️ Pics

![Screenshot (100)](https://github.com/user-attachments/assets/cf046ff7-cecb-4469-99e8-2f58116e6d8f)
![Screenshot (101)](https://github.com/user-attachments/assets/8a3cf9b3-78ed-4328-8992-54108f773fd5)
![Screenshot (227)](https://github.com/user-attachments/assets/b269a44f-4f7c-4196-b570-3877f4a47cdb)
![Screenshot (99)](https://github.com/user-attachments/assets/acb4a502-3a8c-4606-a243-d8be41559e14)
