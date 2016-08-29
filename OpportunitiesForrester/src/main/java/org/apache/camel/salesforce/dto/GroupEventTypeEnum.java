/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist GroupEventType
 */
public enum GroupEventTypeEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2");

    final String value;

    private GroupEventTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static GroupEventTypeEnum fromValue(String value) {
        for (GroupEventTypeEnum e : GroupEventTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
