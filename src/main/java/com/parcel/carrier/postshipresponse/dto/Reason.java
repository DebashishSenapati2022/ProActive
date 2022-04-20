package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Reason{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedData") 
    private List<Object> localizedData;
    @JsonProperty("LocalizedDataKVStore") 
    private List<Object> localizedDataKVStore;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CancellationInitiatedBy") 
    private CancellationInitiatedBy cancellationInitiatedBy;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("EligibleForContactCenter") 
    private boolean eligibleForContactCenter;
    @JsonProperty("EligibleForSelfService") 
    private boolean eligibleForSelfService;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ReallocateOnShort") 
    private boolean reallocateOnShort;
    @JsonProperty("ReasonId") 
    private String reasonId;
    @JsonProperty("ReasonTypeId") 
    private String reasonTypeId;
    @JsonProperty("SequenceNumber") 
    private int sequenceNumber;
    @JsonProperty("ShortDescription") 
    private String shortDescription;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
