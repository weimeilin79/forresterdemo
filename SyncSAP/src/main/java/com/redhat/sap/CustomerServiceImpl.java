package com.redhat.sap;

import javax.jws.WebService;

@WebService(name = "CustomerService", 
				serviceName = "CustomerService",
				endpointInterface = "com.redhat.sap.CustomerService")

public class CustomerServiceImpl implements CustomerService{

	@Override
	public String creatCustomer(String xmlFile) {
		System.out.println(xmlFile);
		return ""; 
	}
	

	
}