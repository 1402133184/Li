package com.admin.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceive {

	@RabbitHandler
	@RabbitListener(queues="topic.message1")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("Receive1:"+str);
    }
	
}
