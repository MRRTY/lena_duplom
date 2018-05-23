package com.facecheck.core.entity;

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
}
