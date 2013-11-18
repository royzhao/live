package com.model;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config-dao.xml")
public class UserDaoTest extends TestCase{

	@Autowired
	private UserDao userDao;
	
	@Test
	public void getNumTest(){
		System.out.println(userDao.getUserNum());
	}
}
