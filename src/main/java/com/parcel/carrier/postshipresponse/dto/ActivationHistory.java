package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ActivationHistory{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ActivationHistoryId") 
    private String activationHistoryId;
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
    @JsonProperty("Notes") 
    private String notes;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentCustomer") 
    private ParentCustomer parentCustomer;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ReasonCode") 
    private ReasonCode reasonCode;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
