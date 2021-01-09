package ru.job4j.pojo;

public class Book {
    public String getName() {
        return name;
    }

    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }
}
