/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefaultCalendarAccess
 */
public enum DefaultCalendarAccessEnum {

    // AllowEdits
    ALLOWEDITS("AllowEdits"),
    // HideDetails
    HIDEDETAILS("HideDetails"),
    // HideDetailsInsert
    HIDEDETAILSINSERT("HideDetailsInsert"),
    // ShowDetails
    SHOWDETAILS("ShowDetails"),
    // ShowDetailsInsert
    SHOWDETAILSINSERT("ShowDetailsInsert");

    final String value;

    private DefaultCalendarAccessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DefaultCalendarAccessEnum fromValue(String value) {
        for (DefaultCalendarAccessEnum e : DefaultCalendarAccessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
