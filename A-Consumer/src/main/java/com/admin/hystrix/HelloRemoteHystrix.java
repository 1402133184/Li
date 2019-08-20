package com.admin.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.admin.feign.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello(@RequestParam(value="name") String name) {
		return "hello " + name +" ,this message send faild";
	}

}
