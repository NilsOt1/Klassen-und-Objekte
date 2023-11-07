package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Book test = new Book();

        System.out.println(test.toString());

        Book book1 = new Book("Er", "Steven King", "123-123-123-126");
        Book book2 = new Book("Sie", "Steven Kong", "123-123-123-127");
        Book book3 = new Book("Es", "Steven Kang", "123-123-123-128");

        Book[] books = {book1, book2, book3};

        Library library = new Library(books);

        System.out.println(library);


    }

}
