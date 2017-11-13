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

    /*
    @Override
	public List<Message> getUserTimelineMessages(User user) {
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", user.getId());

		String sql = "select message.*, user.* from message, user where " +
				"user.user_id = message.author_id and user.user_id = :id " +
				"order by message.pub_date desc";
		List<Message> result = template.query(sql, params, messageMapper);

		return result;
	}
     */
    @Override
    public List<Feed> getFeedList(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", user.getId());

        String sql = "select * from feed where user_id = :id";
        List<Feed> result = template.query(sql, params, feedMapper);

        return result;
    }

    @Override
    public void insertNewFeed(String link) {

    }

    private RowMapper<Feed> feedMapper = (rs, rowNum) -> {
        Feed m = new Feed(
                rs.getString("feedName"),
                rs.getString("link"),
                null, null, null, null);

        return m;
    };
}
