package com.redhat.sap;

import java.util.ArrayList;
import java.util.List;

public class SAPResult {
	
	private List<String> resultmsgs = new ArrayList<String>();
	
	
	public void clearResult(){
		
		resultmsgs = new ArrayList<String>();
	}
	public void add(String message){
	
		resultmsgs.add(message);
	}

	public List<String> getResult(){
		//StringBuffer resultMsginString = new StringBuffer();
		
		//resultMsginString.append("Following Accounts has been updated to SAP ->  \n");
		
		//for(String msg: resultmsgs ){
		//	resultMsginString .append(msg+"\n");
		//}
		
		//resultMsginString.append("");
		
		return resultmsgs;
	}
	
}
