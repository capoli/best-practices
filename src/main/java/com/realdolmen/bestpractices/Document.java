package com.realdolmen.bestpractices;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class Document implements MyPrintJob {
    public final String title, content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void print(Printer printer) {
        printer.addQueue(this);
    }
}
