package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerAddress{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Address") 
    private Address address;
    @JsonProperty("AddressId") 
    private String addressId;
    @JsonProperty("AddressName") 
    private String addressName;
    @JsonProperty("AddressTypeId") 
    private String addressTypeId;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsAddressVerified") 
    private boolean isAddressVerified;
    @JsonProperty("IsPreferred") 
    private boolean isPreferred;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PhoneCountryId") 
    private String phoneCountryId;
    @JsonProperty("PhoneWithoutPrefix") 
    private String phoneWithoutPrefix;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
    @JsonProperty("Address1") 
    private String address1;
    @JsonProperty("Address2") 
    private String address2;
    @JsonProperty("Address3") 
    private String address3;
    @JsonProperty("City") 
    private String city;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("County") 
    private String county;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("Phone") 
    private String phone;
    @JsonProperty("PostalCode") 
    private String postalCode;
    @JsonProperty("State") 
    private String state;
}
