package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ParentCustomer{
    @JsonProperty("PK") 
    private String pK;
}
