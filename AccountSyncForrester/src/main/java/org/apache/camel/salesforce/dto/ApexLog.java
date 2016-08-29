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
 * Salesforce DTO for SObject ApexLog
 */
@XStreamAlias("ApexLog")
public class ApexLog extends AbstractSObjectBase {

    // LogUserId
    private String LogUserId;

    @JsonProperty("LogUserId")
    public String getLogUserId() {
        return this.LogUserId;
    }

    @JsonProperty("LogUserId")
    public void setLogUserId(String LogUserId) {
        this.LogUserId = LogUserId;
    }

    // LogLength
    private Integer LogLength;

    @JsonProperty("LogLength")
    public Integer getLogLength() {
        return this.LogLength;
    }

    @JsonProperty("LogLength")
    public void setLogLength(Integer LogLength) {
        this.LogLength = LogLength;
    }

    // Request
    private String Request;

    @JsonProperty("Request")
    public String getRequest() {
        return this.Request;
    }

    @JsonProperty("Request")
    public void setRequest(String Request) {
        this.Request = Request;
    }

    // Operation
    private String Operation;

    @JsonProperty("Operation")
    public String getOperation() {
        return this.Operation;
    }

    @JsonProperty("Operation")
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    // Application
    private String Application;

    @JsonProperty("Application")
    public String getApplication() {
        return this.Application;
    }

    @JsonProperty("Application")
    public void setApplication(String Application) {
        this.Application = Application;
    }

    // Status
    private String Status;

    @JsonProperty("Status")
    public String getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(String Status) {
        this.Status = Status;
    }

    // DurationMilliseconds
    private Integer DurationMilliseconds;

    @JsonProperty("DurationMilliseconds")
    public Integer getDurationMilliseconds() {
        return this.DurationMilliseconds;
    }

    @JsonProperty("DurationMilliseconds")
    public void setDurationMilliseconds(Integer DurationMilliseconds) {
        this.DurationMilliseconds = DurationMilliseconds;
    }

    // StartTime
    private org.joda.time.DateTime StartTime;

    @JsonProperty("StartTime")
    public org.joda.time.DateTime getStartTime() {
        return this.StartTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(org.joda.time.DateTime StartTime) {
        this.StartTime = StartTime;
    }

    // Location
    @XStreamConverter(PicklistEnumConverter.class)
    private LocationEnum Location;

    @JsonProperty("Location")
    public LocationEnum getLocation() {
        return this.Location;
    }

    @JsonProperty("Location")
    public void setLocation(LocationEnum Location) {
        this.Location = Location;
    }

}
