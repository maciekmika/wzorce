package com.minitwit.dao.impl;

import com.minitwit.dao.FeedDao;
import com.minitwit.model.*;
import com.minitwit.util.GravatarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<FeedMessage> getFeedMesseges(User user) {
        RSSFeedParser rss = new RSSFeedParser("https://www.osw.waw.pl/pl/rss.xml");
        Feed feed = rss.readFeed();
        return feed.entries;
    }

    @Override
    public List<Feed> getFeedList(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", user.getId());

        String sql = "select * from feed where user_id = :id";
        List<Feed> result = template.query(sql, params, feedMapper);

        return result;
    }
    /*
    @Override
	public void insertMessage(Message m) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", m.getUserId());
        params.put("text", m.getText());
        params.put("pubDate", m.getPubDate());

        String sql = "insert into message (author_id, text, pub_date) values (:userId, :text, :pubDate)";
		template.update(sql, params);
	}
     */
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
