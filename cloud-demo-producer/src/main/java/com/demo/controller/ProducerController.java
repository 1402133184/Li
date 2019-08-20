package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	Logger log = LoggerFactory.getLogger(ProducerController.class);
	
	@RequestMapping("/hello")
	public String hello() {
		log.info("********************************************");
		return "ProducerController success";
	}
	
}
