package com.company.factory;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class IceCreamTest {

    //----------------------------------------------------------------------------------------------------------------------------------------
    // Fields for Testing
    //----------------------------------------------------------------------------------------------------------------------------------------

    com.company.factory.IceCream vanilla;
    com.company.factory.IceCream chocolate;
    com.company.factory.IceCream strawberry;
    String[] vanillaIngredients;
    String[] chocolateIngredients;
    String[] strawberryIngredients;

    //----------------------------------------------------------------------------------------------------------------------------------------
    // Setup Method
    //----------------------------------------------------------------------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {

        vanillaIngredients = new String[]{"Milk", "Sugar", "Salt", "Vanilla Extract"};
        chocolateIngredients = new String[]{"Milk", "Sugar", "Salt", "Cocoa"};
        strawberryIngredients = new String[]{"Milk", "Sugar", "Salt", "Strawberries"};

        vanilla = new com.company.factory.IceCream("vanilla", .70, .20, 2, vanillaIngredients);
        chocolate = new com.company.factory.IceCream("chocolate", .70, .22, 3, chocolateIngredients);
        strawberry = new com.company.factory.IceCream("strawberry", .70, .25, 3, strawberryIngredients);

    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    //------------------------------------------------------------------------------------------------------------------
    // Tests for Factory Class
    //------------------------------------------------------------------------------------------------------------------

    // Class IceCream: public method replaceIngredient()
    @Test
    public void shouldReplaceIngredientArrayElementAtIndex() {
        String[] expected1 = new String[]{"Milk", "Sugar", "Salt", "Vanilla Syrup"};
        String[] expected2 = new String[]{"Cream", "Sugar", "Salt", "Cocoa"};
        String[] expected3 = new String[]{"Milk", "Corn Syrup", "Salt", "Strawberries"};

        vanilla.replaceIngredient(3, "Vanilla Syrup");
        chocolate.replaceIngredient(0, "Cream");
        strawberry.replaceIngredient(1, "Corn Syrup");

        assertArrayEquals(expected1, vanilla.getIngredients());
        assertArrayEquals(expected2, chocolate.getIngredients());
        assertArrayEquals(expected3, strawberry.getIngredients());
    }

    // Class IceCream: public method addNewIngredient()
    @Test
    public void shouldCreateNewArrayWithAdditionalIngredient() {
        String[] expected1 = new String[]{"Milk", "Sugar", "Salt", "Vanilla Extract", "Cream"};
        String[] expected2 = new String[]{"Milk", "Sugar", "Salt", "Cocoa", "Eggs"};
        String[] expected3 = new String[]{"Milk", "Sugar", "Salt", "Strawberries", "Xanthan Gum"};

        vanilla.addNewIngredient("Cream");
        chocolate.addNewIngredient("Eggs");
        strawberry.addNewIngredient("Xanthan Gum");

        assertArrayEquals(expected1, vanilla.getIngredients());
        assertArrayEquals(expected2, chocolate.getIngredients());
        assertArrayEquals(expected3, strawberry.getIngredients());
    }

    // Class IceCream: public method getProductionTime()
    @Test
    public void shouldPrintCorrectProductionTimeForQuantity() {
        assertEquals(12, vanilla.getProductionTime() * 6);
        assertEquals(36, chocolate.getProductionTime() * 12);
        assertEquals(9, strawberry.getProductionTime() * 3);
    }

    // Class IceCream: public method getProductionCost()
    @Test
    public void shouldPrintCorrectProductionCostForOrder() {
        assertEquals(1.2, vanilla.getProductionCost() * 6, .01);
        assertEquals(2.64, chocolate.getProductionCost() * 12, .01);
        assertEquals(.75, strawberry.getProductionCost() * 3, .01);
    }



}