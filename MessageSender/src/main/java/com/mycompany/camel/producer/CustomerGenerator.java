package com.mycompany.camel.producer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CustomerGenerator {
	Random rand = new Random();
	
	public Map<String, Object> randomCustomer(){
		int  idNum = rand.nextInt(1000) + 1;
		
		Map<String, Object> customer = new HashMap<String, Object>();
		RandomNameGenerator generator = new RandomNameGenerator();
		customer.put("id",idNum);
		customer.put("lastname",generator.next() );
		customer.put("firstname",generator.next() );
		
		return customer;
	}
	
	
}
