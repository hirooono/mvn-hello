package com.test.hello;

import static junit.framework.Assert.*;

import com.main.hello.MessageUtil;
public class MessageUtilTest {

	public void testcreateMessage() {
	// setup
	MessageUtil messageUtil = new MessageUtil();
	// when
	String message = messageUtil.createMessage("Shoichi");

	// then
	assertEquals("hello, Shoichi", message);
}
	}
