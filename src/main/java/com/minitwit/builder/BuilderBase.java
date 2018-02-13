package com.minitwit.builder;

import com.minitwit.model.Feed;
import com.minitwit.model.FeedMessage;
import com.minitwit.model.User;

import java.util.List;
import java.util.Map;

public interface BuilderBase {
    public void addPageTitle();
    public void addUser();
    public void addFeedList();
    public void addFeedMessages();
    public void addFeedName();
    public void addPageNr();
    public void addPagesList();
    public void addPagesAmount();
    public void addLinkToCurrentPage();
    public void addTextSize();

    public Map<String, Object> getFinalMap();
}
