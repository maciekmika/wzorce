package com.minitwit.builder;

import com.minitwit.model.User;

import java.util.Map;

public class PublicPageBuilder implements  BuilderBase {

    private Map<String, Object> map;
    private String pageTitle;
    private User user;

    public PublicPageBuilder(Map<String, Object> map, String title, User user){
        this.map=map;
        this.pageTitle=title;
        this.user=user;
    }

    @Override
    public void addPageTitle() {
        map.put("pageTitle", pageTitle);
    }

    @Override
    public void addUser() {
        map.put("user", user);
    }

    @Override
    public void addFeedList() {

    }

    @Override
    public void addFeedMessages() {

    }

    @Override
    public void addFeedName() {

    }

    @Override
    public void addPageNr() {

    }

    @Override
    public void addPagesList() {

    }

    @Override
    public void addPagesAmount() {

    }

    @Override
    public Map<String, Object> getFinalMap() {
        return this.map;
    }
}
