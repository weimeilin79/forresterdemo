/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist QuarterLabel
 */
public enum QuarterLabelEnum {

    // Fall
    FALL("Fall"),
    // Spring
    SPRING("Spring"),
    // Summer
    SUMMER("Summer"),
    // Winter
    WINTER("Winter");

    final String value;

    private QuarterLabelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static QuarterLabelEnum fromValue(String value) {
        for (QuarterLabelEnum e : QuarterLabelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
