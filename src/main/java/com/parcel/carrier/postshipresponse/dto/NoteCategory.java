package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NoteCategory{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NoteCategoryId") 
    private String noteCategoryId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("ShortDescription") 
    private String shortDescription;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
