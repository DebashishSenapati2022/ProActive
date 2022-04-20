package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ReturnConfig{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AutoApproveReceiptNotExpected") 
    private boolean autoApproveReceiptNotExpected;
    @JsonProperty("AutoResolveQuantityVariance") 
    private boolean autoResolveQuantityVariance;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DaysForEligibleReturn") 
    private int daysForEligibleReturn;
    @JsonProperty("ExchangeHoldType") 
    private String exchangeHoldType;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("MaxStatusEligibleForReturn") 
    private String maxStatusEligibleForReturn;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("MinStatusEligibleForReturn") 
    private String minStatusEligibleForReturn;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PriceRank") 
    private int priceRank;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("RetunLabelFileName") 
    private String retunLabelFileName;
    @JsonProperty("ReturnLabeldocumentId") 
    private String returnLabeldocumentId;
    @JsonProperty("ReturnMatchAgePolicy") 
    private ReturnMatchAgePolicy returnMatchAgePolicy;
    @JsonProperty("ReturnMatchPricePolicyId") 
    private ReturnMatchPricePolicyId returnMatchPricePolicyId;
    @JsonProperty("StatusToUnholdExchanges") 
    private String statusToUnholdExchanges;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
