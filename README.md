# Expense Tracker

The **Expense Tracker** is a web-based application designed to help users manage their personal finances by tracking their expenses. The application allows users to add, update, and delete expenses. It is built using **Java**, **Spring Boot**, **SQL**, and **Thymeleaf**, following the MVC architecture and providing a smooth user experience.

## Features

- **Add New Expenses**: Users can input details such as the name, amount, category, and date of each expense.
- **View Expense History**: Displays all expenses in a tabular format for easy reference.
- **Update/Delete Expenses**: Users can modify or remove expenses directly from the dashboard.
- **Expense Summary**: Provides an overview of total expenses and insights into spending patterns.

## Screenshots

### Main Expense Page

![Screenshot 2024-09-13 174431](https://github.com/user-attachments/assets/fdb54463-ab1e-43ab-9de5-ca9f0cd5798b)


### Update Expense Page

![Screenshot 2024-09-13 174221](https://github.com/user-attachments/assets/05f44c5b-2be4-469b-af31-bfdf26a50414)

## Technologies Used

- **Java**: Backend logic for handling expense management.
- **Spring Boot**: Provides a REST API and handles server-side logic.
- **SQL**: Relational database for persistent storage of expense data.
- **Thymeleaf**: Template engine for rendering dynamic HTML pages.
- **HTML/CSS**: For frontend user interface design.

## Getting Started

### Prerequisites

- JDK 8 or later
- Maven
- MySQL or any SQL-compatible database

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/hemantgarg1452/Expense-Tracker.git
   cd Expense-Tracker

2. Update the database configuration in src/main/resources/application.properties
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
    spring.datasource.username=your_username
    spring.datasource.password=your_password
   
4. Create the database schema in your SQL database. You can use the provided SQL script or create it manually.

5. Run the application:
   ```bash
   mvn spring-boot:run

### How to Use

1. Add Expenses: Go to the "Add Expense" page to enter details of your expenses and save them.
2. View Expenses: Navigate to the main expense page to see a list of all your expenses. You can filter or sort the list as needed.
3. Update Expenses: Click on an expense entry to edit its details and save the changes.
4. Delete Expenses: Use the delete button next to each expense entry to remove it from the list.


### Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request with your changes. Ensure that you follow the project's coding standards and include appropriate tests for any new features.   
