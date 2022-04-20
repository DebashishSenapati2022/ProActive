package com.parcel.carrier.postshipresponse.dto;

import lombok.Data;

@Data
public class InvoiceChargeDetaiRequestList{
    private String chargeDetailId;
    private String chargeDisplayName;
    private int chargePercent;
    private String chargeReferenceId;
    private int chargeSequence;
    private int chargeTotal;
    private String chargeType;
    private String comments;
    private String discountOn;
    private Extended extended;
    private String fulfillmentGroupId;
    private boolean isInformational;
    private boolean isOverridden;
    private boolean isProrated;
    private boolean isProratedAtSameLevel;
    private boolean isReturnCharge;
    private boolean isTaxIncluded;
    private String orderChargeDetailId;
    private int originalChargeAmount;
    private String parentChargeDetailId;
    private String reason;
    private String relatedChargeDetailId;
    private String relatedChargeType;
    private int requestedAmount;
    private String taxCode;
}
