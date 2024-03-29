package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cloud.filter.PreFilter;

/**
 * @EnableZuulProxy 开启Zuul 的API网关服务功能
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApp {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApp.class, args);
	}
	
	@Bean
	public PreFilter tokenFilter() {
		return new PreFilter();
	}

}
