/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 31 01:24:49 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SobjectType
 */
public enum SobjectTypeEnum {

    // Account
    ACCOUNT("Account"),
    // Announcement
    ANNOUNCEMENT("Announcement"),
    // Asset
    ASSET("Asset"),
    // AssistantProgress
    ASSISTANTPROGRESS("AssistantProgress"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CampaignMember
    CAMPAIGNMEMBER("CampaignMember"),
    // Case
    CASE("Case"),
    // CollaborationGroupRecord
    COLLABORATIONGROUPRECORD("CollaborationGroupRecord"),
    // Contact
    CONTACT("Contact"),
    // ContentVersion
    CONTENTVERSION("ContentVersion"),
    // Contract
    CONTRACT("Contract"),
    // DuplicateErrorLog
    DUPLICATEERRORLOG("DuplicateErrorLog"),
    // DuplicateRecordItem
    DUPLICATERECORDITEM("DuplicateRecordItem"),
    // DuplicateRecordSet
    DUPLICATERECORDSET("DuplicateRecordSet"),
    // Event
    EVENT("Event"),
    // FileSearchActivity
    FILESEARCHACTIVITY("FileSearchActivity"),
    // Goal
    GOAL("Goal"),
    // GoalLink
    GOALLINK("GoalLink"),
    // Idea
    IDEA("Idea"),
    // InboundSocialPost
    INBOUNDSOCIALPOST("InboundSocialPost"),
    // Lead
    LEAD("Lead"),
    // Macro
    MACRO("Macro"),
    // MacroAction
    MACROACTION("MacroAction"),
    // MacroInstruction
    MACROINSTRUCTION("MacroInstruction"),
    // Metric
    METRIC("Metric"),
    // MetricDataLink
    METRICDATALINK("MetricDataLink"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // Order
    ORDER("Order"),
    // Pricebook2
    PRICEBOOK2("Pricebook2"),
    // Product2
    PRODUCT2("Product2"),
    // RecordOrigin
    RECORDORIGIN("RecordOrigin"),
    // SearchActivity
    SEARCHACTIVITY("SearchActivity"),
    // SearchPromotionRule
    SEARCHPROMOTIONRULE("SearchPromotionRule"),
    // SetupAssistantAnswer
    SETUPASSISTANTANSWER("SetupAssistantAnswer"),
    // Solution
    SOLUTION("Solution"),
    // Task
    TASK("Task"),
    // TransactionSecurityAction
    TRANSACTIONSECURITYACTION("TransactionSecurityAction"),
    // TransactionSecurityActionEvent
    TRANSACTIONSECURITYACTIONEVENT("TransactionSecurityActionEvent"),
    // WorkCoaching
    WORKCOACHING("WorkCoaching"),
    // WorkFeedback
    WORKFEEDBACK("WorkFeedback"),
    // WorkFeedbackQuestion
    WORKFEEDBACKQUESTION("WorkFeedbackQuestion"),
    // WorkFeedbackQuestionSet
    WORKFEEDBACKQUESTIONSET("WorkFeedbackQuestionSet"),
    // WorkFeedbackRequest
    WORKFEEDBACKREQUEST("WorkFeedbackRequest"),
    // WorkFeedbackTemplate
    WORKFEEDBACKTEMPLATE("WorkFeedbackTemplate"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private SobjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SobjectTypeEnum fromValue(String value) {
        for (SobjectTypeEnum e : SobjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}