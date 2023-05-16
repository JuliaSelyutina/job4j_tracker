package ru.job4j.cast;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " flies through the air.");
    }

    @Override
    public void description(String kind, String action) {
        System.out.println(kind + " " + getClass().getSimpleName() + " " + action);
    }
}
