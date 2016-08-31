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
 * Salesforce DTO for SObject ApexTestQueueItem
 */
@XStreamAlias("ApexTestQueueItem")
public class ApexTestQueueItem extends AbstractSObjectBase {

    // ApexClassId
    private String ApexClassId;

    @JsonProperty("ApexClassId")
    public String getApexClassId() {
        return this.ApexClassId;
    }

    @JsonProperty("ApexClassId")
    public void setApexClassId(String ApexClassId) {
        this.ApexClassId = ApexClassId;
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

    // ExtendedStatus
    private String ExtendedStatus;

    @JsonProperty("ExtendedStatus")
    public String getExtendedStatus() {
        return this.ExtendedStatus;
    }

    @JsonProperty("ExtendedStatus")
    public void setExtendedStatus(String ExtendedStatus) {
        this.ExtendedStatus = ExtendedStatus;
    }

    // ParentJobId
    private String ParentJobId;

    @JsonProperty("ParentJobId")
    public String getParentJobId() {
        return this.ParentJobId;
    }

    @JsonProperty("ParentJobId")
    public void setParentJobId(String ParentJobId) {
        this.ParentJobId = ParentJobId;
    }

}
