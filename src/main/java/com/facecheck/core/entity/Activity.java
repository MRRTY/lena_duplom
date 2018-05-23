package com.facecheck.core.entity;

import java.util.Objects;

public class Activity {
    private int timeIn;
    private int timeOut;

    public Activity(int timeIn, int timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return timeIn == activity.timeIn &&
                timeOut == activity.timeOut;
    }

    @Override
    public int hashCode() {

        return Objects.hash(timeIn, timeOut);
    }
}
