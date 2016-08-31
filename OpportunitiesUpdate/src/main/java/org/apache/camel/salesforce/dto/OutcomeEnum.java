/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Outcome
 */
public enum OutcomeEnum {

    // CompileFail
    COMPILEFAIL("CompileFail"),
    // Fail
    FAIL("Fail"),
    // Pass
    PASS("Pass"),
    // Skip
    SKIP("Skip");

    final String value;

    private OutcomeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OutcomeEnum fromValue(String value) {
        for (OutcomeEnum e : OutcomeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
