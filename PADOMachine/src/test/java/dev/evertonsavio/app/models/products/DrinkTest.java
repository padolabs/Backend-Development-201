package dev.evertonsavio.app.models.products;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DrinkTest {

    private String COFFEE_TEST;
    private String TEA_TEST;
    private String CHOCOLATE_TEST;

    @BeforeEach
    void setUp() {
        COFFEE_TEST = "COFFEE: {\"quantity\":3, \"temperature\":4, \"sugar\":2}";
        TEA_TEST = "TEA: {\"quantity\":3, \"temperature\":3, \"sugar\":3}";
        CHOCOLATE_TEST = "Chocolate{\"quantity\":5, \"temperature\":3, \"sugar\":1}";
    }

    @Test
    void testCoffeeToString() {
        Coffee coffee = new Coffee();
        Assertions.assertEquals(COFFEE_TEST, coffee.toString());
    }

    @Test
    void testTeaToString() {
        Tea tea = new Tea();
        Assertions.assertEquals(TEA_TEST, tea.toString());
    }

    @Test
    void testChocolateToString() {
        Chocolate chocolate = new Chocolate();
        Assertions.assertEquals(CHOCOLATE_TEST, chocolate.toString());
    }
}