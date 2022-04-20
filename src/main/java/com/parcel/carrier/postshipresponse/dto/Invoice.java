package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Invoice{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerId") 
    private String customerId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentDate") 
    private String fulfillmentDate;
    @JsonProperty("InvoiceAdditional") 
    private InvoiceAdditional invoiceAdditional;
    @JsonProperty("InvoiceChargeDetail") 
    private List<InvoiceChargeDetail> invoiceChargeDetail;
    @JsonProperty("InvoiceId") 
    private String invoiceId;
    @JsonProperty("InvoiceLine") 
    private List<InvoiceLine> invoiceLine;
    @JsonProperty("InvoiceSubTotal") 
    private int invoiceSubTotal;
    @JsonProperty("InvoiceTaxDetail") 
    private List<InvoiceTaxDetail> invoiceTaxDetail;
    @JsonProperty("InvoiceTotal") 
    private int invoiceTotal;
    @JsonProperty("InvoiceType") 
    private InvoiceType invoiceType;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PackageId") 
    private String packageId;
    @JsonProperty("ParentOrderId") 
    private String parentOrderId;
    @JsonProperty("PublishStatus") 
    private PublishStatus publishStatus;
    @JsonProperty("SellingLocationId") 
    private String sellingLocationId;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("TaxExemptId") 
    private String taxExemptId;
    @JsonProperty("TotalCharges") 
    private int totalCharges;
    @JsonProperty("TotalDiscounts") 
    private int totalDiscounts;
    @JsonProperty("TotalInformationalTaxes") 
    private int totalInformationalTaxes;
    @JsonProperty("TotalTaxes") 
    private int totalTaxes;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private List<InvoiceChargeDetaiRequestList> invoiceChargeDetaiRequestList;
    private List<InvoiceLineRequestList> invoiceLineRequestList;
    private List<InvoiceTaxDetaiRequestList> invoiceTaxDetaiRequestList;
    private String invoiceTypeId;
    private boolean localize;
    private String rootCause;
}
