package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTaskRepository() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Write Specyfication Task 1", LocalDate.of(2020, 11, 20), LocalDate.of(2021, 01, 20)));
        tasks.add(new Task("Write Specyfication Task 2", LocalDate.of(2020, 12, 10), LocalDate.of(2021, 02, 9)));
        tasks.add(new Task("Write Specyfication Task 3", LocalDate.of(2021, 01, 9), LocalDate.of(2021, 02, 11)));
        tasks.add(new Task("Write Specyfication Task 4", LocalDate.of(2021, 02, 9), LocalDate.of(2021, 03, 9)));
        tasks.add(new Task("Write Specyfication Task 5", LocalDate.of(2021, 02, 11), LocalDate.of(2021, 03, 10)));
        tasks.add(new Task("Write Specyfication Task 6", LocalDate.of(2021, 03, 20), LocalDate.of(2021, 04, 27)));
        return tasks;
    }
}

