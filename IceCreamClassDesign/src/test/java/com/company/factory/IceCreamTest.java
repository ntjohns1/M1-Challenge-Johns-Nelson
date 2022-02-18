package com.company.factory;

import org.junit.Before;
import org.junit.Test;

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

    //------------------------------------------------------------------------------------------------------------------
    // Tests for Factory Class
    //------------------------------------------------------------------------------------------------------------------

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

    @Test
    public void shouldPrintCorrectProductionTimeForQuantity() {
//        System.out.format("Your order of 4 gallons of %s ice cream will take %d hours to produce%n", "vanilla", vanilla.getProductionTime() * 4);
//        System.out.format("It will cost %.2f to produce and should be sold at %.2f %n", productionCost * quantity, salePrice * quantity);
        assertEquals(12, vanilla.getProductionTime() * 6);
        assertEquals(36, chocolate.getProductionTime() * 12);
        assertEquals(9, strawberry.getProductionTime() * 3);
    }

    @Test
    public void shouldPrintCorrectProductionCostForOrder() {
//        System.out.format("Your order of 4 gallons of %s ice cream will take %d hours to produce%n", "vanilla", vanilla.getProductionTime() * 4);
//        System.out.format("It will cost %.2f to produce and should be sold at %.2f %n", productionCost * quantity, salePrice * quantity);
        assertEquals(1.2, vanilla.getProductionCost() * 6, .01);
        assertEquals(2.64, chocolate.getProductionCost() * 12, .01);
        assertEquals(.75, strawberry.getProductionCost() * 3, .01);
    }

    @Test
    public void shouldPrintCorrectSalePriceForOrder() {
        assertEquals(4.20, vanilla.getSalePrice() * 6, .01);
        assertEquals(8.4, chocolate.getSalePrice() * 12, .01);
        assertEquals(2.10, strawberry.getSalePrice() * 3, .01);
    }

//    // Tests for Point of Sale Class
//    public void shouldAddIntValueToQuantity() {
//    }
//
//    public void shouldDecrementQuantityAndWritePriceToConsole() {
//    }
//
//    public void shouldInrementQuantityAndWriteMessageToConsole() {

}