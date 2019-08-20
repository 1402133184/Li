package com.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name="spring-cloud-producer", fallback=ConsumerServiceImpl.class)
public interface ConsumerService {
	
	@RequestMapping("/hello")
	public String hello();
	
}
