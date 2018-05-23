package com.facecheck.core.entity;

import java.util.List;
import java.util.Objects;

public class Image {
    private int timeAdd;
    private String path;
    private List<User> likes;
    private List<Comment> comments;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return timeAdd == image.timeAdd &&
                Objects.equals(path, image.path) &&
                Objects.equals(likes, image.likes) &&
                Objects.equals(comments, image.comments);
    }

    @Override
    public int hashCode() {

        return Objects.hash(timeAdd, path, likes, comments);
    }

    public int getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(int timeAdd) {
        this.timeAdd = timeAdd;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
