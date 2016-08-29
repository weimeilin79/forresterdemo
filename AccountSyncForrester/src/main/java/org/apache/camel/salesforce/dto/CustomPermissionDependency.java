/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CustomPermissionDependency
 */
@XStreamAlias("CustomPermissionDependency")
public class CustomPermissionDependency extends AbstractSObjectBase {

    // CustomPermissionId
    private String CustomPermissionId;

    @JsonProperty("CustomPermissionId")
    public String getCustomPermissionId() {
        return this.CustomPermissionId;
    }

    @JsonProperty("CustomPermissionId")
    public void setCustomPermissionId(String CustomPermissionId) {
        this.CustomPermissionId = CustomPermissionId;
    }

    // RequiredCustomPermissionId
    private String RequiredCustomPermissionId;

    @JsonProperty("RequiredCustomPermissionId")
    public String getRequiredCustomPermissionId() {
        return this.RequiredCustomPermissionId;
    }

    @JsonProperty("RequiredCustomPermissionId")
    public void setRequiredCustomPermissionId(String RequiredCustomPermissionId) {
        this.RequiredCustomPermissionId = RequiredCustomPermissionId;
    }

}
