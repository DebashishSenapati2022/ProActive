package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ManagerAuthDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AuthorizerName") 
    private String authorizerName;
    @JsonProperty("CommandDisplayName") 
    private String commandDisplayName;
    @JsonProperty("CommandName") 
    private String commandName;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("ManagerAuthDetailId") 
    private String managerAuthDetailId;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderLineId") 
    private String orderLineId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("OverrideSuccess") 
    private boolean overrideSuccess;
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
