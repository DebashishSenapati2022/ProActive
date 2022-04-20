package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLineNote{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DisplaySequence") 
    private int displaySequence;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsVisible") 
    private boolean isVisible;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NoteCategory") 
    private NoteCategory noteCategory;
    @JsonProperty("NoteId") 
    private String noteId;
    @JsonProperty("NoteText") 
    private String noteText;
    @JsonProperty("NoteType") 
    private NoteType noteType;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
