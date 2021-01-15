package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for(int i = 0; i < items.length; i++) {
            Item name = items[i];
            if(items[i] != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] neededName = new Item[items.length];
        int size = 0;
        for(int i = 0; i < items.length; i++) {
            Item name = items[i];
            if(key.equals(name.getName())) {
                neededName[size] = name;
                size++;
            }
        }
        neededName = Arrays.copyOf(neededName, size);
        return neededName;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
