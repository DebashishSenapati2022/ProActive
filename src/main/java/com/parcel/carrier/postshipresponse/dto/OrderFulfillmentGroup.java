package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderFulfillmentGroup{
    @JsonProperty("GroupId") 
    private String groupId;
    @JsonProperty("Subtotal") 
    private int subtotal;
    @JsonProperty("Total") 
    private int total;
    @JsonProperty("TotalChargesReturnFee") 
    private int totalChargesReturnFee;
    @JsonProperty("TotalChargesReturnShipping") 
    private int totalChargesReturnShipping;
    @JsonProperty("TotalChargesShipping") 
    private int totalChargesShipping;
    @JsonProperty("TotalChargesVAS") 
    private int totalChargesVAS;
    @JsonProperty("TotalDiscountOnItem") 
    private int totalDiscountOnItem;
    @JsonProperty("TotalDiscountShipping") 
    private int totalDiscountShipping;
    @JsonProperty("TotalInformationalTaxes") 
    private int totalInformationalTaxes;
    @JsonProperty("TotalTaxes") 
    private int totalTaxes;
}
