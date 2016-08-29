/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RuleStatus
 */
public enum RuleStatusEnum {

    // Activating
    ACTIVATING("Activating"),
    // ActivationFailed
    ACTIVATIONFAILED("ActivationFailed"),
    // Active
    ACTIVE("Active"),
    // Deactivating
    DEACTIVATING("Deactivating"),
    // DeactivationFailed
    DEACTIVATIONFAILED("DeactivationFailed"),
    // Inactive
    INACTIVE("Inactive");

    final String value;

    private RuleStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RuleStatusEnum fromValue(String value) {
        for (RuleStatusEnum e : RuleStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
