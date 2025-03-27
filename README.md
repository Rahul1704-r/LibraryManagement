#  Library Management System  

A **Java-based** Library Management System that allows librarians to efficiently **add, update, search, and remove books** while maintaining their **availability status**.

---

##  Features  
- ✅ **Add a Book** → Store book details (Title, Author, Genre, Availability).  
- ✅ **View All Books** → List all books in the system.  
- ✅ **Search Book by ID or Title** → Find books by their unique ID or title.  
- ✅ **Update Book Details** → Modify book details (Title, Author, Genre, Availability).  
- ✅ **Delete a Book Record** → Remove books from the system.  
- ✅ **Exit System** → Close the application.  

---

##  Tech Stack  
- **Java 17**  
- **PostgreSQL** (Database)  
- **JDBC** (Database connectivity)  
- **Maven** (Dependency management)  

---

---

##  Database Setup  
1. **Create PostgreSQL Database**  
   ```sql
   CREATE DATABASE library_db;

 2.	**Create books Table**
    ```sql
     CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    availability VARCHAR(20) CHECK (availability IN ('Available', 'Checked Out'))
    );

  3.Update database connection settings in DatabaseConnection.java
    ```java
    
    	private static final String URL = "jdbc:postgresql://localhost:5432/library_db";
      private static final String USER = "your_username";
      private static final String PASSWORD = "your_password";

---

  ## Build & Run the Project  
1. **Navigate to the project directory**  
   ```sh
   cd library-management-system

2.	**Compile the project**
    ```sql
     mvn clean compile

 3. Run the application
    ```sh
    mvn exec:java -Dexec.mainClass="com.library.LibraryManagementSystem"




     
    
  

