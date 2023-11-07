package de.neuefische;

import java.util.Arrays;

public class Library {
    private Book[] books;
    public Library() {
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[books.length] = book;
        this.books = newBooks;
    }

    public void removeBook(Book book) {
        Book[] newBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (!book.equals(books[i])) {
                newBooks[i] = books[i];
            }
        }
        this.books = newBooks;

    }



    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }


}
