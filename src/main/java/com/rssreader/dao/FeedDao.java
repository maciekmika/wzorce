package com.rssreader.dao;

import com.rssreader.model.Feed;
import com.rssreader.model.FeedMessage;
import com.rssreader.model.User;

import java.io.IOException;
import java.util.List;

public interface FeedDao {
	List<FeedMessage> getFeedMesseges(User user, String name);

	List<FeedMessage> getFeedMessegesForMainPage(User user);

	List<Feed> getFeedList(User user);
	
	void insertNewFeed(User user, String name,String link) throws IOException;
}
