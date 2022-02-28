package site.nomoreparties.stellarburgers;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testBunCanGetName() {
        Bun bun = new Bun("F112", 900);
        assertEquals("Name didn't match", "F112", bun.getName());

    }


    @Test
    public void testBunCanGetPrice() {
        Bun bun = new Bun("F112", 900);
        assertEquals("Price didn't match", 900, bun.getPrice(), 0);

    }
}