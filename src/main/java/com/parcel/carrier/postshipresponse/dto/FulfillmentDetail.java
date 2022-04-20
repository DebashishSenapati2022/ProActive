package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FulfillmentDetail{
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
    @JsonProperty("Eta") 
    private String eta;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentDate") 
    private String fulfillmentDate;
    @JsonProperty("FulfillmentDetailId") 
    private String fulfillmentDetailId;
    @JsonProperty("FulfillmentId") 
    private String fulfillmentId;
    @JsonProperty("GcNumber") 
    private String gcNumber;
    @JsonProperty("GcPIN") 
    private String gcPIN;
    @JsonProperty("GiftCardNumber") 
    private String giftCardNumber;
    @JsonProperty("GiftCardPIN") 
    private String giftCardPIN;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PackageDetailId") 
    private String packageDetailId;
    @JsonProperty("PackageId") 
    private String packageId;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("ReleaseId") 
    private String releaseId;
    @JsonProperty("ReleaseLineId") 
    private String releaseLineId;
    @JsonProperty("ReturnTrackingNumber") 
    private String returnTrackingNumber;
    @JsonProperty("SerialNumber") 
    private String serialNumber;
    @JsonProperty("ServiceLevelCode") 
    private String serviceLevelCode;
    @JsonProperty("ShipViaId") 
    private String shipViaId;
    @JsonProperty("ShipmentId") 
    private String shipmentId;
    @JsonProperty("StatusId") 
    private String statusId;
    @JsonProperty("TrackingNumber") 
    private String trackingNumber;
    @JsonProperty("TrackingURL") 
    private String trackingURL;
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
