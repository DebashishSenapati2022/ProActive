package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PaymentTransactionEMVTags{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CardEntryMode") 
    private String cardEntryMode;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("Emv4F") 
    private String emv4F;
    @JsonProperty("Emv50") 
    private String emv50;
    @JsonProperty("Emv5F2A") 
    private String emv5F2A;
    @JsonProperty("Emv5F34") 
    private String emv5F34;
    @JsonProperty("Emv82") 
    private String emv82;
    @JsonProperty("Emv84") 
    private String emv84;
    @JsonProperty("Emv8A") 
    private String emv8A;
    @JsonProperty("Emv95") 
    private String emv95;
    @JsonProperty("Emv9A") 
    private String emv9A;
    @JsonProperty("Emv9B") 
    private String emv9B;
    @JsonProperty("Emv9C") 
    private String emv9C;
    @JsonProperty("Emv9F02") 
    private String emv9F02;
    @JsonProperty("Emv9F03") 
    private String emv9F03;
    @JsonProperty("Emv9F06") 
    private String emv9F06;
    @JsonProperty("Emv9F07") 
    private String emv9F07;
    @JsonProperty("Emv9F08") 
    private String emv9F08;
    @JsonProperty("Emv9F09") 
    private String emv9F09;
    @JsonProperty("Emv9F0D") 
    private String emv9F0D;
    @JsonProperty("Emv9F0E") 
    private String emv9F0E;
    @JsonProperty("Emv9F0F") 
    private String emv9F0F;
    @JsonProperty("Emv9F10") 
    private String emv9F10;
    @JsonProperty("Emv9F11") 
    private String emv9F11;
    @JsonProperty("Emv9F12") 
    private String emv9F12;
    @JsonProperty("Emv9F1A") 
    private String emv9F1A;
    @JsonProperty("Emv9F1E") 
    private String emv9F1E;
    @JsonProperty("Emv9F21") 
    private String emv9F21;
    @JsonProperty("Emv9F26") 
    private String emv9F26;
    @JsonProperty("Emv9F27") 
    private String emv9F27;
    @JsonProperty("Emv9F33") 
    private String emv9F33;
    @JsonProperty("Emv9F34") 
    private String emv9F34;
    @JsonProperty("Emv9F35") 
    private String emv9F35;
    @JsonProperty("Emv9F36") 
    private String emv9F36;
    @JsonProperty("Emv9F37") 
    private String emv9F37;
    @JsonProperty("Emv9F39") 
    private String emv9F39;
    @JsonProperty("Emv9F41") 
    private String emv9F41;
    @JsonProperty("EmvChipIndicator") 
    private String emvChipIndicator;
    @JsonProperty("EmvCvm") 
    private String emvCvm;
    @JsonProperty("EmvMode") 
    private String emvMode;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IssuerScriptResults") 
    private String issuerScriptResults;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("MerchId") 
    private String merchId;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PurgeDate") 
    private String purgeDate;
    @JsonProperty("RefNumber") 
    private String refNumber;
    @JsonProperty("TacDefault") 
    private String tacDefault;
    @JsonProperty("TacDenial") 
    private String tacDenial;
    @JsonProperty("TacOnline") 
    private String tacOnline;
    @JsonProperty("TermId") 
    private String termId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("ValidationCode") 
    private String validationCode;
    @JsonProperty("VisaIdentifier") 
    private String visaIdentifier;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
