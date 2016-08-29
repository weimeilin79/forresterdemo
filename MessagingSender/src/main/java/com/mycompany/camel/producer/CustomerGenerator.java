package com.mycompany.camel.producer;

import java.util.HashMap;
import java.util.Map;

public class CustomerGenerator {

	
	public Map<String, Object> randomCustomer(){
		
		Map<String, Object> customer = new HashMap<String, Object>();
		RandomNameGenerator generator = new RandomNameGenerator();
		customer.put("id",3.0);
		customer.put("lastname",generator.next() );
		customer.put("firstname",generator.next() );
		
		return customer;
	}
	
	
}
