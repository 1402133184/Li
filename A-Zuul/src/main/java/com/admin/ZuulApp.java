package com.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.admin.filter.Prefilter;

/**
 * @EnableZuulProxy 开启Zuul 的API网关服务功能
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);
	}
	
	@Bean
	public Prefilter tokenFilter() {
		return new Prefilter();
	}
	
}
