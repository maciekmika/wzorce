package com.minitwit.dao.impl;

import com.minitwit.dao.FeedDao;
import com.minitwit.model.Feed;
import com.minitwit.model.FeedMessage;
import com.minitwit.model.RSSFeedParser;
import com.minitwit.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FeedDaoImpl implements FeedDao {
    @Override
    public List<FeedMessage> getFeedMesseges(User user) {
        RSSFeedParser rss = new RSSFeedParser("https://www.osw.waw.pl/pl/rss.xml");
        Feed feed = rss.readFeed();
        return feed.entries;
    }

    @Override
    public void insertNewFeed(String link) {

    }
}
