package com.realdolmen.bestpractices.unitTests;

import com.realdolmen.bestpractices.Calculator;
import org.junit.*;

import javax.ejb.EJB;
import javax.inject.Inject;


/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class CalculatorCopyTest extends Assert {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    @Ignore
    public void testAddInts() {
        Assert.assertEquals(10, calculator.add(5, 5));
        assertEquals(8, calculator.add(4, 4) );
        assertEquals(6, calculator.add(3, 3) );
    }

    @Test
    @Ignore
    public void testMultiplyInts() {
        assertEquals(25, calculator.multiply(5, 5) );
        assertEquals(16, calculator.multiply(4, 4) );
        assertEquals(21, calculator.multiply(3, 7) );
    }

    @Test
    @Ignore
    public void testDivideInts() {
        assertEquals(2, calculator.divide(10, 5) );
        assertEquals(3, calculator.divide(12, 4) );
        assertEquals(4, calculator.divide(16, 4) );
        assertEquals(4, calculator.divide(27,7));
    }

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void testDivideIntsByZero() {
        calculator.divide(12, 0);
    }

    @Test
    public void testSquareRootInts() {
        assertEquals(4.0, calculator.root(16), 0);
    }

    @Test
    public void testSquareRootIntsWithNegative() {
        assertEquals(Double.NaN, calculator.root(-16), 0);
        assertEquals(Double.NaN, calculator.root(Double.NEGATIVE_INFINITY), 0);
    }

    @Test
    public void testSquareRootIntsWithInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.root(Double.POSITIVE_INFINITY), 0);
    }
}