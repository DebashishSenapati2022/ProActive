package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PaymentGatewayRequest{
	
    @JsonProperty("Customer") 
    private Object customer;
    @JsonProperty("CustomerAttribute") 
    private Object customerAttribute;
    @JsonProperty("CustomerId") 
    private String customerId;
    @JsonProperty("EnableVisaMandate2019") 
    private String enableVisaMandate2019;
    @JsonProperty("GatewaySchema") 
    private Object gatewaySchema;
    @JsonProperty("Order") 
    private Object order;
    @JsonProperty("OrderAttribute") 
    private Object orderAttribute;
    @JsonProperty("OrderId") 
    private String orderId;
    @JsonProperty("PaymentGroupId") 
    private String paymentGroupId;
    @JsonProperty("PaymentMethodSchema") 
    private Object paymentMethodSchema;
	
//    @JsonProperty("Customer") 
//    private Customer customer;
//    @JsonProperty("CustomerAttribute") 
//    private CustomerAttribute customerAttribute;
//    @JsonProperty("CustomerId") 
//    private String customerId;
//    @JsonProperty("EnableVisaMandate2019") 
//    private String enableVisaMandate2019;
//    @JsonProperty("GatewaySchema") 
//    private GatewaySchema gatewaySchema;
//    @JsonProperty("Order") 
//    private Order order;
//    @JsonProperty("OrderAttribute") 
//    private OrderAttribute orderAttribute;
//    @JsonProperty("OrderId") 
//    private String orderId;
//    @JsonProperty("PaymentGroupId") 
//    private String paymentGroupId;
//    @JsonProperty("PaymentMethodSchema") 
//    private PaymentMethodSchema paymentMethodSchema;
}
