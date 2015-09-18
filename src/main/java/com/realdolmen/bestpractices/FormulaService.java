package com.realdolmen.bestpractices;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateful;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@Stateful
@Startup
public class FormulaService {
    protected static final int HOP = 5;
    private int secondsPassed = 0;

    @EJB
    private Calculator calculator;

    @Schedule(second= "*/"+HOP, minute = "*", hour = "*", persistent = false)
    public void addTheTimeElapsed() {
        secondsPassed = calculator.add(secondsPassed, HOP);
    }
    public int secondsPassed() {
        return secondsPassed;
    }
    public void numberOfRuns() {
        calculator.divide(secondsPassed, HOP);
    }
    public void skipAhead(int skipCount) {
        secondsPassed = calculator.add(secondsPassed, calculator.multiply(HOP, skipCount));
    }
}
