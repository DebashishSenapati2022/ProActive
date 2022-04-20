package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerContact{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("ContactType") 
    private String contactType;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerContactId") 
    private String customerContactId;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("Phone") 
    private String phone;
    @JsonProperty("PhoneCountryId") 
    private String phoneCountryId;
    @JsonProperty("PhoneNumberType") 
    private String phoneNumberType;
    @JsonProperty("PhoneWithoutPrefix") 
    private String phoneWithoutPrefix;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("Title") 
    private String title;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
