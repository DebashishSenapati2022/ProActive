package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EligibleRefundCharges{
    @JsonProperty("OrderLineRefundCharges") 
    private List<OrderLineRefundCharge> orderLineRefundCharges;
}
