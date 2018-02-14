package com.rssreader.service.impl;

import java.util.List;

import com.rssreader.dao.FeedDao;
import com.rssreader.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rssreader.dao.UserDao;
import com.rssreader.util.PasswordUtil;

import com.rssreader.model.Feed;

@Service
public class MiniTwitService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private FeedDao feedDao;

	public List<FeedMessage> getFeedMessages(User user, String name){
		return feedDao.getFeedMesseges(user, name);
	}

	public List<FeedMessage> getFeedMessagesForMainPage(User user){
		return feedDao.getFeedMessegesForMainPage(user);
	}

	public List<Feed> getFeedList(User user){
		return feedDao.getFeedList(user);
	}

	public void addNewFeed(User user, String name, String link) {
		feedDao.insertNewFeed(user, name, link);
	}
	
	public User getUserbyUsername(String username) {
		return userDao.getUserbyUsername(username);
	}

	public LoginResult checkUser(User user) {
		LoginResult result = new LoginResult();
		User userFound = userDao.getUserbyUsername(user.getUsername());
		if(userFound == null) {
			result.setError("Invalid username");
		} else if(!PasswordUtil.verifyPassword(user.getPassword(), userFound.getPassword())) {
			result.setError("Invalid password");
		} else {
			result.setUser(userFound);
		}
		
		return result;
	}
	
	public void registerUser(User user) {
		user.setPassword(PasswordUtil.hashPassword(user.getPassword()));
		userDao.registerUser(user);
	}
	
}
