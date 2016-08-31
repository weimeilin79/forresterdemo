/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MatchingMethod
 */
public enum MatchingMethodEnum {

    // City
    CITY("City"),
    // CompanyName
    COMPANYNAME("CompanyName"),
    // Exact
    EXACT("Exact"),
    // FirstName
    FIRSTNAME("FirstName"),
    // LastName
    LASTNAME("LastName"),
    // Phone
    PHONE("Phone"),
    // Street
    STREET("Street"),
    // Title
    TITLE("Title"),
    // Zip
    ZIP("Zip");

    final String value;

    private MatchingMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MatchingMethodEnum fromValue(String value) {
        for (MatchingMethodEnum e : MatchingMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
