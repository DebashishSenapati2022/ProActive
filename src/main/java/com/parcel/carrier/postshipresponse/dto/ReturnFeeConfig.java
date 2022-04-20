package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReturnFeeConfig{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Amount") 
    private int amount;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerTypeId") 
    private String customerTypeId;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FeeName") 
    private String feeName;
    @JsonProperty("FeeType") 
    private FeeType feeType;
    @JsonProperty("IsOrderLineFee") 
    private boolean isOrderLineFee;
    @JsonProperty("ItemCondition") 
    private ItemCondition itemCondition;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderType") 
    private OrderType orderType;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ReturnFeeConfigId") 
    private String returnFeeConfigId;
    @JsonProperty("ReturnReason") 
    private ReturnReason returnReason;
    @JsonProperty("ReturnType") 
    private ReturnType returnType;
    @JsonProperty("SellingChannel") 
    private SellingChannel sellingChannel;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
