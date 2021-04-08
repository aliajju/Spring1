package com.xworkz.spring.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Entity.FoodDeliveryEntity;
import com.xworkz.spring.Service.FoodDeliveryService;

public class FoodDeliveryTester {
	
	
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		 FoodDeliveryService service=container.getBean(FoodDeliveryService.class);
		 FoodDeliveryEntity entity=new FoodDeliveryEntity("Ali", 300, 5, 0);
		 service.validateAndSave(entity);
		
	}

}
