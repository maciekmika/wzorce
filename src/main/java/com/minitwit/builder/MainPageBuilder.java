package com.minitwit.builder;

import com.minitwit.model.Feed;
import com.minitwit.model.FeedMessage;
import com.minitwit.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPageBuilder implements BuilderBase {

    private Map<String, Object> map;
    private String title;
    private User user;
    private List< Feed > feedList;
    private List< FeedMessage > feedMessages;
    private Integer pageNr;
    private List<Integer> pages;
    private Integer pagesAmount;

    public MainPageBuilder(Map<String, Object> map, String title, User user,
                    List< Feed > feedList, List< FeedMessage > feedMessages,
                    Integer pageNr, List<Integer> pages, Integer pagesAmount){
        this.map=map;
        this.title=title;
        this.user=user;
        this.feedList=feedList;
        this.feedMessages=feedMessages;
        this.pageNr=pageNr;
        this.pages=pages;
        this.pagesAmount=pagesAmount;

    }

    @Override
    public void addPageTitle() {
        map.put("pageTitle", title);
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
        map.put("feedMessages", feedMessages);
    }

    @Override
    public void addFeedName() {

    }

    @Override
    public void addPageNr() {
        map.put("pageNumber", pageNr);
    }

    @Override
    public void addPagesList() {
        map.put("pages", pages);
    }

    @Override
    public void addPagesAmount() {
        map.put("pagesAmount", pagesAmount);
    }

    @Override
    public Map<String, Object> getFinalMap() {
        return map;
    }
}
