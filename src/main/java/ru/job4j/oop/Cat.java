package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("This cat's name is " + this.name + ". It's food is " + this.food + ".");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveName("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveName("Black");
        black.eat("fish");
        black.show();
    }
}
