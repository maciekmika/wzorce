package com.rssreader.dao.impl;

import com.rssreader.dao.FeedDao;
import com.rssreader.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.*;

@Repository
public class FeedDaoImpl implements FeedDao {

    private NamedParameterJdbcTemplate template;


    @Autowired
    public FeedDaoImpl(DataSource ds) {
        template = new NamedParameterJdbcTemplate(ds);
    }
    /*
    pobieranie z bazy
     */
    @Override
    public List<FeedMessage> getFeedMesseges(User user, String name) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", user.getId());
        params.put("feedName", name);
        String sql = "select * from feed where feed.user_id = :id and feed.feedName = :feedName";
        List<Feed> list = template.query(sql, params, feedMapper);

        String link = null;
        if(list != null && !list.isEmpty()) {
            link = list.get(0).getLink();
        }

        RSSFeedParser rss = new RSSFeedParser(link);
        Feed feed = rss.readFeed();
        return feed.entries;
    }

    @Override
    public List<FeedMessage> getFeedMessegesForMainPage(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        List<FeedMessage> entries = new ArrayList<FeedMessage>();

        params.put("id", user.getId());
        String sql = "select * from feed where feed.user_id = :id";
        List<Feed> list = template.query(sql, params, feedMapper);

        String link = null;
        if(list != null && !list.isEmpty()) {
            for(int i=0; i<list.size();i++) {
                link = list.get(i).getLink();
                RSSFeedParser rss = new RSSFeedParser(link);
                Feed feed = rss.readFeed();
                entries.addAll(feed.entries);
            }
        }
        Collections.shuffle(entries);

        return entries;
    }

    @Override
    public List<Feed> getFeedList(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", user.getId());

        String sql = "select * from feed where user_id = :id";
        List<Feed> result = template.query(sql, params, feedMapper);

        return result;
    }

    @Override
    public void insertNewFeed(User user, String name, String link) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", user.getId());
        params.put("name", name);
        params.put("link", link);

        String sql = "insert into feed (user_id, feedName, link) values (:userId, :name, :link)";
        template.update(sql, params);
    }


    private RowMapper<Feed> feedMapper = (rs, rowNum) -> {
        Feed m = new Feed(
                rs.getString("feedName"),
                rs.getString("link"),
                null, null, null, null);

        return m;
    };
}
