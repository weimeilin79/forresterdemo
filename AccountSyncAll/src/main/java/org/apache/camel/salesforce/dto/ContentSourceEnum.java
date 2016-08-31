/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ContentSource
 */
public enum ContentSourceEnum {

    // HTML
    HTML("HTML"),
    // Snippet
    SNIPPET("Snippet"),
    // URL
    URL("URL");

    final String value;

    private ContentSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContentSourceEnum fromValue(String value) {
        for (ContentSourceEnum e : ContentSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
