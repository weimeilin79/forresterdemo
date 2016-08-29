/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RowCause
 */
public enum RowCauseEnum {

    // ImplicitChild
    IMPLICITCHILD("ImplicitChild"),
    // ImplicitParent
    IMPLICITPARENT("ImplicitParent"),
    // Manual
    MANUAL("Manual"),
    // Owner
    OWNER("Owner"),
    // Rule
    RULE("Rule"),
    // Team
    TEAM("Team"),
    // Territory
    TERRITORY("Territory"),
    // Territory2Forecast
    TERRITORY2FORECAST("Territory2Forecast"),
    // TerritoryManual
    TERRITORYMANUAL("TerritoryManual"),
    // TerritoryRule
    TERRITORYRULE("TerritoryRule");

    final String value;

    private RowCauseEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RowCauseEnum fromValue(String value) {
        for (RowCauseEnum e : RowCauseEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
