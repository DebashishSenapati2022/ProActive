package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerIdentityDoc{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CaptureDate") 
    private String captureDate;
    @JsonProperty("CaptureReason") 
    private String captureReason;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerIdentityDocId") 
    private String customerIdentityDocId;
    @JsonProperty("DocType") 
    private DocType docType;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IdDocNumber") 
    private String idDocNumber;
    @JsonProperty("IdentityDocType") 
    private IdentityDocType identityDocType;
    @JsonProperty("Image") 
    private String image;
    @JsonProperty("ImageType") 
    private String imageType;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentOrder") 
    private ParentOrder parentOrder;
    @JsonProperty("State") 
    private String state;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
