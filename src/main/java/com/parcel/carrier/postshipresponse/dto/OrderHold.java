package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderHold{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("ApplyReasonComments") 
    private String applyReasonComments;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExternalCreatedBy") 
    private String externalCreatedBy;
    @JsonProperty("ExternalCreatedDate") 
    private String externalCreatedDate;
    @JsonProperty("HoldTypeId") 
    private String holdTypeId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ResolveReasonComments") 
    private String resolveReasonComments;
    @JsonProperty("ResolveReasonId") 
    private String resolveReasonId;
    @JsonProperty("StatusId") 
    private String statusId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
