package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " runs by rail.");
    }

    @Override
    public void description(String kind, String action) {
        System.out.println("The " + getClass().getSimpleName() + " number " + kind + " " + action);
    }
}
