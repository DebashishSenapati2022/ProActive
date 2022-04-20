package com.parcel.carrier.postshipresponse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.parcel.carrier.postshipresponse.dto.PaymentGatewayRequest;
import com.parcel.carrier.postshipresponse.dto.RequestPayload;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PostShipResponseController {
	
	@PostMapping("/send")
	public String postData(@RequestBody RequestPayload carrierData) {
		
		PaymentGatewayRequest paymentGatewayRequest= carrierData.getPaymentGatewayRequest();
		
		log.info("customer ID from controller is {}",paymentGatewayRequest.getCustomerId());
		log.info("EnableVisaMandate2019 ID from controller is {}",paymentGatewayRequest.getEnableVisaMandate2019());
		log.info("Order ID from controller is {}",paymentGatewayRequest.getOrderId());
		log.info("PaymentGroup ID from controller is {}",paymentGatewayRequest.getPaymentGroupId());
		log.info("Parcel object............. :: {}", new Gson().toJson(paymentGatewayRequest));
		
		return "SUCCESS";
	}

}
