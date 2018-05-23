package com.facecheck.core;

import com.facecheck.core.entity.User;
import com.facecheck.parser.FCParser;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FCCore {
    private FCParser parser = new FCParser();
    private List<URL> urls;

    public FCCore() {
        urls = new ArrayList<URL>();
    }

    public boolean checkUser(User user){
        return false;
    }

    public List<Boolean> checkAllUsers(List<User> users){
        return new ArrayList<Boolean>();
    }
}
