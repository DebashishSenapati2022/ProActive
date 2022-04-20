package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReleaseLine{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AllocationId") 
    private String allocationId;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CancelledDate") 
    private String cancelledDate;
    @JsonProperty("CancelledQuantity") 
    private int cancelledQuantity;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("EffectiveRank") 
    private String effectiveRank;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfilledQuantity") 
    private int fulfilledQuantity;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderLineId") 
    private String orderLineId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("ReleaseLineId") 
    private String releaseLineId;
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
