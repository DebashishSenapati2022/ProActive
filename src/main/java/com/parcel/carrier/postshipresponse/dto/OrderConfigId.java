package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderConfigId{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("CancelUnallocatedUnits") 
    private boolean cancelUnallocatedUnits;
    @JsonProperty("ChangeDeliveryMethodOnShort") 
    private boolean changeDeliveryMethodOnShort;
    @JsonProperty("ChargeTypeConfig") 
    private List<ChargeTypeConfig> chargeTypeConfig;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DaysToArchive") 
    private int daysToArchive;
    @JsonProperty("DemandTypeId") 
    private String demandTypeId;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("EjTemplateId") 
    private String ejTemplateId;
    @JsonProperty("EnableFiscal") 
    private boolean enableFiscal;
    @JsonProperty("EventPublishingConfig") 
    private List<EventPublishingConfig> eventPublishingConfig;
    @JsonProperty("ExcludeOpenInvoicesForSeqInvoiceId") 
    private boolean excludeOpenInvoicesForSeqInvoiceId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExtendedDaysToArchive") 
    private int extendedDaysToArchive;
    @JsonProperty("GenerateSeqInvoiceId") 
    private boolean generateSeqInvoiceId;
    @JsonProperty("ImmediatePublishSalesPosting") 
    private boolean immediatePublishSalesPosting;
    @JsonProperty("InvoiceConfig") 
    private List<InvoiceConfig> invoiceConfig;
    @JsonProperty("InvoiceNextUpConfig") 
    private List<InvoiceNextUpConfig> invoiceNextUpConfig;
    @JsonProperty("IsLineLevelAllocation") 
    private boolean isLineLevelAllocation;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("ModTypeConfig") 
    private List<ModTypeConfig> modTypeConfig;
    @JsonProperty("OrderConfigId") 
    private String orderConfigId;
    @JsonProperty("OrderLineTemplateId") 
    private String orderLineTemplateId;
    @JsonProperty("OrderTaxConfig") 
    private OrderTaxConfig orderTaxConfig;
    @JsonProperty("OrderTemplateId") 
    private String orderTemplateId;
    @JsonProperty("OverageAllowed") 
    private boolean overageAllowed;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ProcessPaymentImmediately") 
    private boolean processPaymentImmediately;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("PublishAllInvoice") 
    private boolean publishAllInvoice;
    @JsonProperty("PublishEJ") 
    private boolean publishEJ;
    @JsonProperty("PublishingFormat") 
    private PublishingFormat publishingFormat;
    @JsonProperty("RePriceEvenExchanges") 
    private boolean rePriceEvenExchanges;
    @JsonProperty("ReallocateOnShort") 
    private boolean reallocateOnShort;
    @JsonProperty("RequirePayment") 
    private boolean requirePayment;
    @JsonProperty("RequirePrice") 
    private boolean requirePrice;
    @JsonProperty("RequireSnh") 
    private boolean requireSnh;
    @JsonProperty("RequireTax") 
    private boolean requireTax;
    @JsonProperty("ReturnConfig") 
    private ReturnConfig returnConfig;
    @JsonProperty("ReturnFeeConfig") 
    private List<ReturnFeeConfig> returnFeeConfig;
    @JsonProperty("SalesPostingTemplateId") 
    private String salesPostingTemplateId;
    @JsonProperty("ShortenUrlService") 
    private boolean shortenUrlService;
    @JsonProperty("TrackDelivery") 
    private boolean trackDelivery;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
