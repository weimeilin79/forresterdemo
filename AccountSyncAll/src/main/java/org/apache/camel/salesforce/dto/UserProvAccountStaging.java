/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject UserProvAccountStaging
 */
@XStreamAlias("UserProvAccountStaging")
public class UserProvAccountStaging extends AbstractSObjectBase {

    // ConnectedAppId
    private String ConnectedAppId;

    @JsonProperty("ConnectedAppId")
    public String getConnectedAppId() {
        return this.ConnectedAppId;
    }

    @JsonProperty("ConnectedAppId")
    public void setConnectedAppId(String ConnectedAppId) {
        this.ConnectedAppId = ConnectedAppId;
    }

    // SalesforceUserId
    private String SalesforceUserId;

    @JsonProperty("SalesforceUserId")
    public String getSalesforceUserId() {
        return this.SalesforceUserId;
    }

    @JsonProperty("SalesforceUserId")
    public void setSalesforceUserId(String SalesforceUserId) {
        this.SalesforceUserId = SalesforceUserId;
    }

    // ExternalUserId
    private String ExternalUserId;

    @JsonProperty("ExternalUserId")
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    @JsonProperty("ExternalUserId")
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    // ExternalUsername
    private String ExternalUsername;

    @JsonProperty("ExternalUsername")
    public String getExternalUsername() {
        return this.ExternalUsername;
    }

    @JsonProperty("ExternalUsername")
    public void setExternalUsername(String ExternalUsername) {
        this.ExternalUsername = ExternalUsername;
    }

    // ExternalEmail
    private String ExternalEmail;

    @JsonProperty("ExternalEmail")
    public String getExternalEmail() {
        return this.ExternalEmail;
    }

    @JsonProperty("ExternalEmail")
    public void setExternalEmail(String ExternalEmail) {
        this.ExternalEmail = ExternalEmail;
    }

    // ExternalFirstName
    private String ExternalFirstName;

    @JsonProperty("ExternalFirstName")
    public String getExternalFirstName() {
        return this.ExternalFirstName;
    }

    @JsonProperty("ExternalFirstName")
    public void setExternalFirstName(String ExternalFirstName) {
        this.ExternalFirstName = ExternalFirstName;
    }

    // ExternalLastName
    private String ExternalLastName;

    @JsonProperty("ExternalLastName")
    public String getExternalLastName() {
        return this.ExternalLastName;
    }

    @JsonProperty("ExternalLastName")
    public void setExternalLastName(String ExternalLastName) {
        this.ExternalLastName = ExternalLastName;
    }

    // LinkState
    @XStreamConverter(PicklistEnumConverter.class)
    private LinkStateEnum LinkState;

    @JsonProperty("LinkState")
    public LinkStateEnum getLinkState() {
        return this.LinkState;
    }

    @JsonProperty("LinkState")
    public void setLinkState(LinkStateEnum LinkState) {
        this.LinkState = LinkState;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

}
