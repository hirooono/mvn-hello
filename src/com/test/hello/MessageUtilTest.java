package com.test.hello;

import static junit.framework.Assert.*;

import com.main.hello.MessageUtil;
public class MessageUtilTest {

	public void createMessageTest() {
	// setup
	MessageUtil messageUtil = new MessageUtil();
	// when
	String message = messageUtil.createMessage("Shoichi");

	// then
	assertEquals("Hello, Shoichi", message);
}
	}
