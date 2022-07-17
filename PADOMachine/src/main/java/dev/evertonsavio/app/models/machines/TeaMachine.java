package dev.evertonsavio.app.models.machines;

import dev.evertonsavio.app.models.products.HotDrink;
import dev.evertonsavio.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
