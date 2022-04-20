package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderSummaryCharge{
    @JsonProperty("Key") 
    private String key;
    @JsonProperty("Type") 
    private String type;
    @JsonProperty("Value") 
    private int value;
}
