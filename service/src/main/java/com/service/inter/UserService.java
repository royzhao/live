package com.service.inter;

import com.model.user.User;

public interface UserService {

	//更改用户名
	public boolean changeUserName(int userId,String newName);
	
	//得到用户对象通过名字
	public User getUserByName(String name);
	
	//得到用户对象通过id
	public User getUserById(int id);
	
	//增加新用户
	public void addNewUser(User u);
}
