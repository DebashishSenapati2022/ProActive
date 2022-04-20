package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LocalizedData{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LanguageKey") 
    private String languageKey;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentReason") 
    private ParentReason parentReason;
    @JsonProperty("ShortDescription") 
    private String shortDescription;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
    @JsonProperty("DisplayName") 
    private String displayName;
    @JsonProperty("ParentPaymentType") 
    private ParentPaymentType parentPaymentType;
}
