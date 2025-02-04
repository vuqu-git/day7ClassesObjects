package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "\n" + Arrays.toString(books) +
                '}';
    }

    public static void main(String[] args) {
        Book lotr = new Book("The Lord of the Rings: The fellowship of the ring",
                "Tolkien",
                "3487843297743"
        );

        Book hp = new Book("Harry Potter and the Philosopher's Stone.",
                "Rowling",
                "8987493759843"
        );

        Book[] booksArray = new Book[]{lotr, hp};
        Library myLib = new Library(booksArray);

        System.out.println(myLib);
    }

}

class BetterLibrary {
    private ArrayList<Book> books;

    public BetterLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BetterLibrary{" +
                "\n" + books +
                '}';
    }

    public void addToLib(Book newBook) {
        getBooks().add(newBook);
    }


    public static void main(String[] args) {
        Book lotr = new Book("The Lord of the Rings: The fellowship of the ring",
                "Tolkien",
                "3487843297743"
        );

        Book hp = new Book("Harry Potter and the Philosopher's Stone.",
                "Rowling",
                "8987493759843"
        );


        BetterLibrary myLib = new BetterLibrary(new ArrayList<Book>());
        myLib.addToLib(lotr);
        myLib.addToLib(hp);
        System.out.println(myLib);
    }

}
