package com.service.inter.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.model.dao.UserDao;
import com.service.inter.LoginService;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	private UserDao userDao;
	public boolean checkLogin(User u) {
		// TODO Auto-generated method stub
		User realUser = userDao.getUserByName(u.getName());
		if(realUser != null
				&&u.getPwd().equals(realUser.getPwd())	){
			return true;
		}
		return false;
	}

}
