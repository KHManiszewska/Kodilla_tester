package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        for (Book b : books){
            if (b.equals(newBook)){
                System.out.println("duplicate");
            }
        }
        books.add (newBook);
        System.out.println(books.size());
        return newBook;
    }

}
