package com.admin.queue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProConf {
	
	final static String message = "topic.message";
	final static String message1 = "topic.message1";

//	@Bean
//	public Queue queue() {
//		return new Queue("hello");
//	}
	
	@Bean
	public Queue queueMessage() {
		return new Queue(ProConf.message);
	}
	
	@Bean
	public Queue queueMessage1() {
		return new Queue(ProConf.message1);
	}
	
	@Bean
	TopicExchange exchange() {
		return new TopicExchange("exchange");
	}
	
	@Bean
	Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
	}
	
	@Bean
	Binding bindingExchangeMessage1(Queue queueMessage1, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage1).to(exchange).with("topic.#");
	}
	
}
