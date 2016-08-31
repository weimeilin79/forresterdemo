/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Department
 */
public enum DepartmentEnum {

    // Engineering
    ENGINEERING("Engineering"),
    // Finance
    FINANCE("Finance"),
    // HR
    HR("HR"),
    // IT
    IT("IT"),
    // Marketing
    MARKETING("Marketing"),
    // Operations
    OPERATIONS("Operations"),
    // Other
    OTHER("Other"),
    // Sales
    SALES("Sales"),
    // Support
    SUPPORT("Support");

    final String value;

    private DepartmentEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DepartmentEnum fromValue(String value) {
        for (DepartmentEnum e : DepartmentEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
