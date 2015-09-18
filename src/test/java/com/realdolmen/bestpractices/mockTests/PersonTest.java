package com.realdolmen.bestpractices.mockTests;

import com.realdolmen.bestpractices.Document;
import com.realdolmen.bestpractices.MyPrintJob;
import com.realdolmen.bestpractices.Person;
import com.realdolmen.bestpractices.Printer;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.verification.VerificationMode;

import javax.ejb.EJB;
import javax.inject.Inject;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonTest extends Assert {
    //private Printer printerMock = Mockito.mock(Printer.class); of @Mock
    @Mock
    private Printer printerMock;
    @Mock
    private Document documentMock;

    private Person person;

    @Before
    public void before() {
        person = new Person("jo", "boer");
    }

    //    Mockito.when(printerMock.startPrinting()).thenThrow(new IllegalStateException);
    @Test
    public void testPersonCanBePrinted() {
        Mockito.when(printerMock.startPrinting()).thenReturn(true);
        assertEquals(true, person.print(printerMock));
    }

    @Test
    public void testPersonCanNotBePrinted() {
        Mockito.when(printerMock.startPrinting()).thenReturn(false);
        assertEquals(false, person.print(printerMock));
    }

    @Test
    public void testPersonCallsStartPrintingOnce() {
        Mockito.when(printerMock.startPrinting()).thenReturn(true);
        person.print(printerMock);
        Mockito.verify(printerMock).startPrinting(); //same as next line, but with implicit verificationmode
        Mockito.verify(printerMock, Mockito.times(1)).startPrinting();
    }

    @Test
    public void testPersonCanPrintDocument() {
        //Mockito.when(printerMock.startPrinting()).thenReturn(true);
        //assertEquals(true, person.print(printerMock));
        Mockito.doNothing().when(documentMock).startPrinting();
        person.print(documentMock);
        Mockito.verify(documentMock).startPrinting();
    }
}
