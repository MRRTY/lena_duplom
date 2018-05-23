package com.facecheck.core.entity;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return time == comment.time &&
                Objects.equals(user, comment.user) &&
                Objects.equals(content, comment.content) &&
                Objects.equals(usersLike, comment.usersLike);
    }

    @Override
    public int hashCode() {

        return Objects.hash(time, user, content, usersLike);
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
