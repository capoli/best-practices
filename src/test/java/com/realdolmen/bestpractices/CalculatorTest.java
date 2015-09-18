package com.realdolmen.bestpractices;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class CalculatorTest extends Assert {
    @Test
    public void testAddInts() {
        assertEquals(10, Calculator.add(5, 5) );
        assertEquals(8, Calculator.add(4, 4) );
    }

    @Test
    public void testMultiplyInts() {
        assertEquals(25, Calculator.multiply(5, 5) );
        assertEquals(16, Calculator.multiply(4, 4) );
    }

    @Test
    public void testDivideInts() {
        assertEquals(2, Calculator.add(10, 5) );
        assertEquals(3, Calculator.add(12, 4) );
    }
}
