package com.realdolmen.bestpractices.mockTests;

import com.realdolmen.bestpractices.Calculator;
import com.realdolmen.bestpractices.FormulaService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.ejb.EJB;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FormalaServiceTest extends Assert {
    @Mock
    private Calculator calculator;
    @InjectMocks
    private FormulaService formulaService = new FormulaService();

    @Test
    @Ignore
    public void testAddTimeElapsed() {
//        Mockito.doNothing()
//        int elapsed = formulaService.secondsPassed();
//            formulaService.addTimeElapsed();
//            verify(calc).add(elapsed, 5);
    }

    @Test
    @Ignore
    public void testNumberOfRuns() {
//            int elapsed = formulaService.secondsPassed();
//            formulaService.numberOfRuns();
//            verify(calc).divide(elapsed, 5);
    }
}
