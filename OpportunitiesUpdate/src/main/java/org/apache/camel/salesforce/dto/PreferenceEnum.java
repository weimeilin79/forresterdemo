/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Preference
 */
public enum PreferenceEnum {

    // 100
    _100("100"),
    // 101
    _101("101"),
    // 57
    _57("57"),
    // 58
    _58("58"),
    // 91
    _91("91"),
    // 92
    _92("92"),
    // 93
    _93("93"),
    // 94
    _94("94"),
    // 96
    _96("96"),
    // 97
    _97("97"),
    // 98
    _98("98"),
    // 99
    _99("99");

    final String value;

    private PreferenceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PreferenceEnum fromValue(String value) {
        for (PreferenceEnum e : PreferenceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
