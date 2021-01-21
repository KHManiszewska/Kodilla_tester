package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job nurse = new Job (2300,"injection, serve medicine, basic health tests");
        Job teacher = new Job (2400, "learn, test knowledge, cooperate with parents");
        Job scientist = new Job (2500, "research, read, explore, write articles");

        Person AlaS = new Person("Ala", 42, nurse);
        Person GienekW = new Person("Gienek", 34, scientist);
        Person KasiaM = new Person("Kasia", 44, teacher);
        System.out.println(AlaS.firstName + " - job description: " + AlaS.job.jobResponsibilities());
        System.out.println(GienekW.firstName + " - job description: " + GienekW.job.jobResponsibilities());
        System.out.println(KasiaM.firstName + " - job description: " + KasiaM.job.jobResponsibilities());
    }
}
