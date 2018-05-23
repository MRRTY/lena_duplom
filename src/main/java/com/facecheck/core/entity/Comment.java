package com.facecheck.core.entity;

import java.util.List;

public class Comment {
    private int time;
    private User user;
    private String content;
    private List<User> usersLike;

    public Comment(int time, User user, String content) {
        this.time = time;
        this.user = user;
        this.content = content;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<User> getUsersLike() {
        return usersLike;
    }

    public void setUsersLike(List<User> usersLike) {
        this.usersLike = usersLike;
    }
}
