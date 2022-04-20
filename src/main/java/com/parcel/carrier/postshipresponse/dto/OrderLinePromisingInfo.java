package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLinePromisingInfo{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AsnDetailId") 
    private String asnDetailId;
    @JsonProperty("AsnId") 
    private String asnId;
    @JsonProperty("BatchNumber") 
    private String batchNumber;
    @JsonProperty("ConsolidatationLocationId") 
    private String consolidatationLocationId;
    @JsonProperty("CountryOfOrigin") 
    private String countryOfOrigin;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExternalRouteId") 
    private String externalRouteId;
    @JsonProperty("InventorySegmentId") 
    private String inventorySegmentId;
    @JsonProperty("InventoryTypeId") 
    private String inventoryTypeId;
    @JsonProperty("IsForceAllocate") 
    private boolean isForceAllocate;
    @JsonProperty("ItemAttribute1") 
    private String itemAttribute1;
    @JsonProperty("ItemAttribute2") 
    private String itemAttribute2;
    @JsonProperty("ItemAttribute3") 
    private String itemAttribute3;
    @JsonProperty("ItemAttribute4") 
    private String itemAttribute4;
    @JsonProperty("ItemAttribute5") 
    private String itemAttribute5;
    @JsonProperty("LastPossibleDeliveryDate") 
    private String lastPossibleDeliveryDate;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PoDetailId") 
    private String poDetailId;
    @JsonProperty("PoId") 
    private String poId;
    @JsonProperty("ProductStatusId") 
    private String productStatusId;
    @JsonProperty("ReqCapacityPerUnit") 
    private int reqCapacityPerUnit;
    @JsonProperty("ShipFromLocationId") 
    private String shipFromLocationId;
    @JsonProperty("ShipThroughLocationId") 
    private String shipThroughLocationId;
    @JsonProperty("StrategyType") 
    private StrategyType strategyType;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
