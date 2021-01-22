package com.kodilla.abstracts.homework;

public class Scientist extends Job{
    static public String jobResponsibilities = "iresearch, read, explore, write articles";

    public Scientist(double salary, String responsibilities) {
        super(salary, responsibilities);

    }

    public String jobResponsibilities() {
        return jobResponsibilities;
    }
}