package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name for the new item, please: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println("Item: " + name + " was added.");
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] arrWithAllItems = tracker.findAll();
                for (Item arrWithAllItem : arrWithAllItems) {
                    System.out.println(arrWithAllItem);
                }
                if (arrWithAllItems.length == 0) {
                    System.out.println("No items for now");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id of item to edit, please: ");
                int idByUser = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name of the new item, please: ");
                String nameByUser = scanner.nextLine();
                Item editItem = new Item();
                editItem.setName(nameByUser);
                tracker.replace(idByUser, editItem);
                boolean isChanged = (boolean) tracker.replace(idByUser, editItem);
                if (isChanged) {
                    System.out.println("Item id: " + idByUser + " was successfully changed to: " + editItem.getName());
                } else {
                    System.out.println("Item wasn't changed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id of item to delete, please: ");
                int idToDelete = Integer.valueOf(scanner.nextLine());
                tracker.delete(idToDelete);
                boolean isDeleted = tracker.delete(idToDelete) != null;
                if (isDeleted) {
                    System.out.println("Item id was successfully deleted.");
                } else {
                    System.out.println("Item wasn't deleted. Try again, please");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id of item to find, please: ");
                int idToFind = Integer.valueOf(scanner.nextLine());
                Item founded = tracker.findById(idToFind);
                if (founded != null) {
                    System.out.println(founded);
                } else {
                    System.out.println("Item wasn't founded. Try again, please");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name of item to find, please: ");
                String nameToFind = scanner.nextLine();
                Item[] foundedNames = tracker.findByName(nameToFind);
                if (foundedNames.length == 0) {
                    System.out.println("Items weren't find");
                } else {
                    for(Item foundedName: foundedNames) {
                        System.out.println(foundedName);
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
