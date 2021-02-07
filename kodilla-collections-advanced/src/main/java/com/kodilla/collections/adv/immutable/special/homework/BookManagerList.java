package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManagerList {
    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        for (Book b : books){
            if (b.equals(newBook)){
                System.out.println("duplicate");
                return b;
            }
        }
        books.add (newBook);
        System.out.println(books.size());
        return newBook;
    }
}
