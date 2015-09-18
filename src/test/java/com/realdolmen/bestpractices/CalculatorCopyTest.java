package com.realdolmen.bestpractices;

import org.junit.*;


/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class CalculatorCopyTest extends Assert {
    @Test
    @Ignore
    public void testAddInts() {
        assertEquals(10, Calculator.add(5, 5) );
        assertEquals(8, Calculator.add(4, 4) );
        assertEquals(6, Calculator.add(3, 3) );
    }

    @Test
    @Ignore
    public void testMultiplyInts() {
        assertEquals(25, Calculator.multiply(5, 5) );
        assertEquals(16, Calculator.multiply(4, 4) );
        assertEquals(21, Calculator.multiply(3, 7) );
    }

    @Test
    @Ignore
    public void testDivideInts() {
        assertEquals(2, Calculator.divide(10, 5) );
        assertEquals(3, Calculator.divide(12, 4) );
        assertEquals(4, Calculator.divide(16, 4) );
        assertEquals(4, Calculator.divide(27,7));
    }

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void testDivideIntsByZero() {
        Calculator.divide(12, 0);
    }

    @Test
    public void testSquareRootInts() {
        assertEquals(4.0, Calculator.root(16), 0);
    }

    @Test
    public void testSquareRootIntsWithNegative() {
        assertEquals(Double.NaN, Calculator.root(-16), 0);
        assertEquals(Double.NaN, Calculator.root(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testSquareRootIntsWithInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, Calculator.root(Double.POSITIVE_INFINITY), 0);
    }
}