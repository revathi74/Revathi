package com.business;

import java.util.ArrayList;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class CustomerSessionInfo {
	
	public CustomerSessionInfo () {
		System.out.println("creating CustomerSessionInfo ");
	}
	public boolean isCustomerLoggedin=false;
	public ArrayList<String> cart=new ArrayList<String> (); 

}
