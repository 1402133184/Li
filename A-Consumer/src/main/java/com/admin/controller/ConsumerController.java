package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.feign.HelloRemote;

@RestController
public class ConsumerController {

	@Autowired
	HelloRemote hr;
	
	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return hr.hello(name);
	}
	
}
