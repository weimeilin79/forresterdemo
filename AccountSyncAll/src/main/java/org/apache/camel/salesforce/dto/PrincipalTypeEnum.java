/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PrincipalType
 */
public enum PrincipalTypeEnum {

    // Anonymous
    ANONYMOUS("Anonymous"),
    // NamedUser
    NAMEDUSER("NamedUser"),
    // PerUser
    PERUSER("PerUser");

    final String value;

    private PrincipalTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PrincipalTypeEnum fromValue(String value) {
        for (PrincipalTypeEnum e : PrincipalTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
