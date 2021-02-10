package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private  int duration;

    public Task(String title, int duration) {
        this.duration = duration;
        this.title = title+" now!";
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
