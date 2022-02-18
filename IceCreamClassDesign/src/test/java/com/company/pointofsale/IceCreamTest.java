package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    com.company.pointofsale.IceCream vanilla;
    com.company.pointofsale.IceCream chocolate;
    com.company.pointofsale.IceCream strawberry;

    @Before
    public void setUp() throws Exception {
        vanilla = new com.company.pointofsale.IceCream("vanilla", 2.76);
        chocolate = new com.company.pointofsale.IceCream("chocolate", 2.80);
        strawberry = new com.company.pointofsale.IceCream("strawberry", 2.86);
    }

    // Tests for Point of Sale Class
    @Test
    public void shouldAddIntValueToQuantity() {
        vanilla.restock(12);
        chocolate.restock(384);
        strawberry.restock(64);

        assertEquals(396, vanilla.getQuantity());
        assertEquals(768, chocolate.getQuantity());
        assertEquals(448, strawberry.getQuantity());
    }

    @Test
    public void shouldDecrementQuantityAndWritePriceToConsole() {
        vanilla.makeSale(1);
        chocolate.makeSale(2);
        strawberry.makeSale(3);

        assertEquals(380, vanilla.getQuantity());
        assertEquals(376, chocolate.getQuantity());
        assertEquals(372, strawberry.getQuantity());
    }

    @Test
    public void shouldInrementQuantityAndWriteMessageToConsole() {
        vanilla.voidSale(1);
        chocolate.voidSale(2);
        strawberry.voidSale(3);

        assertEquals(388, vanilla.getQuantity());
        assertEquals(392, chocolate.getQuantity());
        assertEquals(396, strawberry.getQuantity());

    }
}