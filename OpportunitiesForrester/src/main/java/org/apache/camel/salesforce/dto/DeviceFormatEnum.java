/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DeviceFormat
 */
public enum DeviceFormatEnum {

    // Aloha
    ALOHA("Aloha"),
    // Desktop
    DESKTOP("Desktop"),
    // Phone
    PHONE("Phone"),
    // Tablet
    TABLET("Tablet");

    final String value;

    private DeviceFormatEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DeviceFormatEnum fromValue(String value) {
        for (DeviceFormatEnum e : DeviceFormatEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
