package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LineProcessInfo{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BatchRequirementType") 
    private String batchRequirementType;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CriticalDimension1") 
    private int criticalDimension1;
    @JsonProperty("CriticalDimension2") 
    private int criticalDimension2;
    @JsonProperty("CriticalDimension3") 
    private int criticalDimension3;
    @JsonProperty("CubeMultipleQty") 
    private int cubeMultipleQty;
    @JsonProperty("DeliveryReferenceNumber") 
    private String deliveryReferenceNumber;
    @JsonProperty("ExportInfoCode") 
    private String exportInfoCode;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsSerialNumberRequired") 
    private boolean isSerialNumberRequired;
    @JsonProperty("ItemBreakAttribute") 
    private String itemBreakAttribute;
    @JsonProperty("ItemPrice") 
    private int itemPrice;
    @JsonProperty("LPNBreakAttribute") 
    private String lPNBreakAttribute;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PickLocAssignmentType") 
    private String pickLocAssignmentType;
    @JsonProperty("PickTicketControlNumber") 
    private String pickTicketControlNumber;
    @JsonProperty("PickUpReferenceNumber") 
    private String pickUpReferenceNumber;
    @JsonProperty("Price") 
    private int price;
    @JsonProperty("PriceTicketType") 
    private String priceTicketType;
    @JsonProperty("SingleUnit") 
    private boolean singleUnit;
    @JsonProperty("UnitVolume") 
    private int unitVolume;
    @JsonProperty("UnitWeight") 
    private int unitWeight;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("VASProcessType") 
    private String vASProcessType;
    @JsonProperty("WaveProcessType") 
    private String waveProcessType;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
