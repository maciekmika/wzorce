package com.rssreader.dao;

import com.rssreader.model.User;

public interface UserDao {

	User getUserbyUsername(String username);
	
	void insertFollower(User follower, User followee);
	
	void deleteFollower(User follower, User followee);
	
	boolean isUserFollower(User follower, User followee);
	
	void registerUser(User user);
}
