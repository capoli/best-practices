package com.realdolmen.bestpractices;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class Printer {
    private Queue<MyPrintJob> jobs = new LinkedList<MyPrintJob>();
    public void addQueue(MyPrintJob job) {
        jobs.add(job);
    }

    public boolean startPrinting() {
        return false;
    }
}
