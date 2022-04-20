package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ModTypeConfig{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CalculateEffectiveRank") 
    private boolean calculateEffectiveRank;
    @JsonProperty("CalculatePrice") 
    private boolean calculatePrice;
    @JsonProperty("CalculateReturnFee") 
    private boolean calculateReturnFee;
    @JsonProperty("CalculateSnh") 
    private boolean calculateSnh;
    @JsonProperty("CalculateTax") 
    private boolean calculateTax;
    @JsonProperty("CancelReservation") 
    private boolean cancelReservation;
    @JsonProperty("ChangeStatus") 
    private String changeStatus;
    @JsonProperty("ConfigEmailMessage") 
    private List<Object> configEmailMessage;
    @JsonProperty("ConfigTextMessage") 
    private List<Object> configTextMessage;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomServiceConfig") 
    private List<Object> customServiceConfig;
    @JsonProperty("EvaluatePromotion") 
    private boolean evaluatePromotion;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("ModType") 
    private ModType modType;
    @JsonProperty("ModTypeConfigOverrides") 
    private List<Object> modTypeConfigOverrides;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("PublishOrder") 
    private boolean publishOrder;
    @JsonProperty("PublishOrderLine") 
    private boolean publishOrderLine;
    @JsonProperty("ReevaluatePipeline") 
    private boolean reevaluatePipeline;
    @JsonProperty("RestrictFromReturnStatus") 
    private String restrictFromReturnStatus;
    @JsonProperty("RestrictFromStatus") 
    private String restrictFromStatus;
    @JsonProperty("RestrictPostConfirmation") 
    private boolean restrictPostConfirmation;
    @JsonProperty("ResubmitPipeline") 
    private boolean resubmitPipeline;
    @JsonProperty("Status") 
    private String status;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
