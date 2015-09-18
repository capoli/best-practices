package com.realdolmen.bestpractices.unitTests;

import com.realdolmen.bestpractices.Bar;
import com.realdolmen.bestpractices.FooBar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class BarTest extends Assert {
    private FooBar fooBar;
    private Bar bar;

    @Before
    public void before() {
        bar = new Bar();
        fooBar = new FooBar();
        fooBar.string1 = "1";
        fooBar.string2 = "2";
        fooBar.string3 = "3";
    }

    @Test
    public void testDoBar() {
        bar.doBar(fooBar);
        assertEquals("string2", fooBar.string2);
        assertEquals("string3", fooBar.string3);
    }
}
