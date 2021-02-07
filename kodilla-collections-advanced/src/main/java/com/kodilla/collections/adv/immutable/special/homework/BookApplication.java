package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Chłopiec z lasu", "Coben Harlan");
        Book book2 = BookManager.createBook("Początek", "Brown Dan");
        Book book3 = BookManager.createBook("Szepty spoza nicości", "Mróz Remigiusz");
        Book book4 = BookManager.createBook("Chłopiec z lasu", "Coben Harlan");
        Book book5 = BookManager.createBook("Początek", "Brown Dan");
        Book book6 = BookManager.createBook("Szepty spoza nicości", "Mróz Remigiusz");
        Book book7 = BookManager.createBook("Chłopiec z lasu", "Coben Harlan");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println(book5.hashCode());
        System.out.println(book6.hashCode());
        System.out.println(book7.hashCode());

    }
}
