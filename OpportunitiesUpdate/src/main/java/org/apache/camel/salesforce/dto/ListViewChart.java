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
 * Salesforce DTO for SObject ListViewChart
 */
@XStreamAlias("ListViewChart")
public class ListViewChart extends AbstractSObjectBase {

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

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageEnum Language;

    @JsonProperty("Language")
    public LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // ChartType
    @XStreamConverter(PicklistEnumConverter.class)
    private ChartTypeEnum ChartType;

    @JsonProperty("ChartType")
    public ChartTypeEnum getChartType() {
        return this.ChartType;
    }

    @JsonProperty("ChartType")
    public void setChartType(ChartTypeEnum ChartType) {
        this.ChartType = ChartType;
    }

    // GroupingField
    @XStreamConverter(PicklistEnumConverter.class)
    private GroupingFieldEnum GroupingField;

    @JsonProperty("GroupingField")
    public GroupingFieldEnum getGroupingField() {
        return this.GroupingField;
    }

    @JsonProperty("GroupingField")
    public void setGroupingField(GroupingFieldEnum GroupingField) {
        this.GroupingField = GroupingField;
    }

    // AggregateField
    @XStreamConverter(PicklistEnumConverter.class)
    private AggregateFieldEnum AggregateField;

    @JsonProperty("AggregateField")
    public AggregateFieldEnum getAggregateField() {
        return this.AggregateField;
    }

    @JsonProperty("AggregateField")
    public void setAggregateField(AggregateFieldEnum AggregateField) {
        this.AggregateField = AggregateField;
    }

    // AggregateType
    @XStreamConverter(PicklistEnumConverter.class)
    private AggregateTypeEnum AggregateType;

    @JsonProperty("AggregateType")
    public AggregateTypeEnum getAggregateType() {
        return this.AggregateType;
    }

    @JsonProperty("AggregateType")
    public void setAggregateType(AggregateTypeEnum AggregateType) {
        this.AggregateType = AggregateType;
    }

}
