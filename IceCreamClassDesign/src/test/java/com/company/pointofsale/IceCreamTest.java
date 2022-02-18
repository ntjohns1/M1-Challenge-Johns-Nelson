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
        vanilla = new com.company.pointofsale.IceCream("vanilla", .70);
        chocolate = new com.company.pointofsale.IceCream("chocolate", .70);
        strawberry = new com.company.pointofsale.IceCream("strawberry", .70);
    }

    // Tests for Point of Sale Class
    public void shouldAddIntValueToQuantity() {
    }

    public void shouldDecrementQuantityAndWritePriceToConsole() {
    }

    public void shouldInrementQuantityAndWriteMessageToConsole() {
    }
}