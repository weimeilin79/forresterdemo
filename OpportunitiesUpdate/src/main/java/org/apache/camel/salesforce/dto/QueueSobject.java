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
 * Salesforce DTO for SObject QueueSobject
 */
@XStreamAlias("QueueSobject")
public class QueueSobject extends AbstractSObjectBase {

    // QueueId
    private String QueueId;

    @JsonProperty("QueueId")
    public String getQueueId() {
        return this.QueueId;
    }

    @JsonProperty("QueueId")
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    // SobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

}
