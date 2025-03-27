package com.library.ui;

import com.library.service.BookService;
import java.util.Scanner;

public class LibraryUI {
    private final BookService bookService;
    private final Scanner scanner;

    public LibraryUI() {
        this.bookService = new BookService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewAllBooks();
                case 3 -> searchBook();
                case 4 -> updateBook();
                case 5 -> deleteBook();
                case 6 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n LIBRARY MANAGEMENT SYSTEM ");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book (by ID or Title)");
        System.out.println("4. Update Book");
        System.out.println("5. Delete Book");
        System.out.println("6. Exit");
    }

    private void addBook() {

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();

        bookService.addBook(title, author, genre, availability);
        System.out.println(" Book added successfully!");
    }

    private void viewAllBooks() {
        bookService.viewAllBooks();
    }

    private void searchBook() {
        System.out.println("Search Book by:");
        System.out.println("1. ID");
        System.out.println("2. Title");
        System.out.print("Choose an option: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (searchChoice) {
            case 1 -> {
                System.out.print("Enter Book ID: ");
                int bookId = scanner.nextInt();
                bookService.searchBookById(bookId);
            }
            case 2 -> {
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                bookService.searchBookByTitle(title);
            }
            default -> System.out.println("Invalid option. Try again.");
        }
    }

    private void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new Title (leave blank to keep unchanged): ");
        String title = scanner.nextLine();

        System.out.print("Enter new Author (leave blank to keep unchanged): ");
        String author = scanner.nextLine();

        System.out.print("Enter new Genre (leave blank to keep unchanged): ");
        String genre = scanner.nextLine();

        System.out.print("Enter new Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();

        bookService.updateBook(bookId, title, author, genre, availability);
        System.out.println(" Book details updated!");
    }

    private void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int bookId = scanner.nextInt();

        bookService.deleteBook(bookId);
        System.out.println("Book deleted successfully!");
    }
}