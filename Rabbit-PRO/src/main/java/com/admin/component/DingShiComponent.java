package com.admin.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DingShiComponent {

	private final static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=60000)
	private void getTime() {
		System.out.println("现在时间是："+sdf.format(new Date()));
	}
	
}
