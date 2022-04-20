package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Allocation{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AllocatedOn") 
    private String allocatedOn;
    @JsonProperty("AllocationDependencyId") 
    private String allocationDependencyId;
    @JsonProperty("AllocationId") 
    private String allocationId;
    @JsonProperty("AllocationType") 
    private String allocationType;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("AsnDetailId") 
    private String asnDetailId;
    @JsonProperty("AsnId") 
    private String asnId;
    @JsonProperty("BatchNumber") 
    private String batchNumber;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CarrierCode") 
    private String carrierCode;
    @JsonProperty("CommittedDeliveryDate") 
    private String committedDeliveryDate;
    @JsonProperty("CommittedShipDate") 
    private String committedShipDate;
    @JsonProperty("CountryOfOrigin") 
    private String countryOfOrigin;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("EarliestDeliveryDate") 
    private String earliestDeliveryDate;
    @JsonProperty("EarliestShipDate") 
    private String earliestShipDate;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("GroupId") 
    private String groupId;
    @JsonProperty("HeuristicDeliveryDate") 
    private String heuristicDeliveryDate;
    @JsonProperty("HeuristicShipDate") 
    private String heuristicShipDate;
    @JsonProperty("InventoryAttribute1") 
    private String inventoryAttribute1;
    @JsonProperty("InventoryAttribute2") 
    private String inventoryAttribute2;
    @JsonProperty("InventoryAttribute3") 
    private String inventoryAttribute3;
    @JsonProperty("InventoryAttribute4") 
    private String inventoryAttribute4;
    @JsonProperty("InventoryAttribute5") 
    private String inventoryAttribute5;
    @JsonProperty("InventorySegmentId") 
    private String inventorySegmentId;
    @JsonProperty("InventoryTypeId") 
    private String inventoryTypeId;
    @JsonProperty("IsVirtual") 
    private boolean isVirtual;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LatestReleaseDate") 
    private String latestReleaseDate;
    @JsonProperty("LatestShipDate") 
    private String latestShipDate;
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
    @JsonProperty("PredictedDeliveryDate") 
    private String predictedDeliveryDate;
    @JsonProperty("PredictedShipDate") 
    private String predictedShipDate;
    @JsonProperty("ProductStatusId") 
    private String productStatusId;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("ReservationRequestDetailId") 
    private String reservationRequestDetailId;
    @JsonProperty("ReservationRequestId") 
    private String reservationRequestId;
    @JsonProperty("ServiceLevelCode") 
    private String serviceLevelCode;
    @JsonProperty("ShipFromLocationId") 
    private String shipFromLocationId;
    @JsonProperty("ShipToLocationId") 
    private String shipToLocationId;
    @JsonProperty("ShipViaId") 
    private String shipViaId;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("SubstitutionRatio") 
    private int substitutionRatio;
    @JsonProperty("SubstitutionTypeId") 
    private String substitutionTypeId;
    @JsonProperty("UOM") 
    private String uOM;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
