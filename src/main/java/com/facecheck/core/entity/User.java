package com.facecheck.core.entity;

import java.awt.*;
import java.net.URL;
import java.util.List;

public class User {
    private URL url;
    private String firstName;
    private String lastName;
    private int bDay;
    private List<Post> posts;
    private List<Activity> activities;
    private List<Information> information;
    private List<User> friends;
    private List<Image> profileImages;
    private List<Image> photoes;


    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getbDay() {
        return bDay;
    }

    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Information> getInformation() {
        return information;
    }

    public void setInformation(List<Information> information) {
        this.information = information;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<Image> getProfileImages() {
        return profileImages;
    }

    public void setProfileImages(List<Image> profileImages) {
        this.profileImages = profileImages;
    }

    public List<Image> getPhotoes() {
        return photoes;
    }

    public void setPhotoes(List<Image> photoes) {
        this.photoes = photoes;
    }
}
