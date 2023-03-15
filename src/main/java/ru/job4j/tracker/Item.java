package ru.job4j.tracker;

public class Item {
    /*
    2. Создайте три конструктора:
    без параметров,
    с параметром String name,
    с параметрами int id и String name.

    Конструкторы с параметрами должны инициализировать поля, которые объявлены в классе
     */
    private int id;
    private String name;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}