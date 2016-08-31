package com.redhat.salesforce;

import java.util.HashMap;

import org.apache.camel.salesforce.dto.Opportunity;

public class OpportunityService {
	
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
	
	public HashMap<String, Object> createMaptoUpdate(Opportunity opp, String stagestatus){
		HashMap<String, Object> sqlmap= new HashMap<String, Object>();
		
		sqlmap.put("url", "/ODATA/"+opp.getAccountId());
		sqlmap.put("Amount", opp.getAmount());
		sqlmap.put("AccountId", opp.getAccountId());
		sqlmap.put("StageName", opp.getStageName().toString());
		sqlmap.put("IsClosed", opp.getIsClosed());
		sqlmap.put("Probability", opp.getProbability());
		sqlmap.put("IsWon", opp.getIsWon());
		sqlmap.put("Fiscal", opp.getFiscal());
		sqlmap.put("Name", opp.getName());
		sqlmap.put("Id", opp.getId());
		
		return sqlmap;
	}

}
