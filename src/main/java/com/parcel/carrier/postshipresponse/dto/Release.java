package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Release{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CarrierCode") 
    private String carrierCode;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DeliveryMethodId") 
    private String deliveryMethodId;
    @JsonProperty("DestinationAction") 
    private String destinationAction;
    @JsonProperty("EffectiveRank") 
    private String effectiveRank;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderId") 
    private String orderId;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ReleaseExtension1") 
    private List<ReleaseExtension1> releaseExtension1;
    @JsonProperty("ReleaseId") 
    private String releaseId;
    @JsonProperty("ReleaseLine") 
    private List<ReleaseLine> releaseLine;
    @JsonProperty("ReleaseType") 
    private String releaseType;
    @JsonProperty("ServiceLevelCode") 
    private String serviceLevelCode;
    @JsonProperty("ShipFromLocationId") 
    private String shipFromLocationId;
    @JsonProperty("ShipToLocationId") 
    private String shipToLocationId;
    @JsonProperty("ShipViaId") 
    private String shipViaId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
