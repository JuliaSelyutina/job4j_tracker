package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " moves along the highway.");
    }

    @Override
    public void description(String kind, String action) {
        System.out.println(kind + " " + getClass().getSimpleName() + " " + action);
    }
}
