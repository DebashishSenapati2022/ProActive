package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLineAdditional{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("EligibleForReturnReason") 
    private EligibleForReturnReason eligibleForReturnReason;
    @JsonProperty("EligibleForReturnReasonComment") 
    private String eligibleForReturnReasonComment;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsConditionVariance") 
    private boolean isConditionVariance;
    @JsonProperty("IsItemVariance") 
    private boolean isItemVariance;
    @JsonProperty("IsMarkedForCancellation") 
    private boolean isMarkedForCancellation;
    @JsonProperty("ItemCondition") 
    private ItemCondition itemCondition;
    @JsonProperty("ItemDisposition") 
    private String itemDisposition;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PriceOverrideComments") 
    private String priceOverrideComments;
    @JsonProperty("PriceOverrideReason") 
    private PriceOverrideReason priceOverrideReason;
    @JsonProperty("PriceOverrideReasonId") 
    private String priceOverrideReasonId;
    @JsonProperty("ReturnApprovalComments") 
    private String returnApprovalComments;
    @JsonProperty("ReturnApprovalReason") 
    private ReturnApprovalReason returnApprovalReason;
    @JsonProperty("ReturnReason") 
    private String returnReason;
    @JsonProperty("TaxOverrideReason") 
    private TaxOverrideReason taxOverrideReason;
    @JsonProperty("TaxOverrideReasonId") 
    private String taxOverrideReasonId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("VarianceQuantity") 
    private int varianceQuantity;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
