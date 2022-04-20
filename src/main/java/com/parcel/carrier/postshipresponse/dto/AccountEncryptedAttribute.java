package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AccountEncryptedAttribute{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("Name") 
    private String name;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentAccount") 
    private ParentAccount parentAccount;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("Value") 
    private String value;
    @JsonProperty("ValueDeprecated") 
    private String valueDeprecated;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
