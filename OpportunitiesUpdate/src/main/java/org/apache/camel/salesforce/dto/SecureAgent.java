/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject SecureAgent
 */
@XStreamAlias("SecureAgent")
public class SecureAgent extends AbstractSObjectBase {

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // AgentKey
    private String AgentKey;

    @JsonProperty("AgentKey")
    public String getAgentKey() {
        return this.AgentKey;
    }

    @JsonProperty("AgentKey")
    public void setAgentKey(String AgentKey) {
        this.AgentKey = AgentKey;
    }

    // ProxyUserId
    private String ProxyUserId;

    @JsonProperty("ProxyUserId")
    public String getProxyUserId() {
        return this.ProxyUserId;
    }

    @JsonProperty("ProxyUserId")
    public void setProxyUserId(String ProxyUserId) {
        this.ProxyUserId = ProxyUserId;
    }

}
