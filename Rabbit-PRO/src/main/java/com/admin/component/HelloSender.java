package com.admin.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
	
	@Autowired
	private AmqpTemplate temp;
	
//	public void send() {
//		temp.convertAndSend("tpoic.message", "hello ~ RabbitMQ ");
//	}
	
	public void send() {
		String content = "hi, i am message all";
		System.out.println("Sender: " + content);
		temp.convertAndSend("exchange", "topic.1", content);
	}
	
	public void send1() {
		String content = "hi, i am message 1";
		System.out.println("Sender: " + content);
		temp.convertAndSend("exchange", "topic.message", content);
	}
	
	public void send2() {
		String content = "hi, i am message 2";
		System.out.println("Sender: " + content);
		temp.convertAndSend("exchange", "topic.message1", content);
	}
}
