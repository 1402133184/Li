package com.app.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="hello-service")
public interface FeignConsumerService extends HelloService {

	@RequestMapping("/hello")
	public void hello();
	
}
