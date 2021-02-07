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

        Book bookL1 = BookManagerList.createBook("Chłopiec z lasu", "Coben Harlan");
        Book bookL2 = BookManagerList.createBook("Początek", "Brown Dan");
        Book bookL3 = BookManagerList.createBook("Szepty spoza nicości", "Mróz Remigiusz");
        Book bookL4 = BookManagerList.createBook("Chłopiec z lasu", "Coben Harlan");
        Book bookL5 = BookManagerList.createBook("Początek", "Brown Dan");


        System.out.println(bookL1.hashCode());
        System.out.println(bookL2.hashCode());
        System.out.println(bookL3.hashCode());
        System.out.println(bookL4.hashCode());
        System.out.println(bookL5.hashCode());

    }
}
