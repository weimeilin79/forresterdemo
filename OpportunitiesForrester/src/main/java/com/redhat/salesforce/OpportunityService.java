package com.redhat.salesforce;

import java.util.HashMap;

import org.apache.camel.salesforce.dto.Opportunity;

public class OpportunityService {
	
	private HashMap<String, Object> cachedOpps = new HashMap<String, Object>();
	
	
	public void clear(){
		cachedOpps.clear();
	}
	
	public void put(String key, Object value){
		cachedOpps.put(key, value);
	}
	
	public HashMap<String, Object> getOpp(){
		return cachedOpps;
	}
	
	public Opportunity updateStatus(Opportunity opp, String stagestatus){
		
		
		Opportunity newOpp = new Opportunity();
		newOpp.setAccountId(opp.getAccountId());
		newOpp.setAmount(opp.getAmount());
		newOpp.setId(opp.getId());
		
		if(opp != null && "CLOSEWON".equalsIgnoreCase(stagestatus)){
			newOpp.setStageName(opp.getStageName().CLOSED_WON);
		}else if(opp != null && "PROSPECTING".equalsIgnoreCase(stagestatus)){
			newOpp.setStageName(opp.getStageName().PROSPECTING);
		}else {
			newOpp.setStageName(opp.getStageName().NEEDS_ANALYSIS);
		}
		
		
		
		return newOpp;
	}

}
