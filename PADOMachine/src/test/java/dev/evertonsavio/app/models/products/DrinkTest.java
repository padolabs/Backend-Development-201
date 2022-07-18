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
        COFFEE_TEST = "{\"quantity\":3, \"temperature\":4, \"sugar\":2}";
        TEA_TEST = "{\"quantity\":3, \"temperature\":5, \"sugar\":0}";
        CHOCOLATE_TEST = "{\"quantity\":5, \"temperature\":3, \"sugar\":1}";
    }

    @Test
    void testCoffeeToString() {
        Coffee coffee = new Coffee();
        String coffeeFirmwareCommand = coffee.toString();
        Assertions.assertEquals(COFFEE_TEST, coffeeFirmwareCommand);
    }


    @Test
    void testTeaToString() {
        Tea tea = new Tea();
        String teaFirmwareCommand = tea.toString();
        Assertions.assertEquals(TEA_TEST, teaFirmwareCommand);
    }


    @Test
    void testChocolateToString() {
        Chocolate chocolate = new Chocolate();
        String chocolateFirmwareCommand = chocolate.toString();
        Assertions.assertEquals(CHOCOLATE_TEST, chocolateFirmwareCommand);
    }
}