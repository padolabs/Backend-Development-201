package dev.evertonsavio.app.models.products;

public abstract class HotDrink {

    private int quantity;
    private int temperature;
    private int sugar;

    private HotDrink() {
    }

    public HotDrink(HotDrink.DefaultDrink defaultDrink) {
        this.quantity = defaultDrink.getQuantity();
        this.temperature = defaultDrink.getTemperature();
        this.sugar = defaultDrink.getSugar();
    }

    public static class DefaultDrink extends HotDrink
    {
        public DefaultDrink(int quantity, int temperature, int sugar) {
            setQuantity(quantity);
            setTemperature(temperature);
            setSugar(sugar);
        }
        public static DefaultDrink COFFEE_DEFAULT = new DefaultDrink(3, 4, 2);
        public static DefaultDrink CHOCOLATE_DEFAULT = new DefaultDrink(5, 3, 1);
        public static DefaultDrink TEA_DEFAULT = new DefaultDrink(2, 5, 0);
    }

    protected int getQuantity() {
        return quantity;
    }

    protected int getTemperature() {
        return temperature;
    }

    protected int getSugar() {
        return sugar;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    protected void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
