package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher black = new Teacher("Adam Black");
        Teacher white = new Teacher("Jo White");
        Student smith = new Student("Smith", black);
        Student kowalski = new Student("Kowalski", null);
        Student nowak = new Student("Nowak", white);
        Student wozniak = new Student("Wozniak", null);
        Student jobs = new Student("Jobs", black);
        students.add(smith);
        students.add(kowalski);
        students.add(nowak);
        students.add(wozniak);
        students.add(jobs);

        for (Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName =
                    optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: "+student.getName()+" nauczyciel: "+teacherName);
        }

    }
}
