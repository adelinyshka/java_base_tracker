package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int num) {
        this.load = num;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(20);
        Battery two = new Battery(43);
        System.out.println("Battery one contains " + one.load);
        System.out.println("Battery two contains " + two.load);
        one.exchange(two);
        System.out.println("Now battery one contains " + one.load);
        System.out.println("Now battery two contains " + two.load);
    }
}
