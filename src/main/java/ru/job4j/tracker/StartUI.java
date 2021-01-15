package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item some = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String newFormat = some.getCreated().format(formatter);
        System.out.println(newFormat);

        Item second = new Item(1,"Kelly go shopping");
        Tracker tracker = new Tracker();
        tracker.add(second);
        Item kelly = tracker.findById(1);
        System.out.println(kelly);
    }
}
