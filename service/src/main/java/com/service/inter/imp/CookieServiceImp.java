package com.service.inter.imp;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.springframework.stereotype.Service;

import com.model.User;
import com.service.inter.CookieService;

@Service
public class CookieServiceImp implements CookieService {

	private Map<String,User> cookieMap = new HashMap<String,User >();

	public void addCookie(User id, Cookie cookie) {
		// TODO Auto-generated method stub
		cookieMap.put(cookie.getValue(), id);
	}

	public void removeCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		cookieMap.remove(cookie.getValue());
	}

	public boolean checkCookie(Cookie cookie) {
		// TODO Auto-generated method stub
		if(cookieMap.get(cookie.getValue()) == null)
			return false;
		return true;
	}

}
