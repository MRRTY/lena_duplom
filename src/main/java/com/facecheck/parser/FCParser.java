package com.facecheck.parser;

import com.facecheck.core.entity.Activity;
import com.facecheck.core.entity.Information;
import com.facecheck.core.entity.Post;
import com.facecheck.core.entity.User;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class FCParser {
    public User parseUser(URL url) {
        User user = new User();
        user.setUrl(url);
        parseMainInfo(user);
        parseFriends(user);
        parseActivities(user);
        parsePosts(user);
        parsePhotoes(user);
        parseProfileImages(user);
        parseInformation(user);
        return user;
    }

    private void parseInformation(User user) {
        user.setInformation(new ArrayList<Information>());
    }

    private void parseProfileImages(User user) {
        user.setProfileImages(new ArrayList<Image>());
    }

    private void parsePhotoes(User user) {
        user.setPhotoes(new ArrayList<Image>());
    }

    private void parsePosts(User user) {
        user.setPosts(new ArrayList<Post>());
    }

    private void parseActivities(User user) {
        user.setActivities(new ArrayList<Activity>());
    }

    private void parseFriends(User user) {
        user.setFriends(new ArrayList<User>());
    }

    private void parseMainInfo(User user) {
        user.setFirstName("Name");
        user.setLastName("Surname");
        user.setbDay(0);
    }
}
