package com.facecheck.core.service;

import com.facecheck.core.entity.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

public class FCDeferential {
    private static final FCDeferential deferential = new FCDeferential();

    private FCDeferential() {
    }

    public static FCDeferential getInstance(){
        return deferential;
    }

    public void def(User user, User updatedUser){
        StringBuilder delta = new StringBuilder();
        try {
            PrintWriter pw  = new PrintWriter(new FileOutputStream(new File(user.getId()+".txt"),true));
            List<Activity> addedActivities = updatedUser.getActivities().stream().filter(e-> !user.getActivities().contains(e)).collect(Collectors.toList());
            List<Activity> removedActivities = user.getActivities().stream().filter(e-> !updatedUser.getActivities().contains(e)).collect(Collectors.toList());
            List<Information> addedInfo = updatedUser.getInformation().stream().filter(e-> !user.getInformation().contains(e)).collect(Collectors.toList());
            List<Information> removedInfo = user.getInformation().stream().filter(e-> !updatedUser.getInformation().contains(e)).collect(Collectors.toList());
            List<User> addedFriends = updatedUser.getFriends().stream().filter(e-> !user.getFriends().contains(e)).collect(Collectors.toList());
            List<User> removedFriends = user.getFriends().stream().filter(e-> !updatedUser.getFriends().contains(e)).collect(Collectors.toList());
            List<Image> addedPhotos = updatedUser.getPhotos().stream().filter(e-> !user.getPhotos().contains(e)).collect(Collectors.toList());
            List<Image> removedPhotos = user.getPhotos().stream().filter(e-> !updatedUser.getPhotos().contains(e)).collect(Collectors.toList());
            List<Image> addedProfilePhotos = updatedUser.getProfileImages().stream().filter(e-> !user.getProfileImages().contains(e)).collect(Collectors.toList());
            List<Image> removedProfilePhotos = user.getProfileImages().stream().filter(e-> !updatedUser.getProfileImages().contains(e)).collect(Collectors.toList());
            List<Post> addedPosts = updatedUser.getPosts().stream().filter(e-> !user.getPosts().contains(e)).collect(Collectors.toList());
            List<Post> removedPosts = user.getPosts().stream().filter(e-> !updatedUser.getPosts().contains(e)).collect(Collectors.toList());
            String changedFirstName = updatedUser.getFirstName().equals(user.getFirstName())? null : updatedUser.getFirstName();
            String changedLastName = updatedUser.getLastName().equals(user.getLastName())? null : updatedUser.getLastName();
            Integer changedBDay = updatedUser.getbDay() == user.getbDay() ? null : updatedUser.getbDay();

            if(!addedActivities.isEmpty()) {
                for (Activity activity : addedActivities) {
                    delta.append("[NEW] Activity " + activity.toString()+"\n");
                }
            }
            if(!removedActivities.isEmpty()){
                for (Activity activity : removedActivities){
                    delta.append("[REMOVE] Activity " + activity.toString()+"\n");
                }
            }
            if(!addedInfo.isEmpty()){
                for (Information info : addedInfo){
                    delta.append("[NEW] Information " + info.toString()+"\n");
                }
            }
            if(!removedInfo.isEmpty()){
                for (Information info : removedInfo){
                    delta.append("[REMOVE] Information" + info.toString()+"\n");
                }
            }
            if(!addedFriends.isEmpty()){
                for (User friend : addedFriends){
                    delta.append("[NEW] Friend " + friend.toString()+"\n");
                }
            }
            if(!removedFriends.isEmpty()){
                for (User friend : removedFriends){
                    delta.append("[REMOVE] Friend " + friend.toString()+"\n");
                }
            }
            if(!addedPhotos.isEmpty()){
                for (Image image : addedPhotos){
                    delta.append("[NEW] Photo " + image.toString()+"\n");
                }
            }
            if(!removedPhotos.isEmpty()){
                for (Image image : removedPhotos){
                    delta.append("[REMOVE] Photo " + image.toString()+"\n");
                }
            }
            if(!addedProfilePhotos.isEmpty()){
                for (Image image : addedProfilePhotos){
                    delta.append("[NEW] Profile Photo " + image.toString()+"\n");
                }
            }
            if(!removedProfilePhotos.isEmpty()){
                for (Image image : removedProfilePhotos){
                    delta.append("[REMOVE] Photo " + image.toString()+"\n");
                }
            }
            if(!addedPosts.isEmpty()){
                for (Post post : addedPosts){
                    delta.append("[NEW] Post " + post.toString()+"\n");
                }
            }
            if(!removedPosts.isEmpty()){
                for (Post post : removedPosts){
                    delta.append("[REMOVE] Post "+ removedPosts.toString() +"\n");
                }
            }
            if(changedBDay!=null){
                delta.append("[CHANGE] B-Day from "+user.getbDay()+" to "+ updatedUser.getbDay()+"\n");
            }
            if(changedFirstName!=null){
                delta.append("[CHANGE] First Name from "+user.getFirstName()+" to "+ updatedUser.getFirstName()+"\n");
            }
            if(changedLastName!=null){
                delta.append("[CHANGE] Last Name from "+ user.getLastName()+" to "+ updatedUser.getLastName()+"\n");
            }
            pw.append(delta);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
