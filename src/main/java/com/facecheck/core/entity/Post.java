package com.facecheck.core.entity;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Post {
    private int time;
    private String content;
    private List<Image> images;
    private List<Comment> comments;
    private List<User> usersLike;
    private Location location;

    public Post(int time, String content) {
        this.time = time;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return time == post.time &&
                Objects.equals(content, post.content) &&
                Objects.equals(images, post.images) &&
                Objects.equals(comments, post.comments) &&
                Objects.equals(usersLike, post.usersLike) &&
                Objects.equals(location, post.location);
    }

    @Override
    public int hashCode() {

        return Objects.hash(time, content, images, comments, usersLike, location);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getUsersLike() {
        return usersLike;
    }

    public void setUsersLike(List<User> usersLike) {
        this.usersLike = usersLike;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
