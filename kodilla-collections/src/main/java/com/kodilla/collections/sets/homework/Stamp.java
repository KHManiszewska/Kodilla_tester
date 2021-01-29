package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWith;
    private double stampHigh;
    private boolean isStampedStamp;

    public Stamp(String stampName, double stampWith, double stampHigh, boolean isStampedStamp) {
        this.stampName = stampName;
        this.stampWith = stampWith;
        this.stampHigh = stampHigh;
        this.isStampedStamp = isStampedStamp;
    }

    public boolean isStampedStamp() {
        return isStampedStamp;
    }

    public double getStampHigh() {
        return stampHigh;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWith() {
        return stampWith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWith, stampWith) == 0 && Double.compare(stamp.stampHigh, stampHigh) == 0 && isStampedStamp == stamp.isStampedStamp && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWith, stampHigh, isStampedStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWith=" + stampWith +
                ", stampHigh=" + stampHigh +
                ", isStampedStamp=" + isStampedStamp +
                '}';
    }
}
