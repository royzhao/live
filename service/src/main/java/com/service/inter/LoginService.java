package com.service.inter;

import com.model.user.User;


public interface LoginService {
	
	//检查登陆
	public boolean checkLogin(User u);

}
