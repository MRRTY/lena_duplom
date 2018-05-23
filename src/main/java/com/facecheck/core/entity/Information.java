package com.facecheck.core.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return addTime == that.addTime &&
                removeTime == that.removeTime &&
                Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(addTime, removeTime, key, value);
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
