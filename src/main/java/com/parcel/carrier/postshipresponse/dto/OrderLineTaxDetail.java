package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLineTaxDetail{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentGroupId") 
    private String fulfillmentGroupId;
    @JsonProperty("HeaderTaxDetailId") 
    private String headerTaxDetailId;
    @JsonProperty("IsInformational") 
    private boolean isInformational;
    @JsonProperty("IsInvoiceTax") 
    private boolean isInvoiceTax;
    @JsonProperty("Jurisdiction") 
    private String jurisdiction;
    @JsonProperty("JurisdictionTypeId") 
    private String jurisdictionTypeId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("RateTypeWithJurisdictionInfo") 
    private String rateTypeWithJurisdictionInfo;
    @JsonProperty("TaxAmount") 
    private int taxAmount;
    @JsonProperty("TaxCode") 
    private String taxCode;
    @JsonProperty("TaxDate") 
    private String taxDate;
    @JsonProperty("TaxDetailId") 
    private String taxDetailId;
    @JsonProperty("TaxEngineId") 
    private String taxEngineId;
    @JsonProperty("TaxIdentifier") 
    private String taxIdentifier;
    @JsonProperty("TaxIdentifier1") 
    private String taxIdentifier1;
    @JsonProperty("TaxIdentifier2") 
    private String taxIdentifier2;
    @JsonProperty("TaxIdentifier3") 
    private String taxIdentifier3;
    @JsonProperty("TaxIdentifier4") 
    private String taxIdentifier4;
    @JsonProperty("TaxIdentifier5") 
    private String taxIdentifier5;
    @JsonProperty("TaxRate") 
    private int taxRate;
    @JsonProperty("TaxRatePercent") 
    private String taxRatePercent;
    @JsonProperty("TaxTypeId") 
    private String taxTypeId;
    @JsonProperty("TaxableAmount") 
    private int taxableAmount;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("VatTaxCode") 
    private String vatTaxCode;
    private String entityName;
    private boolean lineTax;
    private boolean localize;
    private String rootCause;
}
