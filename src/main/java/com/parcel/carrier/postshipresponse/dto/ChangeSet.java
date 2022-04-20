package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ChangeSet{
    @JsonProperty("ModType") 
    private String modType;
    @JsonProperty("Properties") 
    private List<Property> properties;
}
