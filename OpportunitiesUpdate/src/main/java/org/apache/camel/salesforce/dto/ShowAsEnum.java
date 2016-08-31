/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ShowAs
 */
public enum ShowAsEnum {

    // Busy
    BUSY("Busy"),
    // Free
    FREE("Free"),
    // OutOfOffice
    OUTOFOFFICE("OutOfOffice");

    final String value;

    private ShowAsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ShowAsEnum fromValue(String value) {
        for (ShowAsEnum e : ShowAsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
