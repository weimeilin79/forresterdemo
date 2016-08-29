package com.redhat.salesforce;

import org.apache.camel.salesforce.dto.StageNameEnum;

public class Opportunity {

	private String url;
	private Double Amount;
	private String AccountId;
	private StageNameEnum StageName;
	private Boolean IsClosed;
	private Double Probability;
	private Boolean IsWon;
	private String Fiscal;
	private String Name;
	private String Id;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public StageNameEnum getStageName() {
		return StageName;
	}
	public void setStageName(StageNameEnum stageName) {
		StageName = stageName;
	}
	public Boolean getIsClosed() {
		return IsClosed;
	}
	public void setIsClosed(Boolean isClosed) {
		IsClosed = isClosed;
	}
	public Double getProbability() {
		return Probability;
	}
	public void setProbability(Double probability) {
		Probability = probability;
	}
	public Boolean getIsWon() {
		return IsWon;
	}
	public void setIsWon(Boolean isWon) {
		IsWon = isWon;
	}
	public String getFiscal() {
		return Fiscal;
	}
	public void setFiscal(String fiscal) {
		Fiscal = fiscal;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	
	
	
}
