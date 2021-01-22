package com.kodilla.abstracts.homework;

import javax.print.DocFlavor;

public abstract class Job {
    public double salary;
    public String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }


    public String jobResponsibilities() {
        return responsibilities;
    }
}
