package com.parcel.carrier.postshipresponse.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class InvoiceLineRequestList{
    private String addressId;
    private String fulfillmentGroupId;
    private int giftCardValue;
    private List<Object> invoiceLineChargeDetailRequestList;
    private int invoiceLineSubTotal;
    private List<Object> invoiceLineTaxDetailRequestList;
    private int invoiceLineTotal;
    private boolean isRefundGiftCard;
    private boolean isTaxIncluded;
    private String itemId;
    private Date orderLineCreatedTimestamp;
    private String orderLineId;
    private String orderedItemId;
    private int orderedQuantity;
    private String orderedUOM;
    private String packageDetailId;
    private Date parentLineCreatedTimestamp;
    private String paymentGroupId;
    private String physicalOriginId;
    private String productClass;
    private int quantity;
    private String shipFromAddressId;
    private String shipFromLocationId;
    private String shipToLocationId;
    private String taxShipFromLocationId;
    private int totalCharges;
    private int totalDiscounts;
    private int totalTaxes;
    private int unitPrice;
    private String uom;
}
