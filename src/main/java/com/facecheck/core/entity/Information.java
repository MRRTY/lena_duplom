package com.facecheck.core.entity;

public class Information {
    private int addTime;
    private int removeTime;
    private String key;
    private Object value;

    public Information(int addTime, int removeTime, String key, Object value) {
        this.addTime = addTime;
        this.removeTime = removeTime;
        this.key = key;
        this.value = value;
    }

    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    public int getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(int removeTime) {
        this.removeTime = removeTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
