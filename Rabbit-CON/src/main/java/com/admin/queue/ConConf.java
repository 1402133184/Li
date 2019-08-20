package com.admin.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConConf {

	@Bean
	public Queue queue() {
		return new Queue("topic.message");
	}
}
