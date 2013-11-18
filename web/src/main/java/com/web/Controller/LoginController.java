package com.web.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.util.WebUtils;

import com.model.User;
import com.service.inter.CookieService;
import com.service.inter.LoginService;
import com.service.inter.UserService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private UserService userService;
	
	@Autowired
	private CookieService cookieService;
	
	//负责index的请求
	@RequestMapping(value="/index.html")
	public String loginPage(){
		return "login";
	}
	
	//负责退出登陆请求
	@RequestMapping(value="/logout.html")
	public ModelAndView setLogout(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/main.html")
	public ModelAndView loginedCheck(HttpServletRequest request){
		boolean u=false ;//= (User)request.getSession().getAttribute("user");
		Cookie[] cookies = request.getCookies();
		for(Cookie c:cookies){
			if(c.getName().equals("loginToken")){
				u = cookieService.checkCookie(c);
			}
		}
		if(u == false){
			return new ModelAndView("login","error","请先登录");
		}else
			return new ModelAndView("main");
	}
	
	@RequestMapping(value="/relogin.html")
	public ModelAndView relogin(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView("p_login");
		return mv;
		
	}
	
	@RequestMapping(value="/user.html")
	public ModelAndView returnUser(HttpServletRequest request, HttpServletResponse response){
		
		ModelAndView mv = new ModelAndView();
		User u = new User();
		u.setId(0);
		u.setName("zpl");
		u.setState("1");
		mv.addObject("user", u);
		return mv;
	}
	//负责loginCheck的请求
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request, HttpServletResponse response){
		String name= WebUtils.findParameterValue(request, "userName");
		String pwd = WebUtils.findParameterValue(request, "password");
		
		User u = new User();
		u.setName(name);
		u.setPwd(pwd);
		boolean isVaildUser = 
				loginService.checkLogin(u);
		if(!isVaildUser){
			return new ModelAndView("login","error","用户名或者密码错误");
		}else{
			u = userService.getUserByName(name);
			ModelAndView main = new ModelAndView("main");
			Cookie cookie_channel = new Cookie("loginToken",u.toString());
			cookieService.addCookie(u, cookie_channel);
			response.addCookie(cookie_channel);
			//request.getSession().setAttribute("user", u);
			return main;
		}
		
	}
}
