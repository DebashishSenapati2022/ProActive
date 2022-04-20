package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GatewaySchema{
    @JsonProperty("Account") 
    private List<Account> account;
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
    @JsonProperty("GatewayAttribute") 
    private List<GatewayAttribute> gatewayAttribute;
    @JsonProperty("GatewayEncryptedAttribute") 
    private List<GatewayEncryptedAttribute> gatewayEncryptedAttribute;
    @JsonProperty("GatewayId") 
    private String gatewayId;
    @JsonProperty("IsBase") 
    private boolean isBase;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PerformsStandaloneRefunds") 
    private boolean performsStandaloneRefunds;
    @JsonProperty("ProcessStuckTransaction") 
    private boolean processStuckTransaction;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private AttributesMap attributesMap;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
