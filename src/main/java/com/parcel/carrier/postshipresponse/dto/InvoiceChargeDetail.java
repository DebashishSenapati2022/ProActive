package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class InvoiceChargeDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("ChargeDetailId") 
    private String chargeDetailId;
    @JsonProperty("ChargeDisplayName") 
    private String chargeDisplayName;
    @JsonProperty("ChargePercent") 
    private int chargePercent;
    @JsonProperty("ChargeReferenceId") 
    private String chargeReferenceId;
    @JsonProperty("ChargeSequence") 
    private int chargeSequence;
    @JsonProperty("ChargeSubType") 
    private ChargeSubType chargeSubType;
    @JsonProperty("ChargeTotal") 
    private int chargeTotal;
    @JsonProperty("ChargeType") 
    private ChargeType chargeType;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DiscountOn") 
    private DiscountOn discountOn;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentGroupId") 
    private String fulfillmentGroupId;
    @JsonProperty("IsInformational") 
    private boolean isInformational;
    @JsonProperty("IsOverrIdden") 
    private boolean isOverrIdden;
    @JsonProperty("IsOverridden") 
    private boolean isOverridden;
    @JsonProperty("IsProrated") 
    private boolean isProrated;
    @JsonProperty("IsProratedAtSameLevel") 
    private boolean isProratedAtSameLevel;
    @JsonProperty("IsReturnCharge") 
    private boolean isReturnCharge;
    @JsonProperty("IsTaxIncluded") 
    private boolean isTaxIncluded;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderChargeDetailId") 
    private String orderChargeDetailId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("OriginalChargeAmount") 
    private int originalChargeAmount;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentChargeDetailId") 
    private String parentChargeDetailId;
    @JsonProperty("Reason") 
    private Reason reason;
    @JsonProperty("RelatedChargeDetailId") 
    private String relatedChargeDetailId;
    @JsonProperty("RelatedChargeType") 
    private String relatedChargeType;
    @JsonProperty("RequestedAmount") 
    private int requestedAmount;
    @JsonProperty("TaxCode") 
    private String taxCode;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String comments;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
