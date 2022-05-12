package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {



    @Test
    public void setBunsTest() {
        Bun bun = new Bun("Brioche", 1.30f);

    }

    @Test
    public void addIngredientTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Jam", 0.50f);

    }

    @Test
    public void removeIngredientTest() {
    }

    @Test
    public void moveIngredientTest() {
    }

    @Test
    public void getPriceTest() {
    }

    @Test
    public void getReceiptTest() {
    }
}