/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Site
 */
public enum SiteEnum {

    // Branch
    BRANCH("Branch"),
    // Headquarters
    HEADQUARTERS("Headquarters"),
    // Single Location
    SINGLE_LOCATION("Single Location");

    final String value;

    private SiteEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SiteEnum fromValue(String value) {
        for (SiteEnum e : SiteEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
