/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DomainMatch
 */
public enum DomainMatchEnum {

    // DomainAndSubdomains
    DOMAINANDSUBDOMAINS("DomainAndSubdomains"),
    // DomainOnly
    DOMAINONLY("DomainOnly"),
    // SubdomainsOnly
    SUBDOMAINSONLY("SubdomainsOnly");

    final String value;

    private DomainMatchEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DomainMatchEnum fromValue(String value) {
        for (DomainMatchEnum e : DomainMatchEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
