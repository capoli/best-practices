package com.realdolmen.bestpractices;

/**
 * Created by OCPAX79 on 18/09/2015.
 */

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if(y == 0) throw new ArithmeticException("Can't divide by zero");
        return (int) Math.round(((double) x / y));
    }

    public double root(double x) {
        return Math.sqrt(x);
    }
}
