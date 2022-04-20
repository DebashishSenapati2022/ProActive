package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PaymentTransaction{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AuthorizationType") 
    private AuthorizationType authorizationType;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExternalResponseId") 
    private String externalResponseId;
    @JsonProperty("FollowOnCount") 
    private int followOnCount;
    @JsonProperty("FollowOnId") 
    private String followOnId;
    @JsonProperty("FollowOnParentTransaction") 
    private List<FollowOnParentTransaction> followOnParentTransaction;
    @JsonProperty("FollowOnProcessedAmount") 
    private int followOnProcessedAmount;
    @JsonProperty("FollowOnToken") 
    private String followOnToken;
    @JsonProperty("InteractionMode") 
    private InteractionMode interactionMode;
    @JsonProperty("IsActivation") 
    private boolean isActivation;
    @JsonProperty("IsActive") 
    private boolean isActive;
    @JsonProperty("IsCopied") 
    private boolean isCopied;
    @JsonProperty("IsValidForRefund") 
    private boolean isValidForRefund;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NetworkTransactionId") 
    private String networkTransactionId;
    @JsonProperty("OnHold") 
    private boolean onHold;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PaymentResponseStatus") 
    private PaymentResponseStatus paymentResponseStatus;
    @JsonProperty("PaymentTransAttribute") 
    private List<PaymentTransAttribute> paymentTransAttribute;
    @JsonProperty("PaymentTransEncrAttribute") 
    private List<PaymentTransEncrAttribute> paymentTransEncrAttribute;
    @JsonProperty("PaymentTransactionDetail") 
    private List<PaymentTransactionDetail> paymentTransactionDetail;
    @JsonProperty("PaymentTransactionEMVTags") 
    private PaymentTransactionEMVTags paymentTransactionEMVTags;
    @JsonProperty("PaymentTransactionId") 
    private String paymentTransactionId;
    @JsonProperty("ProcessedAmount") 
    private int processedAmount;
    @JsonProperty("ProcessingMode") 
    private ProcessingMode processingMode;
    @JsonProperty("PurgeDate") 
    private String purgeDate;
    @JsonProperty("ReAuthOnSettlementFailure") 
    private boolean reAuthOnSettlementFailure;
    @JsonProperty("ReasonId") 
    private String reasonId;
    @JsonProperty("ReconciliationId") 
    private String reconciliationId;
    @JsonProperty("RemainingAttempts") 
    private int remainingAttempts;
    @JsonProperty("RemainingBalance") 
    private int remainingBalance;
    @JsonProperty("RequestId") 
    private String requestId;
    @JsonProperty("RequestToken") 
    private String requestToken;
    @JsonProperty("RequestedAmount") 
    private int requestedAmount;
    @JsonProperty("RequestedDate") 
    private String requestedDate;
    @JsonProperty("ScheduledTimestamp") 
    private String scheduledTimestamp;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("StoreAndForwardNumber") 
    private String storeAndForwardNumber;
    @JsonProperty("TransactionDate") 
    private String transactionDate;
    @JsonProperty("TransactionExpiryDate") 
    private String transactionExpiryDate;
    @JsonProperty("TransactionType") 
    private TransactionType transactionType;
    @JsonProperty("TransmissionStatus") 
    private TransmissionStatus transmissionStatus;
    @JsonProperty("UniqueTransactionId") 
    private String uniqueTransactionId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
