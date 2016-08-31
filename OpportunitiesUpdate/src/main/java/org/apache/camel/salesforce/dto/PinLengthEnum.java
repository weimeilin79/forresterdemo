/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PinLength
 */
public enum PinLengthEnum {

    // 4
    _4("4"),
    // 5
    _5("5"),
    // 6
    _6("6"),
    // 7
    _7("7"),
    // 8
    _8("8");

    final String value;

    private PinLengthEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PinLengthEnum fromValue(String value) {
        for (PinLengthEnum e : PinLengthEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
