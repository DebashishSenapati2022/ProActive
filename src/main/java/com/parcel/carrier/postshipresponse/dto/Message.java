package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Message{
    @JsonProperty("Code") 
    private String code;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("Type") 
    private String type;
}
