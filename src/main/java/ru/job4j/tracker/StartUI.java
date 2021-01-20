package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item some = new Item();
        Tracker tracker = new Tracker();
        Item second = new Item(1,"Kelly goes shopping");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String newFormat = some.getCreated().format(formatter);
        tracker.add(second);
        Item kelly = tracker.findById(1);

        System.out.println(newFormat);
        System.out.println(kelly);
    }
}
