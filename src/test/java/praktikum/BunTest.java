package praktikum;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BunTest {

    @Test
    public void getNameTest(){
        Bun bun = new Bun("Rice", 1.22f);
        String expected = "Rice";
        String actual = bun.getName();
        assertEquals(actual, expected);
    }

    @Test
    public void getPriceTest(){
        Bun bun = new Bun("Rice", 1.22f);
        float expected = 1.22f;
        float actual = bun.getPrice();
        assertEquals("Цены не совпадают", actual, expected, 0.00f);
    }
        }


  /*  public void getFamilyFelineTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);*/