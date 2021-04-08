 package com.xworkz.spring.Service;

import com.xworkz.spring.Entity.FoodDeliveryEntity;
import com.xworkz.spring.Repository.FoodDeliveryRepositor;

public class FoodDeliveryServiceImpl implements FoodDeliveryService {
	
	private FoodDeliveryRepositor foodDeliveryRepositor;
	
	public FoodDeliveryServiceImpl(FoodDeliveryRepositor foodDeliveryRepositor) {
		// TODO Auto-generated constructor stub
		System.out.println("created FoodDeliveryServiceImpl" +this.getClass().getName());
		this.foodDeliveryRepositor=foodDeliveryRepositor;
		
	}

	@Override
	public boolean validateAndSave(FoodDeliveryEntity entity) {
		// TODO Auto-generated method stub
		if (entity != null) {
			System.out.println("entity is valid");
			this.foodDeliveryRepositor.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
	
		return false;
	}
	
	

}
