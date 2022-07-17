package dev.evertonsavio.app.models.products;

public class Chocolate extends HotDrink{

    public Chocolate()
    {
        super(DefaultDrink.CHOCOLATE_DEFAULT);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }
}
