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
 * Salesforce DTO for SObject Goal
 */
@XStreamAlias("Goal")
public class Goal extends AbstractSObjectBase {

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // ImageUrl
    private String ImageUrl;

    @JsonProperty("ImageUrl")
    public String getImageUrl() {
        return this.ImageUrl;
    }

    @JsonProperty("ImageUrl")
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    // DueDate
    private org.joda.time.DateTime DueDate;

    @JsonProperty("DueDate")
    public org.joda.time.DateTime getDueDate() {
        return this.DueDate;
    }

    @JsonProperty("DueDate")
    public void setDueDate(org.joda.time.DateTime DueDate) {
        this.DueDate = DueDate;
    }

    // CompletionDate
    private org.joda.time.DateTime CompletionDate;

    @JsonProperty("CompletionDate")
    public org.joda.time.DateTime getCompletionDate() {
        return this.CompletionDate;
    }

    @JsonProperty("CompletionDate")
    public void setCompletionDate(org.joda.time.DateTime CompletionDate) {
        this.CompletionDate = CompletionDate;
    }

    // StartDate
    private org.joda.time.DateTime StartDate;

    @JsonProperty("StartDate")
    public org.joda.time.DateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(org.joda.time.DateTime StartDate) {
        this.StartDate = StartDate;
    }

    // IsKeyCompanyGoal
    private Boolean IsKeyCompanyGoal;

    @JsonProperty("IsKeyCompanyGoal")
    public Boolean getIsKeyCompanyGoal() {
        return this.IsKeyCompanyGoal;
    }

    @JsonProperty("IsKeyCompanyGoal")
    public void setIsKeyCompanyGoal(Boolean IsKeyCompanyGoal) {
        this.IsKeyCompanyGoal = IsKeyCompanyGoal;
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

    // Progress
    private Double Progress;

    @JsonProperty("Progress")
    public Double getProgress() {
        return this.Progress;
    }

    @JsonProperty("Progress")
    public void setProgress(Double Progress) {
        this.Progress = Progress;
    }

}
