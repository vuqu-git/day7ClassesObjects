package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Library {
    Book[] books;


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
