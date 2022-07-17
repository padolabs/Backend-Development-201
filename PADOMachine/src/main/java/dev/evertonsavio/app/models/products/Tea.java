package dev.evertonsavio.app.models.products;

public class Tea extends HotDrink{

    public Tea()
    {
        super(DefaultDrink.TEA_DEFAULT);
    }

    @Override
    public String toString() {
        return "TEA: {" +
                "\"quantity\":" + this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }

}
