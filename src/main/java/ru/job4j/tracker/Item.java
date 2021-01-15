package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {}

    public Item(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item newTest = new Item();
        Item secondTest = new Item(2);
        Item thirdTest = new Item(3, "TestName");
        System.out.println(newTest);
        System.out.println(secondTest.id);
        System.out.println(thirdTest.name);
        System.out.println(thirdTest.getCreated());
    }
}
