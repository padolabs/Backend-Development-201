package dev.evertonsavio.app.models.machines;

import dev.evertonsavio.app.models.products.Coffee;
import dev.evertonsavio.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
