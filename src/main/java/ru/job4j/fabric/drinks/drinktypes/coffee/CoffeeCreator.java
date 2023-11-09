package ru.job4j.fabric.drinks.drinktypes.coffee;

import ru.job4j.fabric.drinks.Drink;
import ru.job4j.fabric.drinks.DrinkFactoryCreator;
import ru.job4j.fabric.drinks.drinktypes.DrinkTypes;
import ru.job4j.fabric.drinks.drinktypes.coffee.drinksmenu.*;

public class CoffeeCreator extends DrinkFactoryCreator {
    @Override
    public Drink prepareDrink(DrinkTypes type) {
        return switch ((CoffeeTypes) type) {
            case AMERICANO -> new Americano();
            case CAFE_AU_LAIT -> new CafeAuLait();
            case CAPPUCCINO -> new Cappuccino();
            case CORTADO -> new Cortado();
            case ESPRESSO -> new Espresso();
            case FLAT_WHITE -> new FlatWhite();
            case FRAPPE -> new Frappe();
            case LATTE_MACCHIATO -> new CaffeLatte();
            case LUNGO -> new Lungo();
            case MOCHACCINO -> new Mochaccino();
        };
    }
}
