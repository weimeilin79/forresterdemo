/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceMonthOfYear
 */
public enum RecurrenceMonthOfYearEnum {

    // April
    APRIL("April"),
    // August
    AUGUST("August"),
    // December
    DECEMBER("December"),
    // February
    FEBRUARY("February"),
    // January
    JANUARY("January"),
    // July
    JULY("July"),
    // June
    JUNE("June"),
    // March
    MARCH("March"),
    // May
    MAY("May"),
    // November
    NOVEMBER("November"),
    // October
    OCTOBER("October"),
    // September
    SEPTEMBER("September");

    final String value;

    private RecurrenceMonthOfYearEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RecurrenceMonthOfYearEnum fromValue(String value) {
        for (RecurrenceMonthOfYearEnum e : RecurrenceMonthOfYearEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
