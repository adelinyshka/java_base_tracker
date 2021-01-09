package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student adel = new Student();
        adel.setName("Adel Dubinnikova");
        adel.setGroup("elementary");
        adel.setDateStart("31.11.2020");

        String name = adel.getName();
        String group = adel.getGroup();
        String dateStart = adel.getDateStart();

        System.out.println(name + " started her studies at "+ dateStart + " in group: " + group);
    }
}
