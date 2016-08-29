/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject DashboardComponent
 */
@XStreamAlias("DashboardComponent")
public class DashboardComponent extends AbstractSObjectBase {

    // DashboardId
    private String DashboardId;

    @JsonProperty("DashboardId")
    public String getDashboardId() {
        return this.DashboardId;
    }

    @JsonProperty("DashboardId")
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

}
