package com.live.util;

import org.junit.Test;

import com.live.util.MD5.MD5Util;

import junit.framework.TestCase;

public class MD5UtilTest extends TestCase {
	
	@Test
	public void testStringMD5(){
		String source = "Hello world";
		String source2 = "Hello world!";
		String md5Code1 = MD5Util.stringMD5(source);
		String md5Code2 = MD5Util.stringMD5(source2);
		String md5null = MD5Util.stringMD5("");
		assertEquals(false, md5null == null);
		assertEquals(false, md5Code1.isEmpty());
		assertEquals(false, md5Code2.isEmpty());
		assertEquals(true, MD5Util.checkMD5(md5Code1, source));
		assertEquals(true, MD5Util.checkMD5(md5Code2, source2));
		assertEquals(false, MD5Util.checkMD5(md5Code2, source));
	}

}
