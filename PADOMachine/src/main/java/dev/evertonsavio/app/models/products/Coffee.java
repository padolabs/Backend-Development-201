package dev.evertonsavio.app.models.products;

public class Coffee extends HotDrink{

    public Coffee()
    {
        super(DefaultDrink.COFFEE_DEFAULT);
    }

    @Override
    public String toString() {
        return "COFFEE: {" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }
}
