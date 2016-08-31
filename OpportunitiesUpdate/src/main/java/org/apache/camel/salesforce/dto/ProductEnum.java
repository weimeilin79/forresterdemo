/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Product__c
 */
public enum ProductEnum {

    // GC1020
    GC1020("GC1020"),
    // GC1040
    GC1040("GC1040"),
    // GC1060
    GC1060("GC1060"),
    // GC3020
    GC3020("GC3020"),
    // GC3040
    GC3040("GC3040"),
    // GC3060
    GC3060("GC3060"),
    // GC5020
    GC5020("GC5020"),
    // GC5040
    GC5040("GC5040"),
    // GC5060
    GC5060("GC5060");

    final String value;

    private ProductEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProductEnum fromValue(String value) {
        for (ProductEnum e : ProductEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
