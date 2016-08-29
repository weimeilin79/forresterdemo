/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject ProcessInstance
 */
@XStreamAlias("ProcessInstance")
public class ProcessInstance extends AbstractSObjectBase {

    // ProcessDefinitionId
    private String ProcessDefinitionId;

    @JsonProperty("ProcessDefinitionId")
    public String getProcessDefinitionId() {
        return this.ProcessDefinitionId;
    }

    @JsonProperty("ProcessDefinitionId")
    public void setProcessDefinitionId(String ProcessDefinitionId) {
        this.ProcessDefinitionId = ProcessDefinitionId;
    }

    // TargetObjectId
    private String TargetObjectId;

    @JsonProperty("TargetObjectId")
    public String getTargetObjectId() {
        return this.TargetObjectId;
    }

    @JsonProperty("TargetObjectId")
    public void setTargetObjectId(String TargetObjectId) {
        this.TargetObjectId = TargetObjectId;
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

    // CompletedDate
    private org.joda.time.DateTime CompletedDate;

    @JsonProperty("CompletedDate")
    public org.joda.time.DateTime getCompletedDate() {
        return this.CompletedDate;
    }

    @JsonProperty("CompletedDate")
    public void setCompletedDate(org.joda.time.DateTime CompletedDate) {
        this.CompletedDate = CompletedDate;
    }

    // LastActorId
    private String LastActorId;

    @JsonProperty("LastActorId")
    public String getLastActorId() {
        return this.LastActorId;
    }

    @JsonProperty("LastActorId")
    public void setLastActorId(String LastActorId) {
        this.LastActorId = LastActorId;
    }

    // ElapsedTimeInDays
    private Double ElapsedTimeInDays;

    @JsonProperty("ElapsedTimeInDays")
    public Double getElapsedTimeInDays() {
        return this.ElapsedTimeInDays;
    }

    @JsonProperty("ElapsedTimeInDays")
    public void setElapsedTimeInDays(Double ElapsedTimeInDays) {
        this.ElapsedTimeInDays = ElapsedTimeInDays;
    }

    // ElapsedTimeInHours
    private Double ElapsedTimeInHours;

    @JsonProperty("ElapsedTimeInHours")
    public Double getElapsedTimeInHours() {
        return this.ElapsedTimeInHours;
    }

    @JsonProperty("ElapsedTimeInHours")
    public void setElapsedTimeInHours(Double ElapsedTimeInHours) {
        this.ElapsedTimeInHours = ElapsedTimeInHours;
    }

    // ElapsedTimeInMinutes
    private Double ElapsedTimeInMinutes;

    @JsonProperty("ElapsedTimeInMinutes")
    public Double getElapsedTimeInMinutes() {
        return this.ElapsedTimeInMinutes;
    }

    @JsonProperty("ElapsedTimeInMinutes")
    public void setElapsedTimeInMinutes(Double ElapsedTimeInMinutes) {
        this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
    }

    // SubmittedById
    private String SubmittedById;

    @JsonProperty("SubmittedById")
    public String getSubmittedById() {
        return this.SubmittedById;
    }

    @JsonProperty("SubmittedById")
    public void setSubmittedById(String SubmittedById) {
        this.SubmittedById = SubmittedById;
    }

}
