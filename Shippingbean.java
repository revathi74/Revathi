package com.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dal.Shipping;
import com.dal.ShippingEntity;

@Service
public class Shippingbean {
	private static final String String = null;

	@Autowired(required=true)
	public Shipping shipping;


	public String saveInfo(String Name,String Email,String Address,String City,String State,String Zip) {

		try {
			
				ShippingEntity newReg = new ShippingEntity(Name, Email, Address, City, State, Zip);
				System.out.println("entered register block in bean!");
				return "success";
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}
}