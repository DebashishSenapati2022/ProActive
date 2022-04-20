package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Source{
    @JsonProperty("SourceId") 
    private String sourceId;
}
