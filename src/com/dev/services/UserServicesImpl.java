package com.dev.services;

import com.dev.beans.User;
import com.dev.dao.JDBCImpl;
import com.dev.dao.UserDAO;

public class UserServicesImpl implements UserServices {

	private UserDAO db = new JDBCImpl();
	
	@Override
	public Boolean createProfile(User user) {
		return db.createProfile(user);
	}

	@Override
	public User searchUser(Integer userId) {
		return db.searchUser(userId);
	}

	@Override
	public Boolean updatePassword(Integer userId, String oldPassword, String newPassword) {
		return db.updatePassword(userId, oldPassword, newPassword);
	}

	@Override
	public Boolean deleteUser(Integer userId, String password) {
		return db.deleteUser(userId, password);
	}

	@Override
	public User login(Integer userId, String password) {
		return db.login(userId, password);
	}

}
