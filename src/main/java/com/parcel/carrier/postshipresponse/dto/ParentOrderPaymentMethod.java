package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ParentOrderPaymentMethod{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Amount") 
    private int amount;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentOrderId") 
    private String parentOrderId;
    @JsonProperty("ParentPaymentGroupId") 
    private String parentPaymentGroupId;
    @JsonProperty("ParentPaymentMethodId") 
    private String parentPaymentMethodId;
    @JsonProperty("PurgeDate") 
    private String purgeDate;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
