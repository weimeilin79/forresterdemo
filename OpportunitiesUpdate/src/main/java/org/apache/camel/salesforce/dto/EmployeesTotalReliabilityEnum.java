/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist EmployeesTotalReliability
 */
public enum EmployeesTotalReliabilityEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3");

    final String value;

    private EmployeesTotalReliabilityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EmployeesTotalReliabilityEnum fromValue(String value) {
        for (EmployeesTotalReliabilityEnum e : EmployeesTotalReliabilityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
