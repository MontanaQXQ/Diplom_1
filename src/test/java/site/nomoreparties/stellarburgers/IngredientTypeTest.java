package site.nomoreparties.stellarburgers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final String type;
    private final int expectedNumber;

    public IngredientTypeTest(String type, int expectedNumber) {
        this.type = type;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getTypes() {
        return new Object[][]{
                {"SAUCE", 0},
                {"FILLING", 1}
        };
    }

    @Test
    public void ingridientTypeParamTest(){
        int actualNumber = IngredientType.valueOf(IngredientType.class, type).ordinal();
        Assert.assertEquals(expectedNumber, actualNumber);
    }
}
