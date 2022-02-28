package site.nomoreparties.stellarburgers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {


    @Test
    public void ingredientGetPriceTest() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals("Price value didn't match", 100F, ingredient.getPrice(), 0);

    }

    @Test
    public void ingredientGetNameTest() {

        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals("Name value didn't match", "hot sauce", ingredient.getName());
    }

    @Test
    public void ingredientGetTypeTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
        assertEquals("Ingredient value didn't match", IngredientType.SAUCE, ingredient.getType());
    }
}