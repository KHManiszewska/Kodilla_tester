package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.homework.Task;

public class TaskApplication {
    public static void main(String[] args) {
        Task task = new Task("Do it", 2);
        System.out.println(task.getDuration());
    }
}
