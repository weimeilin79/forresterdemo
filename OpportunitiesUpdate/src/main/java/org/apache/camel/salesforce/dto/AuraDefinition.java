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
 * Salesforce DTO for SObject AuraDefinition
 */
@XStreamAlias("AuraDefinition")
public class AuraDefinition extends AbstractSObjectBase {

    // AuraDefinitionBundleId
    private String AuraDefinitionBundleId;

    @JsonProperty("AuraDefinitionBundleId")
    public String getAuraDefinitionBundleId() {
        return this.AuraDefinitionBundleId;
    }

    @JsonProperty("AuraDefinitionBundleId")
    public void setAuraDefinitionBundleId(String AuraDefinitionBundleId) {
        this.AuraDefinitionBundleId = AuraDefinitionBundleId;
    }

    // DefType
    @XStreamConverter(PicklistEnumConverter.class)
    private DefTypeEnum DefType;

    @JsonProperty("DefType")
    public DefTypeEnum getDefType() {
        return this.DefType;
    }

    @JsonProperty("DefType")
    public void setDefType(DefTypeEnum DefType) {
        this.DefType = DefType;
    }

    // Format
    @XStreamConverter(PicklistEnumConverter.class)
    private FormatEnum Format;

    @JsonProperty("Format")
    public FormatEnum getFormat() {
        return this.Format;
    }

    @JsonProperty("Format")
    public void setFormat(FormatEnum Format) {
        this.Format = Format;
    }

    // Source
    private String Source;

    @JsonProperty("Source")
    public String getSource() {
        return this.Source;
    }

    @JsonProperty("Source")
    public void setSource(String Source) {
        this.Source = Source;
    }

}
