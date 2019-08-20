package com.admin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.admin.ProApp;
import com.admin.component.HelloSender;

@SpringBootTest(classes=ProApp.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ProTest {

	@Autowired
	HelloSender hs;
	
	@Test
	public void test() {
		hs.send();
	}
	
	@Test
	public void test1() {
		hs.send1();
	}
	
	@Test
	public void test2() {
		hs.send2();
	}
	
}
