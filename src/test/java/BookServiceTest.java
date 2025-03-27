import com.library.model.Book;
import com.library.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    private BookService bookService;

    @BeforeEach
    void setup() {
        bookService = new BookService();
    }

    @Test
    void shouldAddBookSuccessfully() {
        bookService.addBook("Java Basics", "John Doe", "Programming", "Available");
        // Assuming book ID starts from 1
        bookService.searchBookById(1); // Checking if the book exists
    }

    @Test
    void shouldFindBookById() {
        bookService.addBook("Spring Boot", "Jane Doe", "Technology", "Available");
        bookService.searchBookById(2); // Checking if book with ID 2 exists
    }

    @Test
    void shouldFindBookByTitle() {
        bookService.addBook("Data Structures", "Robert", "Computer Science", "Available");
        bookService.searchBookByTitle("Data Structures"); // Should find and print details
    }

    @Test
    void shouldUpdateBookDetails() {
        bookService.addBook("Algorithms", "CLRS", "Computer Science", "Available");
        bookService.updateBook(4, "Advanced Algorithms", "CLRS", "Computer Science", "Checked Out");
        bookService.searchBookById(4); // Should print updated details
    }

    @Test
    void shouldDeleteBookSuccessfully() {
        bookService.addBook("Machine Learning", "Andrew Ng", "AI", "Available");
        bookService.deleteBook(5);
        bookService.searchBookById(5); // Should print "Book not found."
    }
}