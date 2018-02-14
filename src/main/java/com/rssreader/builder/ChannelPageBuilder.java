package com.rssreader.builder;

import com.rssreader.model.Feed;
import com.rssreader.model.FeedMessage;
import com.rssreader.model.User;

import java.util.List;
import java.util.Map;

public class ChannelPageBuilder implements BuilderBase {

    private Map<String, Object> map;
    private String title;
    private User user;
    private List< Feed > feedList;
    private List< FeedMessage > feedMessages;
    private String feedName;
    private Integer pageNr;
    private List<Integer> pages;
    private Integer pagesAmount;
    private String currentPage;
    private Integer textSize;

    public ChannelPageBuilder(Map<String, Object> map, String title, User user,
                              List< Feed > feedList, List< FeedMessage > feedMessages,
                              String feedName, Integer pageNr, List<Integer> pages,
                              Integer pagesAmount, String linkToCurrentPage, Integer textSize){
        this.map=map;
        this.title=title;
        this.user=user;
        this.feedList=feedList;
        this.feedMessages=feedMessages;
        this.feedName=feedName;
        this.pageNr=pageNr;
        this.pages=pages;
        this.pagesAmount=pagesAmount;
        this.currentPage=linkToCurrentPage;
        this.textSize=textSize;
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
        map.put("feedName", feedName);
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
    public void addLinkToCurrentPage() {
        map.put("currentPage", currentPage);
    }

    @Override
    public void addTextSize() {
        map.put("textSize", textSize);
    }

    @Override
    public Map<String, Object> getFinalMap() {
        return map;
    }
}
