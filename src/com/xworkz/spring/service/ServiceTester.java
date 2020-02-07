package com.xworkz.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.service.entity.ValentineEntity;
import com.xworkz.spring.service.service.ValentineService;

public class ServiceTester {
	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
			ValentineService service= container.getBean(ValentineService.class);
			
			ValentineEntity valentine = new ValentineEntity();
			valentine.setName("abc");
			valentine.setStatus("cc");
			valentine.setGift("phone");
			valentine.setAmountpaid(10000);
			valentine.setVid(1);
			
			service.validateAndsave(valentine);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
