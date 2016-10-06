package com.test.hello;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.hello.MessageUtil;

public class MessageUtilTest {
	@Test
	public void createMessageTest() {
	// setup
	MessageUtil messageUtil = new MessageUtil();
	// when
	String message = messageUtil.createMessage("Shoichi");
	// then
	assertEquals("hello, Shoichi", message);
}
	}
