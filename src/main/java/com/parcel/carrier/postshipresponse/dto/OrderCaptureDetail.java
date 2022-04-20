package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderCaptureDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CaptureDate") 
    private String captureDate;
    @JsonProperty("CaptureDetailId") 
    private String captureDetailId;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DeviceId") 
    private String deviceId;
    @JsonProperty("EmployeeId") 
    private String employeeId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IpAddress") 
    private String ipAddress;
    @JsonProperty("JobClass") 
    private String jobClass;
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
    @JsonProperty("ParentOrder") 
    private ParentOrder parentOrder;
    @JsonProperty("RegisterId") 
    private String registerId;
    @JsonProperty("StoreDisplayId") 
    private String storeDisplayId;
    @JsonProperty("TillId") 
    private String tillId;
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
