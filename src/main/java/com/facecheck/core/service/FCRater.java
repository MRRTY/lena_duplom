package com.facecheck.core.service;

import com.facecheck.core.entity.User;

public class FCRater {
    private static final FCRater rater = new FCRater();
    private final int INFO_MAX_RATE = 15;
    private final int PROFILE_PHOTO_MAX_RATE = 10;
    private final int PHOTO_MAX_RATE = 20;
    private final int POSTS_MAX_RATE = 20;
    private final int FRIENDS_MAX_RATE = 20;
    private final int ACTIVITY_MAX_RATE = 50;

    private FCRater() {
    }

    public static FCRater getInstance(){
        return rater;
    }

    public int getInfoRate(User user){
        return Math.min(INFO_MAX_RATE, user.getInformation().size());
    }

    public int getProfilePhotoRate(User user){
        return Math.min(PROFILE_PHOTO_MAX_RATE, user.getProfileImages().size());
    }

    public int getPhotoRate(User user){
        return Math.min(PHOTO_MAX_RATE, user.getPhotos().size());
    }

    public int getPostsRate(User user){
        return Math.min(POSTS_MAX_RATE, user.getPosts().size());
    }

    public int getFriendsRate(User user){
        return Math.min(FRIENDS_MAX_RATE, user.getFriends().size());
    }

    public int getActivitiesRate(User user){
     return 0;
    }
    public int getTotalRate(User user){
        return getActivitiesRate(user) + getFriendsRate(user) + getInfoRate(user) + getPhotoRate(user) + getPostsRate(user) + getProfilePhotoRate(user);
    }
}
