package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PaymentType{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Denomination") 
    private List<Object> denomination;
    @JsonProperty("EligibleRefundPaymentType") 
    private List<Object> eligibleRefundPaymentType;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedData") 
    private List<Object> localizedData;
    @JsonProperty("LocalizedDataKVStore") 
    private List<Object> localizedDataKVStore;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CancelBehavior") 
    private CancelBehavior cancelBehavior;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("DisplayName") 
    private String displayName;
    @JsonProperty("IsPrepaid") 
    private boolean isPrepaid;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("Name") 
    private String name;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PaymentTypeId") 
    private String paymentTypeId;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("RefundBehavior") 
    private RefundBehavior refundBehavior;
    @JsonProperty("RefundBehaviorForEdge") 
    private RefundBehaviorForEdge refundBehaviorForEdge;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("VoidAction") 
    private VoidAction voidAction;
    @JsonProperty("VoidBehavior") 
    private VoidBehavior voidBehavior;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
