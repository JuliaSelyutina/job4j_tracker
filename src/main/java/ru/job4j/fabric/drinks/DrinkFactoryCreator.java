package ru.job4j.fabric.drinks;

import ru.job4j.fabric.drinks.drinktypes.DrinkTypes;

public abstract class DrinkFactoryCreator {

    public abstract Drink prepareDrink(DrinkTypes type);

    public String messageForClient() {
        return "Here's your drink! Thank you, come again!";
    }
}
