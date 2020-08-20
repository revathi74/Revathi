package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dal.registerRespository;
import com.dal.registerEntity;

@Service
public class LoginBean {
	private static final String String = null;
	
	@Autowired
	public registerRespository RR;

	public String val(String email, String password) {
		List<registerEntity> results = RR.findByEmailAndPassword(email, password);
		System.out.println(results);
		try {
			if (results.size() > 0) {
				System.out.println(email+ " " + password);
				return "success";
			} else
				return "error";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	public String validateRegister(String email, String password,  String username, String phonenumber) {
		List<registerEntity> results = RR.findByEmailAndPassword(email,password);

		try {
			if (results.size() == 0) {
				System.out.println("entering register block");
				registerEntity newReg = new registerEntity(email, password, username, phonenumber);
				RR.save(newReg);
				System.out.println("exiting register block in bean!");
				return "success";
			}
			else{
				
				return "error";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}


}
