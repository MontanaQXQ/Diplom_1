package site.nomoreparties.stellarburgers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IngredientTest {


    @Test
    public void ingredientGetPriceTest() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals(100F, ingredient.getPrice(),0);

    }
    @Test
    public void ingredientGetNameTest() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals("hot sauce", ingredient.getName());

    }
    @Test
    public void ingredientGetTypeTest() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals(IngredientType.SAUCE, ingredient.getType());

    }
}