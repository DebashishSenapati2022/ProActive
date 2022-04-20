package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Address{
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
