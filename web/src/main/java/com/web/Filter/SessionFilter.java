package com.web.Filter;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.WebUtils;

import com.model.user.User;
import com.service.inter.CookieService;

public class SessionFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private CookieService cookieService;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
//		System.out.println("filter begin");
//		HttpServletRequest httpRequest = (HttpServletRequest)request;
//		HttpSession session = (HttpSession) httpRequest.getSession();
//		User u = (User) session.getAttribute("user");
//
//		
//		if(u == null){
//			String name= WebUtils.findParameterValue(httpRequest, "userName");
//			String apwd = WebUtils.findParameterValue(httpRequest, "password");
//			if(null == name ||null == apwd){
//				httpRequest.getRequestDispatcher("/p_login.jsp").forward(request, response);
//				//HttpServletResponse httpResponse = (HttpServletResponse)response;
//				//httpResponse.sendRedirect("http://localhost:8080/web/login.jsp");
//				System.out.println("必须登陆");
//			}
//			else{
//				chain.doFilter(request, response);
//			}
//		}
//		else{
			chain.doFilter(request, response);
		//}
		

    }  


}
