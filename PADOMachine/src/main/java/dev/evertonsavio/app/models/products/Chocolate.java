package dev.evertonsavio.app.models.products;

public class Chocolate implements HotDrink{

    private int quantity = 3;
    private int temperature = 3;
    private int sugar = 3;

    public Chocolate() {
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "quantity=" + quantity +
                ", temperature=" + temperature +
                ", sugar=" + sugar +
                '}';
    }
}
