/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CallType
 */
public enum CallTypeEnum {

    // Inbound
    INBOUND("Inbound"),
    // Internal
    INTERNAL("Internal"),
    // Outbound
    OUTBOUND("Outbound");

    final String value;

    private CallTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CallTypeEnum fromValue(String value) {
        for (CallTypeEnum e : CallTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
