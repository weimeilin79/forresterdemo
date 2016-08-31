/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject SetupAuditTrail
 */
@XStreamAlias("SetupAuditTrail")
public class SetupAuditTrail extends AbstractSObjectBase {

    // Action
    private String Action;

    @JsonProperty("Action")
    public String getAction() {
        return this.Action;
    }

    @JsonProperty("Action")
    public void setAction(String Action) {
        this.Action = Action;
    }

    // Section
    private String Section;

    @JsonProperty("Section")
    public String getSection() {
        return this.Section;
    }

    @JsonProperty("Section")
    public void setSection(String Section) {
        this.Section = Section;
    }

    // Display
    private String Display;

    @JsonProperty("Display")
    public String getDisplay() {
        return this.Display;
    }

    @JsonProperty("Display")
    public void setDisplay(String Display) {
        this.Display = Display;
    }

}
