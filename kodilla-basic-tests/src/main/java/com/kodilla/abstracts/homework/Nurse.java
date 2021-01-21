package com.kodilla.abstracts.homework;

public class Nurse extends Job{
    static public String jobResponsibilities = "injection, serve medicine, basic health tests";

    public Nurse(double salary, String responsibilities) {
        super(salary, responsibilities);

    }

    public String jobResponsibilities() {
        return jobResponsibilities;
    }
}
