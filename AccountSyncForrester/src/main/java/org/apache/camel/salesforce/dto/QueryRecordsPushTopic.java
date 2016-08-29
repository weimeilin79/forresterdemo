/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type PushTopic
 */
public class QueryRecordsPushTopic extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<PushTopic> records;

    public List<PushTopic> getRecords() {
        return records;
    }

    public void setRecords(List<PushTopic> records) {
        this.records = records;
    }
}
