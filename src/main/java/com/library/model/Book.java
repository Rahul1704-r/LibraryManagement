package com.library.model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;

    public Book(int bookId, String title, String author, String genre, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }


    @Override
    public String toString() {
        return "Book{" + "ID=" + bookId + ", Title='" + title + "', Author='" + author + "', Genre='" + genre +
                "', Availability='" + availabilityStatus + "'}";
    }
}