/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotifyForOperations
 */
public enum NotifyForOperationsEnum {

    // All
    ALL("All"),
    // Create
    CREATE("Create"),
    // Extended
    EXTENDED("Extended"),
    // Update
    UPDATE("Update");

    final String value;

    private NotifyForOperationsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotifyForOperationsEnum fromValue(String value) {
        for (NotifyForOperationsEnum e : NotifyForOperationsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
