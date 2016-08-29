/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject FiscalYearSettings
 */
@XStreamAlias("FiscalYearSettings")
public class FiscalYearSettings extends AbstractSObjectBase {

    // PeriodId
    private String PeriodId;

    @JsonProperty("PeriodId")
    public String getPeriodId() {
        return this.PeriodId;
    }

    @JsonProperty("PeriodId")
    public void setPeriodId(String PeriodId) {
        this.PeriodId = PeriodId;
    }

    // StartDate
    private org.joda.time.DateTime StartDate;

    @JsonProperty("StartDate")
    public org.joda.time.DateTime getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(org.joda.time.DateTime StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private org.joda.time.DateTime EndDate;

    @JsonProperty("EndDate")
    public org.joda.time.DateTime getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(org.joda.time.DateTime EndDate) {
        this.EndDate = EndDate;
    }

    // IsStandardYear
    private Boolean IsStandardYear;

    @JsonProperty("IsStandardYear")
    public Boolean getIsStandardYear() {
        return this.IsStandardYear;
    }

    @JsonProperty("IsStandardYear")
    public void setIsStandardYear(Boolean IsStandardYear) {
        this.IsStandardYear = IsStandardYear;
    }

    // YearType
    @XStreamConverter(PicklistEnumConverter.class)
    private YearTypeEnum YearType;

    @JsonProperty("YearType")
    public YearTypeEnum getYearType() {
        return this.YearType;
    }

    @JsonProperty("YearType")
    public void setYearType(YearTypeEnum YearType) {
        this.YearType = YearType;
    }

    // QuarterLabelScheme
    @XStreamConverter(PicklistEnumConverter.class)
    private QuarterLabelSchemeEnum QuarterLabelScheme;

    @JsonProperty("QuarterLabelScheme")
    public QuarterLabelSchemeEnum getQuarterLabelScheme() {
        return this.QuarterLabelScheme;
    }

    @JsonProperty("QuarterLabelScheme")
    public void setQuarterLabelScheme(QuarterLabelSchemeEnum QuarterLabelScheme) {
        this.QuarterLabelScheme = QuarterLabelScheme;
    }

    // PeriodLabelScheme
    @XStreamConverter(PicklistEnumConverter.class)
    private PeriodLabelSchemeEnum PeriodLabelScheme;

    @JsonProperty("PeriodLabelScheme")
    public PeriodLabelSchemeEnum getPeriodLabelScheme() {
        return this.PeriodLabelScheme;
    }

    @JsonProperty("PeriodLabelScheme")
    public void setPeriodLabelScheme(PeriodLabelSchemeEnum PeriodLabelScheme) {
        this.PeriodLabelScheme = PeriodLabelScheme;
    }

    // WeekLabelScheme
    @XStreamConverter(PicklistEnumConverter.class)
    private WeekLabelSchemeEnum WeekLabelScheme;

    @JsonProperty("WeekLabelScheme")
    public WeekLabelSchemeEnum getWeekLabelScheme() {
        return this.WeekLabelScheme;
    }

    @JsonProperty("WeekLabelScheme")
    public void setWeekLabelScheme(WeekLabelSchemeEnum WeekLabelScheme) {
        this.WeekLabelScheme = WeekLabelScheme;
    }

    // QuarterPrefix
    @XStreamConverter(PicklistEnumConverter.class)
    private QuarterPrefixEnum QuarterPrefix;

    @JsonProperty("QuarterPrefix")
    public QuarterPrefixEnum getQuarterPrefix() {
        return this.QuarterPrefix;
    }

    @JsonProperty("QuarterPrefix")
    public void setQuarterPrefix(QuarterPrefixEnum QuarterPrefix) {
        this.QuarterPrefix = QuarterPrefix;
    }

    // PeriodPrefix
    @XStreamConverter(PicklistEnumConverter.class)
    private PeriodPrefixEnum PeriodPrefix;

    @JsonProperty("PeriodPrefix")
    public PeriodPrefixEnum getPeriodPrefix() {
        return this.PeriodPrefix;
    }

    @JsonProperty("PeriodPrefix")
    public void setPeriodPrefix(PeriodPrefixEnum PeriodPrefix) {
        this.PeriodPrefix = PeriodPrefix;
    }

    // WeekStartDay
    private Integer WeekStartDay;

    @JsonProperty("WeekStartDay")
    public Integer getWeekStartDay() {
        return this.WeekStartDay;
    }

    @JsonProperty("WeekStartDay")
    public void setWeekStartDay(Integer WeekStartDay) {
        this.WeekStartDay = WeekStartDay;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
