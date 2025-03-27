package com.library.service;

import com.library.dao.BookDAO;
import com.library.model.Book;
import java.util.List;

public class BookService {
    private final BookDAO bookDAO = new BookDAO();
    private int bookIdCounter = 1;

    public void addBook(String title, String author, String genre, String availability) {
        Book book = new Book(bookIdCounter++, title, author, genre, availability);
        bookDAO.addBook(book);

    }

    public void viewAllBooks() {
        List<Book> books = bookDAO.getAllBooks();
        books.forEach(System.out::println);
    }

    public void updateBook(int bookId, String title, String author, String genre, String availabilityStatus) {
        bookDAO.updateBook(bookId, title, author, genre, availabilityStatus);
    }

    public void searchBookById(int bookId) {
        Book book = bookDAO.searchBookById(bookId);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBookByTitle(String title) {
        List<Book> books = bookDAO.searchBookByTitle(title);
        if (!books.isEmpty()) {
            books.forEach(System.out::println);
        } else {
            System.out.println("No books found with the given title.");
        }
    }

    public void deleteBook(int bookId) {
        bookDAO.deleteBook(bookId);
    }

}