package com.realdolmen.bestpractices;

import java.awt.*;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class Person implements MyPrintJob {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
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
