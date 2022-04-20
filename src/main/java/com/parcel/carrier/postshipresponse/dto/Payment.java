package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Payment{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AllowRetry") 
    private boolean allowRetry;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("ArchiveProcess") 
    private boolean archiveProcess;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerId") 
    private String customerId;
    @JsonProperty("ExecutionMode") 
    private String executionMode;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("HoldPaymentTransaction") 
    private boolean holdPaymentTransaction;
    @JsonProperty("InteractionMode") 
    private String interactionMode;
    @JsonProperty("IsCancelled") 
    private boolean isCancelled;
    @JsonProperty("LiabilityAmount") 
    private int liabilityAmount;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderId") 
    private String orderId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PaymentGroupId") 
    private String paymentGroupId;
    @JsonProperty("PaymentMethod") 
    private List<PaymentMethod> paymentMethod;
    @JsonProperty("PaymentStatusName") 
    private String paymentStatusName;
    @JsonProperty("PurgeDate") 
    private String purgeDate;
    @JsonProperty("SkipOrderUpdate") 
    private boolean skipOrderUpdate;
    @JsonProperty("Source") 
    private Source source;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
