package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.service.ConsumerService;

@RestController
public class ConsumerController {
	
	@Autowired
	ConsumerService service;
	
	@RequestMapping("hello-a")
	public String lalala() {
		return "hello-a -- " + service.hello();
	}
	
}
