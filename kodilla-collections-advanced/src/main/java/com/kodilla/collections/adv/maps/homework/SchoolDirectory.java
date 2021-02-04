package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal mrJohn = new Principal("John", "Stevenson");
        Principal msJessie = new Principal("Jessie", "Pinkman");
        Principal msBart = new Principal("Bart", "Simpson");

        School elementaryBritish = new School("British Elementary", 16, 18, 15, 18, 17, 14, 13, 10);
        School elementaryFirstWarsaw = new School("Warszawska Jedynka", 34, 38, 35, 38, 42, 44, 43, 40);
        School highCanadian = new School("Canadian High School", 14, 12, 13, 16);

        school.put(mrJohn, elementaryBritish);
        school.put(msJessie, elementaryFirstWarsaw);
        school.put(msBart, highCanadian);

        System.out.println(school.get(msBart));
        System.out.println(msJessie);
        System.out.println(elementaryBritish);

        for (Map.Entry<Principal, School> principalSchoolEntry : school.entrySet())
            System.out.println("Dyrektor szkoły - " + principalSchoolEntry.getValue().getSchoolName() + " Ms/Mr " + principalSchoolEntry.getKey().getFirstname() +" "+principalSchoolEntry.getKey().getLastname()+ ", number of students: " +
                    principalSchoolEntry.getValue().getStudentsNumber());
    }
}
