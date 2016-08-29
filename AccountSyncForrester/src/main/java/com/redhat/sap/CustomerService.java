package com.redhat.sap;

import javax.jws.WebService;

@WebService(name = "CustomerService")
public interface CustomerService {
	public String creatCustomer(String xmlFile);
}