package com.minitwit.service.impl;

import java.util.List;

import com.minitwit.dao.FeedDao;
import com.minitwit.dao.impl.FeedDaoImpl;
import com.minitwit.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minitwit.dao.MessageDao;
import com.minitwit.dao.UserDao;
import com.minitwit.util.PasswordUtil;

import com.minitwit.model.Feed;

@Service
public class MiniTwitService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private MessageDao messageDao;

	@Autowired
	private FeedDao feedDao;
	
	public List<Message> getUserFullTimelineMessages(User user) {
		return messageDao.getUserFullTimelineMessages(user);
	}
	
	public List<Message> getUserTimelineMessages(User user) {
		return messageDao.getUserTimelineMessages(user);
	}
	
	public List<Message> getPublicTimelineMessages() {
		return messageDao.getPublicTimelineMessages();
	}

	public List<FeedMessage> getFeedMessages(User user){
		return feedDao.getFeedMesseges(user);
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
	
	public void followUser(User follower, User followee) {
		userDao.insertFollower(follower, followee);
	}
	
	public void unfollowUser(User follower, User followee) {
		userDao.deleteFollower(follower, followee);
	}
	
	public boolean isUserFollower(User follower, User followee) {
		return userDao.isUserFollower(follower, followee);
	}
	
	public void addMessage(Message message) {
		messageDao.insertMessage(message);
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

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
}
