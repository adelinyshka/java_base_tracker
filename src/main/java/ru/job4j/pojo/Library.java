package ru.job4j.pojo;

import java.lang.reflect.Array;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Advantures", 230);
        Book two = new Book("Novel", 360);
        Book three = new Book("Clean Code", 330);
        Book four = new Book("Refactoring", 560);

        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;

        for(Book b: books) {
            System.out.println(b.getName());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Change 0 to 3");

        for(Book b: books) {
            System.out.println(b.getName());
        }
        System.out.println("Get only Clean Code");
        for(Book b: books) {
            if (b.getName().equals("Clean Code")) {
                System.out.println(b.getName());
            }
        }
    }
}
