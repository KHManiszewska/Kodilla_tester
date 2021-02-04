package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected String title;
    protected int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
