package com.test.hello;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.hello.MessageUtil;

public class MessageUtilTest {
	@Test
	public void createMessageは引数で渡された名前の前にHelloを追加して返す() {
	// setup
	MessageUtil messageUtil = new MessageUtil();
	// when
	String message = messageUtil.createMessage("Shoichi");
	// then
	assertEquals("hello, Shoichi", message);
}
	}
