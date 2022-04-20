package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderAdditionalAttribute{
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
    @JsonProperty("FiscalInvoiceDoubleCheckStatus") 
    private String fiscalInvoiceDoubleCheckStatus;
    @JsonProperty("FiscalInvoiceId") 
    private String fiscalInvoiceId;
    @JsonProperty("FiscalInvoiceKeyId") 
    private String fiscalInvoiceKeyId;
    @JsonProperty("FiscalInvoiceSignature") 
    private String fiscalInvoiceSignature;
    @JsonProperty("GttAbsolute") 
    private int gttAbsolute;
    @JsonProperty("GttReal") 
    private int gttReal;
    @JsonProperty("GttSignature") 
    private String gttSignature;
    @JsonProperty("KeyId") 
    private String keyId;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NewRawFiscalInvoiceSignature") 
    private String newRawFiscalInvoiceSignature;
    @JsonProperty("NewRawTicketSignature") 
    private String newRawTicketSignature;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("RawFiscalInvoiceSignature") 
    private String rawFiscalInvoiceSignature;
    @JsonProperty("RawGttSignature") 
    private String rawGttSignature;
    @JsonProperty("RawTicketSignature") 
    private String rawTicketSignature;
    @JsonProperty("TicketDoubleCheckStatus") 
    private String ticketDoubleCheckStatus;
    @JsonProperty("TicketId") 
    private String ticketId;
    @JsonProperty("TicketSignature") 
    private String ticketSignature;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
