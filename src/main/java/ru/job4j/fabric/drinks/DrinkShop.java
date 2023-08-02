package ru.job4j.fabric.drinks;

import ru.job4j.fabric.drinks.drinkTypes.coffee.CoffeeCreator;
import ru.job4j.fabric.drinks.drinkTypes.coffee.CoffeeTypes;

public class DrinkShop {
    public static void main(String[] args) {
        DrinkFactoryCreator coffeeCreator = new CoffeeCreator();
        coffeeCreator.prepareDrink(CoffeeTypes.ESPRESSO);
        System.out.println(coffeeCreator.messageForClient());
    }
}
