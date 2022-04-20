package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderPromisingInfo{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CarrierCode") 
    private String carrierCode;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DoNotShipBeforeDate") 
    private String doNotShipBeforeDate;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExternalRouteId") 
    private String externalRouteId;
    @JsonProperty("LatestDeliveryDate") 
    private String latestDeliveryDate;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PromisedDeliveryDate") 
    private String promisedDeliveryDate;
    @JsonProperty("RequestedDeliveryDate") 
    private String requestedDeliveryDate;
    @JsonProperty("ServiceLevelCode") 
    private String serviceLevelCode;
    @JsonProperty("ShipFromLocationId") 
    private String shipFromLocationId;
    @JsonProperty("ShipThroughLocationId") 
    private String shipThroughLocationId;
    @JsonProperty("ShipToLocationId") 
    private String shipToLocationId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
