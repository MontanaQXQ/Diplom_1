package praktikum;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    private Ingredient mockIngredient;

    @Mock
    private Bun mockBun;

    @Test
    public void setBunBurgerTest() {
        Burger burger = new Burger();
        burger.setBuns(mockBun);
        Assert.assertNotNull(burger.bun);
    }

    @Test
    public void addIngredientBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(mockIngredient);
        assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void removedIngredientFromBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(mockIngredient);
        burger.removeIngredient(0);
        assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void ingredientMovedBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        burger.moveIngredient(0, 1);
        assertEquals("dinosaur", burger.ingredients.get(0).name);
    }

    @Test
    public void getBurgerPriceTest() {
        Burger burger = new Burger();
        Mockito.when(mockBun.getPrice()).thenReturn(100F);
        Mockito.when(mockIngredient.getPrice()).thenReturn(300F);
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient);
        assertEquals(500, burger.getPrice(), 0);
        /*
        burger.setBuns(new Bun("red bun", 300));
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        */
    }

    @Test
    public void getBurgerReceiptTest() {
        Burger burger = new Burger();


    }

}