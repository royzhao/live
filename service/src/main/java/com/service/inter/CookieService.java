package com.service.inter;

import javax.servlet.http.Cookie;

import com.model.User;

public interface CookieService {
	
	//加入一个cookie
	public void addCookie(User id,Cookie cookie);
	
	//除掉一个cookie
	public void removeCookie(Cookie cookie);

	//检验是否有cookie
	public boolean checkCookie(Cookie cookie);
}
