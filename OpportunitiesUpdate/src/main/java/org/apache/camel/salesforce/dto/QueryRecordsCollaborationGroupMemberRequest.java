/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type CollaborationGroupMemberRequest
 */
public class QueryRecordsCollaborationGroupMemberRequest extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<CollaborationGroupMemberRequest> records;

    public List<CollaborationGroupMemberRequest> getRecords() {
        return records;
    }

    public void setRecords(List<CollaborationGroupMemberRequest> records) {
        this.records = records;
    }
}
