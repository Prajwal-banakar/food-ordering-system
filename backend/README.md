# Food Ordering System Backend

This is the Spring Boot backend for the Food Ordering System.

## Prerequisites

1.  **Java Development Kit (JDK) 17**: Ensure you have Java 17 installed.
2.  **Maven**: You need Maven to build and run the project.
3.  **MySQL**: Ensure MySQL is installed and running locally on port `3306`.

## How to Run

### Option 1: Using Command Line (Maven)

1.  Open a terminal or command prompt.
2.  Navigate to the `backend` directory:
    ```bash
    cd backend
    ```
3.  Run the application using the Spring Boot Maven plugin:
    ```bash
    mvn spring-boot:run
    ```

### Option 2: Using an IDE (IntelliJ IDEA, Eclipse, VS Code)

1.  Open your IDE.
2.  Import the `backend` folder as a **Maven Project**.
3.  Locate the main class: `src/main/java/com/foodordering/backend/BackendApplication.java`.
4.  Right-click on the file and select **Run 'BackendApplication'**.

## API Endpoints

The backend runs on `http://localhost:8080`.

*   **GET** `/api/products` - Get all products
*   **GET** `/api/products/{id}` - Get a product by ID
*   **POST** `/api/products` - Create a new product

## Database Configuration

The application connects to a local MySQL instance.
Configuration is in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
```
