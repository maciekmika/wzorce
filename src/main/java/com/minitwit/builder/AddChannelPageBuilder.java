package com.minitwit.builder;

import com.minitwit.model.Feed;
import com.minitwit.model.User;

import java.util.List;
import java.util.Map;

public class AddChannelPageBuilder implements  BuilderBase {

    private Map<String, Object> map;
    private String pageTitle;
    private User user;
    private List<Feed> feedList;

    public AddChannelPageBuilder(Map<String, Object> map, String title, User user, List<Feed> feedList){
        this.map=map;
        this.pageTitle=title;
        this.user=user;
        this.feedList=feedList;
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
        map.put("feedList", feedList);
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
