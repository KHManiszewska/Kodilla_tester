package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    String schoolName;
    private List<Integer> studentsNumbers = new ArrayList<>();

    public School(String schoolName, int... studentsNumbers) {
        this.schoolName = schoolName;
        for (int studentNumber : studentsNumbers)
            this.studentsNumbers.add(studentNumber);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getStudentsNumber() {    // [1]
        int sum = 0;            // [2]
        for (int studentsNumber : studentsNumbers) {  // [3]
            sum = sum + studentsNumber;
        }// [4]
        return sum;  // [5]
    }
    @Override
    public String toString() {
        return ": " + studentsNumbers.toString();
    }
}
