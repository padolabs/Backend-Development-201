package dev.evertonsavio.app.models.machines;

import dev.evertonsavio.app.models.products.Chocolate;
import dev.evertonsavio.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
