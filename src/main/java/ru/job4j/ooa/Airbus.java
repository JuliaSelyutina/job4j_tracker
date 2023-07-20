package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;
    private static final String MODEL_NAME_A380 = "A380";

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + name == MODEL_NAME_A380 ? 4 : COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
