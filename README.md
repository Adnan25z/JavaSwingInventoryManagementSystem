# Inventory Management System (Java Swing & MySQL)
The Inventory Management System is an advanced desktop application designed to streamline inventory management for small to medium-sized businesses. Utilizing Java Swing for the user interface and MySQL for backend data management, this system offers robust functionality for managing product details, including adding, updating, deleting, and viewing products. Built on solid software design principles and patterns, it ensures an efficient, scalable, and maintainable solution for inventory management.

# Features
CRUD Operations: Facilitates create, read, update, and delete operations for inventory items.
Intuitive User Interface: Features a user-friendly graphical interface, making inventory management accessible and straightforward.
Database Integration: Utilizes MySQL for secure and reliable data storage and management.
Real-time Inventory Updates: Ensures inventory records are up-to-date, reflecting current stock levels and details.
Modular Architecture: Supports easy maintenance and future expansion through a well-organized codebase.
Design Principles and Patterns
The development of this system is guided by the following design principles and patterns to ensure a high-quality, scalable, and maintainable software product:

Simplicity
Aims for an intuitive and easy-to-navigate user interface, enabling users to perform tasks with minimal complexity.

Modularity
Embraces a modular approach in design, separating the system into distinct layers (UI, business logic, data access) to simplify updates and maintenance.

DRY (Don't Repeat Yourself)
Focuses on maximizing code reuse to minimize redundancy, enhancing both efficiency and consistency across functionalities.

Encapsulation
Employs encapsulation to protect object states and behaviors, exposing only what is necessary and improving security and usability.

Single Responsibility Principle (SRP)
Adheres to SRP by ensuring each class and method performs a single function, which simplifies debugging and enhances code readability.

Singleton Pattern
Utilizes the Singleton pattern for database connections, ensuring a single instance is used throughout the application, optimizing resources and maintaining consistent access.

Factory Method
Implements the Factory Method pattern to abstract the instantiation process in object creation, allowing for flexibility and scalability in the application's evolution.

# Getting Started
## Prerequisites
Java JDK 8 or later
MySQL Server
MySQL Connector/J

## Installation
Clone the repository:
bash
Copy code
git clone https://github.com/adnan25z/inventory-management-system.git
Set up the MySQL database by executing the provided SQL script (database/InventoryDB.sql) to create the necessary tables.

Update the database connection details in DatabaseConnection.java with your MySQL server information.
Compile and run Main.java to start the application.

## Contributing
Contributions are welcome and greatly appreciated. If you have a suggestion to improve this project, please fork the repo, create a feature branch, commit your changes, and open a pull request.

## License
Distributed under the MIT License. See LICENSE for more information.
