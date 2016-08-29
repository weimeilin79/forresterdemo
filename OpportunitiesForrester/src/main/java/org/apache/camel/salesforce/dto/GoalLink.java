/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject GoalLink
 */
@XStreamAlias("GoalLink")
public class GoalLink extends AbstractSObjectBase {

    // ParentGoalId
    private String ParentGoalId;

    @JsonProperty("ParentGoalId")
    public String getParentGoalId() {
        return this.ParentGoalId;
    }

    @JsonProperty("ParentGoalId")
    public void setParentGoalId(String ParentGoalId) {
        this.ParentGoalId = ParentGoalId;
    }

    // SubgoalId
    private String SubgoalId;

    @JsonProperty("SubgoalId")
    public String getSubgoalId() {
        return this.SubgoalId;
    }

    @JsonProperty("SubgoalId")
    public void setSubgoalId(String SubgoalId) {
        this.SubgoalId = SubgoalId;
    }

}
