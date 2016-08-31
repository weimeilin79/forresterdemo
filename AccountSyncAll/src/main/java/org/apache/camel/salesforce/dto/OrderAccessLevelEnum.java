/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OrderAccessLevel
 */
public enum OrderAccessLevelEnum {

    // All
    ALL("All"),
    // Edit
    EDIT("Edit"),
    // Read
    READ("Read");

    final String value;

    private OrderAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OrderAccessLevelEnum fromValue(String value) {
        for (OrderAccessLevelEnum e : OrderAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
