package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaxShipFromAddress{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("AVSReasonComments") 
    private String aVSReasonComments;
    @JsonProperty("Address") 
    private Address address;
    @JsonProperty("AddressId") 
    private String addressId;
    @JsonProperty("AddressName") 
    private String addressName;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AvsReason") 
    private AvsReason avsReason;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("IsAddressVerified") 
    private boolean isAddressVerified;
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
    @JsonProperty("PhoneCountryId") 
    private String phoneCountryId;
    @JsonProperty("PhoneWithoutPrefix") 
    private String phoneWithoutPrefix;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
