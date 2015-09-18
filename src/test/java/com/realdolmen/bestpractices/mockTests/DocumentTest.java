package com.realdolmen.bestpractices.mockTests;

import com.realdolmen.bestpractices.Document;
import com.realdolmen.bestpractices.Person;
import com.realdolmen.bestpractices.Printer;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;

import javax.inject.Inject;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class DocumentTest extends Assert {
    //private Printer printerMock = Mockito.mock(Printer.class); of @Mock
    @Mock
    private Printer printerMock;
    
    @Mock
    private Document document;

    @Test
    public void testDocumentCanBePrintedAndReturnVoid() {
        Mockito.doReturn(true).when(printerMock).startPrinting();
        Mockito.doNothing().when(document).print(printerMock);
        document.print(printerMock);
    }
}

