package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReturnDetail{
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
    @JsonProperty("IsGiftReturn") 
    private boolean isGiftReturn;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("LocationId") 
    private String locationId;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("ReceivedItemCondition") 
    private ReceivedItemCondition receivedItemCondition;
    @JsonProperty("ReturnDetailId") 
    private String returnDetailId;
    @JsonProperty("ReturnOrderId") 
    private String returnOrderId;
    @JsonProperty("ReturnOrderLineId") 
    private String returnOrderLineId;
    @JsonProperty("ReturnType") 
    private ReturnType returnType;
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
