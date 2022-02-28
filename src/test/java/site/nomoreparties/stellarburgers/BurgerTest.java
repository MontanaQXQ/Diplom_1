package site.nomoreparties.stellarburgers;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

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
        Assert.assertNotNull("Bun is Null", burger.bun);
    }

    @Test
    public void addIngredientBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(mockIngredient);
        assertEquals("Incorrect Value of Ingredients - Must be 1 ", 1, burger.ingredients.size());
    }

    @Test
    public void removedIngredientFromBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(mockIngredient);
        burger.removeIngredient(0);
        assertEquals("Incorrect Value of Ingredients - Must be 0", 0, burger.ingredients.size());
    }


    @Test
    public void ingredientMovedBurgerTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        burger.moveIngredient(0, 1);
        assertEquals("Incorrect move of ingredients", "dinosaur", burger.ingredients.get(0).name);
    }

    @Test
    public void getBurgerPriceTest() {
        Burger burger = new Burger();
        Mockito.when(mockBun.getPrice()).thenReturn(100F);
        Mockito.when(mockIngredient.getPrice()).thenReturn(300F);
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient);
        assertEquals("Incorrect Value of Burger Price", 500, burger.getPrice(), 0);

    }

    @Test
    public void getBurgerReceiptTest() {
        Burger burger = new Burger();
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient);
        Mockito.when(mockBun.getName()).thenReturn("red bun");
        Mockito.when(mockBun.getPrice()).thenReturn(100f);
        Mockito.when(mockIngredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(mockIngredient.getName()).thenReturn("cutlet");
        Mockito.when(mockIngredient.getPrice()).thenReturn(300f);
        String expected = "(==== red bun ====)" + "\r\n" + "= filling cutlet =" + "\r\n" + "(==== red bun ====)" + "\r\n" + "\r\n" + "Price: 500,000000\r\n";
        assertEquals("Final receipt incorrect", expected, burger.getReceipt());
    }

}