package com.company;

import com.company.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @org.junit.Before
    public void setUp() throws Exception {
       calc = new Calculator();
    }

    @Test
    public void shouldReturnSumOfTwoInts() {

        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 2, calc.add(1,1));
        assertEquals(failMessage, 101, calc.add(156,-55));
        assertEquals(failMessage, -33, calc.add(-56,23));
        assertEquals(failMessage, 34, calc.add(20,14));
    }

    @Test
    public void shouldReturnDifferenceOfTwoInts() {

        String failMessage = "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage, 0, calc.subtract(1,1));
        assertEquals(failMessage, -3, calc.subtract(1,4));
        assertEquals(failMessage, 56, calc.subtract(76,20));
        assertEquals(failMessage, -7, calc.subtract(-3,4));

    }

    @Test
    public void shouldReturnProductOfTwoInts() {

        String failMessage = "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage, 16, calc.multiply(4,4));
        assertEquals(failMessage, 5, calc.multiply(5,1));
        assertEquals(failMessage, 0, calc.multiply(41,0));
        assertEquals(failMessage, -16, calc.multiply(-4,4));

    }

    @Test
    public void shouldReturnQuotientOfTwoInts() {

        String failMessage = "Expected calculator to handle integer division.";

        assertEquals(failMessage, 2, calc.divide(12,6));
        assertEquals(failMessage, -17, calc.divide(-51,3));
        assertEquals(failMessage, 0, calc.divide(0,2));
        assertEquals(failMessage, 9, calc.divide(19,2));

    }

    @Test
    public void shouldReturnSumOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double addition.";

        assertEquals(failMessage, 7.6, calc.add(1.1,6.5), .01);
        assertEquals(failMessage, 224.4, calc.add(156.5,67.9), .01);
        assertEquals(failMessage, -1.1, calc.add(-6.7,5.6), .01);
        assertEquals(failMessage, 6.62, calc.add(4.55,2.07), .001);
    }

    @Test
    public void shouldReturnDifferenceOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double subtraction.";

        assertEquals(failMessage, 0, calc.subtract(1.1,1.1), .01);
        assertEquals(failMessage, 468.5, calc.subtract(545.3,76.8), .01);
        assertEquals(failMessage, -8.3, calc.subtract(-5.6,2.7), .01);
        assertEquals(failMessage, -12.8, calc.subtract(-4.33,8.47), .001);

    }

    @Test
    public void shouldReturnProductOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double multiplication.";

        assertEquals(failMessage, 40.96, calc.multiply(6.4,6.4), .01);
        assertEquals(failMessage, 105.64, calc.multiply(55.6,1.9), .01);
        assertEquals(failMessage, 0, calc.multiply(4.1,0), .01);
        assertEquals(failMessage, -26.0988, calc.multiply(-5.46,4.78), .001);
    }

    @Test
    public void shouldReturnQuotientOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double division.";

        assertEquals(failMessage, 7.1, calc.divide(42.6,6), .001);
        assertEquals(failMessage, -1.457, calc.divide(-5.1,3.5), .001);
        assertEquals(failMessage, 0, calc.divide(0,2.6), .001);
        assertEquals(failMessage, 0.6898, calc.divide(1.98,2.87), .0001);

    }
}