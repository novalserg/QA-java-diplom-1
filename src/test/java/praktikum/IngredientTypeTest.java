package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void values() {
        assertNotNull(IngredientType.FILLING);
        assertNotNull(IngredientType.SAUCE);
    }
}