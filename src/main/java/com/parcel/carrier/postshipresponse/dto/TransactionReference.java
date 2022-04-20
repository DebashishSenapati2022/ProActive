package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TransactionReference{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DeviceId") 
    private String deviceId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsCancelled") 
    private boolean isCancelled;
    @JsonProperty("IsConfirmed") 
    private boolean isConfirmed;
    @JsonProperty("IsReadyForTender") 
    private boolean isReadyForTender;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OperatorId") 
    private String operatorId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PostvoidSignature") 
    private String postvoidSignature;
    @JsonProperty("RegisterId") 
    private String registerId;
    @JsonProperty("SellingChannel") 
    private SellingChannel sellingChannel;
    @JsonProperty("TillId") 
    private String tillId;
    @JsonProperty("TransactionReferenceId") 
    private String transactionReferenceId;
    @JsonProperty("TransactionType") 
    private TransactionType transactionType;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
