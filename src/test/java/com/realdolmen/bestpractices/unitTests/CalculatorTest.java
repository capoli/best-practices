package com.realdolmen.bestpractices.unitTests;

import com.realdolmen.bestpractices.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.EJB;
import javax.inject.Inject;


/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class CalculatorTest extends Assert {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAddInts() {
        Assert.assertEquals(10, calculator.add(5, 5));
        assertEquals(8, calculator.add(4, 4) );
        assertEquals(6, calculator.add(3, 3) );
    }

    @Test
    public void testMultiplyInts() {
        assertEquals(25, calculator.multiply(5, 5) );
        assertEquals(16, calculator.multiply(4, 4) );
        assertEquals(21, calculator.multiply(3, 7) );
    }

    @Test
    public void testDivideInts() {
        assertEquals(2, calculator.divide(10, 5) );
        assertEquals(3, calculator.divide(12, 4) );
        assertEquals(4, calculator.divide(16, 4) );
        assertEquals(4, calculator.divide(27,7));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideIntsByZero() {
        calculator.divide(12, 0);
    }
}
