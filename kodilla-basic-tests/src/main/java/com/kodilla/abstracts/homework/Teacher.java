package com.kodilla.abstracts.homework;

public class Teacher extends Job{
    static public String jobResponsibilities = "learn, test knowledge, cooperate with parents";

    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);

    }

    public String jobResponsibilities() {
        return jobResponsibilities;
    }
}

