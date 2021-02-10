package com.kodilla.collections.adv.immutable.homework;


public class TaskApps {
    public static void main(String[] args) {
        Task task = new Task("Do it", 1);
        System.out.println(task.getTitle());
        System.out.println(task.getDuration());
    }
}
