package site.nomoreparties.stellarburgers;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testBunCanGetName(){
        Bun bun = new  Bun("F112",900);
        assertEquals("F112",bun.getName());

    }

    @Test
    public void testBunCanGetPrice(){
        Bun bun = new  Bun("F112",900);
        assertEquals(900,bun.getPrice(),0);

    }
}