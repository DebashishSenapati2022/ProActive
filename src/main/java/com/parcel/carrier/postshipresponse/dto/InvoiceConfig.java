package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class InvoiceConfig{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DeliveryMethod") 
    private DeliveryMethod deliveryMethod;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("InvoiceOnMergeLeg") 
    private boolean invoiceOnMergeLeg;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("MinFulfillmentStatus") 
    private MinFulfillmentStatus minFulfillmentStatus;
    @JsonProperty("MinFulfillmentStatusId") 
    private String minFulfillmentStatusId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ReadyForTenderRequired") 
    private boolean readyForTenderRequired;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
