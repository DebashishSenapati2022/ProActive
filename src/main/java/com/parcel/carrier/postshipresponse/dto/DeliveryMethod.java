package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeliveryMethod{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DeliveryMethodId") 
    private String deliveryMethodId;
    @JsonProperty("DeliveryMethodSubType") 
    private List<DeliveryMethodSubType> deliveryMethodSubType;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsShippingChargeRequired") 
    private boolean isShippingChargeRequired;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ShortDescription") 
    private String shortDescription;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
