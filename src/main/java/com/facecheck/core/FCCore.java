package com.facecheck.core;

import com.facecheck.core.entity.Image;
import com.facecheck.core.entity.Post;
import com.facecheck.core.entity.User;
import com.facecheck.core.service.FCDeferential;
import com.facecheck.core.service.FCRater;
import com.facecheck.parser.FCParser;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FCCore {
    private FCParser parser = FCParser.getInstance();
    private FCDeferential deferential = FCDeferential.getInstance();
    private FCRater rater = FCRater.getInstance();
    private List<User> users;
    public FCCore() {
        users = new ArrayList<User>();
        User user = new User();
        User user2 = new User();
        user2.setId("1");
        user2.setFirstName("sdfff");
        user2.setLastName("dvdvgf");

        user.setId("1");
        user.setFirstName("asfd");
        user.setLastName("dsfsd");
        user.getFriends().add(user2);
        user.getPosts().add(new Post(124,"asdf"));
        user.getProfileImages().add(new Image());

        deferential.def(user,user2);
        System.out.println(rater.getTotalRate(user));

    }

    public boolean checkUser(User user){
        return false;
    }
    public void updateAll(){
        for(User user : users){
            deferential.def(user,parser.parseUser(user.getUrl()));
        }
    }

    public List<Boolean> checkAllUsers(List<User> users){
        return new ArrayList<Boolean>();
    }
    public void start(){
        for(URL url: getAllURLs()){
            users.add(parser.parseUser(url));
        }
        checkAllUsers(users);
    }
    private List<URL> getAllURLs(){
        return new ArrayList<URL>();
    }
}
