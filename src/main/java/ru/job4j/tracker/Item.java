package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {}

    public Item(int id) {
    }

    public Item(int id, String name) {
    }

    public static void main(String[] args) {
        Item newTest = new Item();
        Item secondTest = new Item(2);
        Item thirdTest = new Item(3, "TestName");
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
}
