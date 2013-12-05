package com.live.util.PropertiesUtil;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

public class PropertiesUtilTest {

	@Test
	public void test4Load() {
		Properties prop = PropertiesUtil.getProperties("D:\\WorkSpace\\util\\target\\test-classes\\com\\live\\util\\PropertiesUtil\\register.properties");
		assertEquals(null, prop);
	}

}
