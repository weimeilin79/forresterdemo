/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Position
 */
public enum PositionEnum {

    // fullScreen
    FULLSCREEN("fullScreen"),
    // none
    NONE("none"),
    // topLeft
    TOPLEFT("topLeft");

    final String value;

    private PositionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PositionEnum fromValue(String value) {
        for (PositionEnum e : PositionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
