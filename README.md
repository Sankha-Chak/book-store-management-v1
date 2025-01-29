# Book Store Management Application

This is a Spring Boot application for managing an online bookstore. Customers can log in, browse books, add them to the cart, and make purchases. This is a personal project.

## Features

- Customer Registration & Login
- Admin Login
- View Book Details (Title, Author, Price, Genre, Availability)
- Add Books to Cart & Place Orders
- Manage Orders & Payments

## Technologies Used

- **Spring Boot** 3.4.2
- **Maven** for dependency management
- **Java** 23.0.1
- **MySQL** for database management

## Getting Started

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/Sankha-Chak/book-store-management-v1.git
   ```

2. **Set Up the Database:** Create a MySQL database and configure `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookstore_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the Project:** Navigate to the project folder and build the application using Maven:

   ```bash
   mvn clean install
   ```

4. **Run the Application:**

   ```bash
   java -jar target/book-store-management-0.0.1-SNAPSHOT.jar
   ```

5. **Access the Application:** The application will be available at: [http://localhost:8080](http://localhost:8080)

## License

This project is licensed under the Apache 2.0 License. See the `LICENSE` file for details.

## Author

- **Sankha Chakraborty** - [GitHub Profile](https://github.com/Sankha-Chak)

