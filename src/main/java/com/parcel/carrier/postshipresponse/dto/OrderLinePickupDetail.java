package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLinePickupDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("IsPrimary") 
    private boolean isPrimary;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderLinePickupDetailId") 
    private String orderLinePickupDetailId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentOrderLine") 
    private ParentOrderLine parentOrderLine;
    @JsonProperty("Phone") 
    private String phone;
    @JsonProperty("PickupEndDate") 
    private String pickupEndDate;
    @JsonProperty("PickupStartDate") 
    private String pickupStartDate;
    @JsonProperty("PreferredContactMethod") 
    private String preferredContactMethod;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
