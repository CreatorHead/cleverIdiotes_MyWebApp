package com.dev.dao;

import com.dev.beans.User;

public class JDBCImpl implements UserDAO {

	@Override
	public Boolean createProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePassword(Integer userId, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Integer userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(Integer userId, String password) {
		return null;
	}

}
