package com.realdolmen.bestpractices.mockTests;

import com.realdolmen.bestpractices.Bar;
import com.realdolmen.bestpractices.Foo;
import com.realdolmen.bestpractices.FooBar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FooTest extends Assert{
    @Mock
    private Bar barMock;
    @InjectMocks
    private Foo foo = new Foo();

    private String myString1;

    @Before
    public void before() {
        myString1 = "lol";
    }

    @Test
    public void testDoFooForString() {
        String result = foo.doFoo(myString1);

        ArgumentCaptor<FooBar> fooBarArgumentCaptor = ArgumentCaptor.forClass(FooBar.class);
        Mockito.verify(barMock).doBar(fooBarArgumentCaptor.capture());

        FooBar captured = fooBarArgumentCaptor.getValue();

        assertNotNull(captured);
        assertEquals(myString1, captured.string1);
        assertNotNull(result);
        assertEquals(myString1, result);
    }
}
