package com.realdolmen.bestpractices;

import java.awt.*;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class Person implements MyPrintJob {
    public final String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(Printer printer) {
        printer.addQueue(this);
        return printer.startPrinting();
    }

    public void print(Document document) {
        document.startPrinting();
    }
}
