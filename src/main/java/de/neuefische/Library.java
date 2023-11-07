package de.neuefische;

import java.util.Arrays;

public class Library {
    private Book[] books;
    public Library() {
    }

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }


}
