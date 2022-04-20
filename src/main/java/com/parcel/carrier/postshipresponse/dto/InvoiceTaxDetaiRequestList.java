package com.parcel.carrier.postshipresponse.dto;

import java.util.Date;

import lombok.Data;

@Data
public class InvoiceTaxDetaiRequestList{
    private String fulfillmentGroupId;
    private boolean isInformational;
    private boolean isProrated;
    private String jurisdiction;
    private String jurisdictionTypeId;
    private int taxAmount;
    private String taxCode;
    private Date taxDate;
    private String taxDetailId;
    private String taxEngineId;
    private String taxIdentifier1;
    private String taxIdentifier2;
    private String taxIdentifier3;
    private String taxIdentifier4;
    private String taxIdentifier5;
    private int taxRate;
    private String taxTypeId;
    private int taxableAmount;
}
