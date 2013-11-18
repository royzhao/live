package com.service.inter.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.model.dao.UserDao;
import com.service.inter.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	public boolean changeUserName(int userId, String newName) {
		User u =userDao.getUserById(userId);
		u.setName(newName);
		userDao.updateUser(u);
		return true;
	}

	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}
