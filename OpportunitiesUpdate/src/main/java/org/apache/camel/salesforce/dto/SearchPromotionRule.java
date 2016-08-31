/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject SearchPromotionRule
 */
@XStreamAlias("SearchPromotionRule")
public class SearchPromotionRule extends AbstractSObjectBase {

    // Query
    private String Query;

    @JsonProperty("Query")
    public String getQuery() {
        return this.Query;
    }

    @JsonProperty("Query")
    public void setQuery(String Query) {
        this.Query = Query;
    }

}
