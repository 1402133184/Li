package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy 开启Zuul 的API网关服务功能
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class GateWayApp {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApp.class, args);
	}

}
