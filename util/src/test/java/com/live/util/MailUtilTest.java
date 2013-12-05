package com.live.util;


import org.junit.Test;
import org.junit.runner.RunWith;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.live.util.mail.MailSenderInfo;
import com.live.util.mail.SimpleMailSender;

@RunWith(SpringJUnit4ClassRunner.class) 

@ContextConfiguration("classpath*:*.xml") 
public class MailUtilTest {

	@Autowired
	MailSenderInfo mailSenderInfo;
	
	@Autowired
	SimpleMailSender simpleMailSender;
	@Test
	public void testSendMail() {
		 //这个类主要是设置邮件          
	      mailSenderInfo.setMailServerHost("smtp.sina.com");      
	      mailSenderInfo.setMailServerPort("25");      
	      mailSenderInfo.setValidate(true);      
	      mailSenderInfo.setUserName("yigongquan4mail@sina.com");      
	      mailSenderInfo.setPassword("yigongquan4mail");//您的邮箱密码      
	      mailSenderInfo.setFromAddress("524510356@qq.com");      
	      mailSenderInfo.setToAddress("yigongquan4mail@sina.com");      
	      mailSenderInfo.setSubject("设置邮箱标题 如http://www.guihua.org 中国桂花网");      
	      mailSenderInfo.setContent("设置邮箱内容 如http://www.guihua.org 中国桂花网 是中国最大桂花网站==");      
	         //这个类主要来发送邮件     
    
	      simpleMailSender.sendTextMail(mailSenderInfo);//发送文体格式      
	      simpleMailSender.sendHtmlMail(mailSenderInfo);//发送html格式   
	}


}
