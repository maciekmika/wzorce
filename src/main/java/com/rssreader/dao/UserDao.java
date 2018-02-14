package com.rssreader.dao;

import com.rssreader.model.User;

public interface UserDao {

	User getUserbyUsername(String username);

	void registerUser(User user);
}
