package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
        public static void main(String[] args) {
            List<LocalDate> taskRepos = TaskRepository.getTaskRepository()   // [1]
                    .stream()
                    .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                    .map(TaskManager::getTaskDeadline)
                    .collect(Collectors.toList());                        // [2]
            System.out.println(taskRepos);
        }
        public static LocalDate getTaskDeadline(Task task) {
            return task.getDeadline();
        }
    }

