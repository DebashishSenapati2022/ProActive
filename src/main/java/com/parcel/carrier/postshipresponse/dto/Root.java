package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Root{
    @JsonProperty("PaymentGatewayRequest") 
    private PaymentGatewayRequest paymentGatewayRequest;
}
