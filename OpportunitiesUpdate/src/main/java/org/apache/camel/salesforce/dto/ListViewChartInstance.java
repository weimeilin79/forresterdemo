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
 * Salesforce DTO for SObject ListViewChartInstance
 */
@XStreamAlias("ListViewChartInstance")
public class ListViewChartInstance extends AbstractSObjectBase {

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // ListViewChartId
    private String ListViewChartId;

    @JsonProperty("ListViewChartId")
    public String getListViewChartId() {
        return this.ListViewChartId;
    }

    @JsonProperty("ListViewChartId")
    public void setListViewChartId(String ListViewChartId) {
        this.ListViewChartId = ListViewChartId;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
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

    // SourceEntity
    private String SourceEntity;

    @JsonProperty("SourceEntity")
    public String getSourceEntity() {
        return this.SourceEntity;
    }

    @JsonProperty("SourceEntity")
    public void setSourceEntity(String SourceEntity) {
        this.SourceEntity = SourceEntity;
    }

    // ListViewContextId
    private String ListViewContextId;

    @JsonProperty("ListViewContextId")
    public String getListViewContextId() {
        return this.ListViewContextId;
    }

    @JsonProperty("ListViewContextId")
    public void setListViewContextId(String ListViewContextId) {
        this.ListViewContextId = ListViewContextId;
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

    // IsLastViewed
    private Boolean IsLastViewed;

    @JsonProperty("IsLastViewed")
    public Boolean getIsLastViewed() {
        return this.IsLastViewed;
    }

    @JsonProperty("IsLastViewed")
    public void setIsLastViewed(Boolean IsLastViewed) {
        this.IsLastViewed = IsLastViewed;
    }

    // DataQuery
    private String DataQuery;

    @JsonProperty("DataQuery")
    public String getDataQuery() {
        return this.DataQuery;
    }

    @JsonProperty("DataQuery")
    public void setDataQuery(String DataQuery) {
        this.DataQuery = DataQuery;
    }

    // IsEditable
    private Boolean IsEditable;

    @JsonProperty("IsEditable")
    public Boolean getIsEditable() {
        return this.IsEditable;
    }

    @JsonProperty("IsEditable")
    public void setIsEditable(Boolean IsEditable) {
        this.IsEditable = IsEditable;
    }

    // IsDeletable
    private Boolean IsDeletable;

    @JsonProperty("IsDeletable")
    public Boolean getIsDeletable() {
        return this.IsDeletable;
    }

    @JsonProperty("IsDeletable")
    public void setIsDeletable(Boolean IsDeletable) {
        this.IsDeletable = IsDeletable;
    }

    // GroupingField
    private String GroupingField;

    @JsonProperty("GroupingField")
    public String getGroupingField() {
        return this.GroupingField;
    }

    @JsonProperty("GroupingField")
    public void setGroupingField(String GroupingField) {
        this.GroupingField = GroupingField;
    }

    // AggregateField
    private String AggregateField;

    @JsonProperty("AggregateField")
    public String getAggregateField() {
        return this.AggregateField;
    }

    @JsonProperty("AggregateField")
    public void setAggregateField(String AggregateField) {
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
