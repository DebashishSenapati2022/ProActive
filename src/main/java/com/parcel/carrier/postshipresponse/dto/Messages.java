package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Messages{
    @JsonProperty("Message") 
    private List<Message> message;
    @JsonProperty("Size") 
    private int size;
}
