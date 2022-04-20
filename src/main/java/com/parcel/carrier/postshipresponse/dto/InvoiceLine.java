package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class InvoiceLine{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AddressId") 
    private String addressId;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentDate") 
    private String fulfillmentDate;
    @JsonProperty("FulfillmentGroupId") 
    private String fulfillmentGroupId;
    @JsonProperty("GiftCardValue") 
    private int giftCardValue;
    @JsonProperty("InvoiceLineChargeDetail") 
    private List<Object> invoiceLineChargeDetail;
    @JsonProperty("InvoiceLineId") 
    private String invoiceLineId;
    @JsonProperty("InvoiceLineSubTotal") 
    private int invoiceLineSubTotal;
    @JsonProperty("InvoiceLineTaxDetail") 
    private List<Object> invoiceLineTaxDetail;
    @JsonProperty("InvoiceLineTotal") 
    private int invoiceLineTotal;
    @JsonProperty("IsRefundGiftCard") 
    private boolean isRefundGiftCard;
    @JsonProperty("IsTaxIncluded") 
    private boolean isTaxIncluded;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrderLineCreatedTimestamp") 
    private String orderLineCreatedTimestamp;
    @JsonProperty("OrderLineId") 
    private String orderLineId;
    @JsonProperty("OrderedItemId") 
    private String orderedItemId;
    @JsonProperty("OrderedQuantity") 
    private int orderedQuantity;
    @JsonProperty("OrderedUOM") 
    private String orderedUOM;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PackageDetail") 
    private List<Object> packageDetail;
    @JsonProperty("PackageDetailId") 
    private String packageDetailId;
    @JsonProperty("ParentLineCreatedTimestamp") 
    private String parentLineCreatedTimestamp;
    @JsonProperty("PaymentGroupId") 
    private String paymentGroupId;
    @JsonProperty("PhysicalOriginId") 
    private String physicalOriginId;
    @JsonProperty("ProductClass") 
    private String productClass;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("ShipFromAddress") 
    private ShipFromAddress shipFromAddress;
    @JsonProperty("ShipFromAddressId") 
    private String shipFromAddressId;
    @JsonProperty("ShipFromLocationId") 
    private String shipFromLocationId;
    @JsonProperty("ShipToAddress") 
    private ShipToAddress shipToAddress;
    @JsonProperty("ShipToLocationId") 
    private String shipToLocationId;
    @JsonProperty("TaxShipFromAddress") 
    private TaxShipFromAddress taxShipFromAddress;
    @JsonProperty("TaxShipFromLocationId") 
    private String taxShipFromLocationId;
    @JsonProperty("TaxableAmount") 
    private int taxableAmount;
    @JsonProperty("TotalCharges") 
    private int totalCharges;
    @JsonProperty("TotalDiscounts") 
    private int totalDiscounts;
    @JsonProperty("TotalInformationalTaxes") 
    private int totalInformationalTaxes;
    @JsonProperty("TotalTaxes") 
    private int totalTaxes;
    @JsonProperty("UOM") 
    private String uOM;
    @JsonProperty("UnitPrice") 
    private int unitPrice;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private List<Object> invoiceLineChargeDetailRequestList;
    private List<Object> invoiceLineTaxDetailRequestList;
    private boolean localize;
    private String rootCause;
}
