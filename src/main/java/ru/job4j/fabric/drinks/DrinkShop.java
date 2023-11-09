package ru.job4j.fabric.drinks;

import ru.job4j.fabric.drinks.drinktypes.coffee.CoffeeCreator;
import ru.job4j.fabric.drinks.drinktypes.coffee.CoffeeTypes;

public class DrinkShop {
    public static void main(String[] args) {
        DrinkFactoryCreator coffeeCreator = new CoffeeCreator();
        coffeeCreator.prepareDrink(CoffeeTypes.ESPRESSO);
        System.out.println(coffeeCreator.messageForClient());
    }
}
