/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject MetricDataLink
 */
@XStreamAlias("MetricDataLink")
public class MetricDataLink extends AbstractSObjectBase {

    // TargetId
    private String TargetId;

    @JsonProperty("TargetId")
    public String getTargetId() {
        return this.TargetId;
    }

    @JsonProperty("TargetId")
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    // DataSourceId
    private String DataSourceId;

    @JsonProperty("DataSourceId")
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    @JsonProperty("DataSourceId")
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    // LastSynchronizationTime
    private org.joda.time.DateTime LastSynchronizationTime;

    @JsonProperty("LastSynchronizationTime")
    public org.joda.time.DateTime getLastSynchronizationTime() {
        return this.LastSynchronizationTime;
    }

    @JsonProperty("LastSynchronizationTime")
    public void setLastSynchronizationTime(org.joda.time.DateTime LastSynchronizationTime) {
        this.LastSynchronizationTime = LastSynchronizationTime;
    }

    // DatasourceFieldName
    private String DatasourceFieldName;

    @JsonProperty("DatasourceFieldName")
    public String getDatasourceFieldName() {
        return this.DatasourceFieldName;
    }

    @JsonProperty("DatasourceFieldName")
    public void setDatasourceFieldName(String DatasourceFieldName) {
        this.DatasourceFieldName = DatasourceFieldName;
    }

}
