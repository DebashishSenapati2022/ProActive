package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderTrackingInfo{
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
    @JsonProperty("DeliveredDate") 
    private String deliveredDate;
    @JsonProperty("EstimatedDeliveryDate") 
    private String estimatedDeliveryDate;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("LatestEvent") 
    private LatestEvent latestEvent;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("Order") 
    private Order order;
    @JsonProperty("OrderLine") 
    private List<OrderLine> orderLine;
    @JsonProperty("OrderTrackingDetail") 
    private List<OrderTrackingDetail> orderTrackingDetail;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PackageStatus") 
    private PackageStatus packageStatus;
    @JsonProperty("ScheduledDate") 
    private String scheduledDate;
    @JsonProperty("ShippedDate") 
    private String shippedDate;
    @JsonProperty("TrackingNumber") 
    private String trackingNumber;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
