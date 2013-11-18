package com.service.webservice.imp;

import javax.jws.WebService;

import com.service.webservice.UserWebServiceApi;
@WebService(endpointInterface="com.service.webservice.UserWebServiceApi")
public class UserWebServiceImp implements UserWebServiceApi {

	public String sayHello() {
			return "hello world";
	}
}
