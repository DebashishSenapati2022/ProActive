package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class QuantityDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("QuantityDetailId") 
    private String quantityDetailId;
    @JsonProperty("Reason") 
    private Reason reason;
    @JsonProperty("ReasonType") 
    private ReasonType reasonType;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("StatusId") 
    private String statusId;
    @JsonProperty("SubstitutionRatio") 
    private int substitutionRatio;
    @JsonProperty("SubstitutionType") 
    private SubstitutionType substitutionType;
    @JsonProperty("UOM") 
    private String uOM;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
