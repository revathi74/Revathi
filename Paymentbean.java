package com.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dal.PaymentEntity;
import com.dal.Paymentrepo;



@Service
public class Paymentbean {
	private static final String String = null;

	@Autowired(required=true)
	public Paymentrepo pay;


	public String saveInfo(String Cardname,String Cardnumber,String Expmonth,String Expyear,String CVV) {

		try {
			
				PaymentEntity newReg = new PaymentEntity(Cardname, Cardnumber, Expmonth, Expyear,CVV);
				pay.save(newReg);
				System.out.println("entered register block in bean!");
				return "success";
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}
}