package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderTrackingDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("City") 
    private String city;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Date") 
    private String date;
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
    @JsonProperty("PostalCode") 
    private String postalCode;
    @JsonProperty("State") 
    private String state;
    @JsonProperty("Status") 
    private String status;
    @JsonProperty("StatusDescription") 
    private String statusDescription;
    @JsonProperty("StatusSubType") 
    private String statusSubType;
    @JsonProperty("StatusSubTypeDescription") 
    private String statusSubTypeDescription;
    @JsonProperty("TrackingDetailId") 
    private String trackingDetailId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
