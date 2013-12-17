package com.web.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.constvalue.ShopState;
import com.constvalue.UserType;
import com.live.util.MD5.MD5Util;
import com.model.user.User;
import com.service.inter.LoginService;
import com.service.inter.UserService;

@Controller
public class RegisterController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private UserService userService;
	
	//负责注册的请求
	@RequestMapping(value="/register.html")
	public ModelAndView setLogout(HttpServletRequest request){
		String name= WebUtils.findParameterValue(request, "inputMail");
		String pwd = WebUtils.findParameterValue(request, "inputPassword1");
		String email = name;
		int type = UserType.CONSUMER_USER;
		User u = new User();
		u.setEmail(email);
		u.setName(name);
		u.setPwd(MD5Util.stringMD5(pwd));
		u.setType(type);
		u.setState(ShopState.LIVE);
		userService.addNewUser(u);
		return new ModelAndView("UserDetail");
	}
}
