package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PaymentMethodSchema{
    @JsonProperty("AccountDisplayNumber") 
    private String accountDisplayNumber;
    @JsonProperty("AccountNumber") 
    private String accountNumber;
    @JsonProperty("AccountType") 
    private AccountType accountType;
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AlternateCurrencyAmount") 
    private int alternateCurrencyAmount;
    @JsonProperty("AlternateCurrencyCode") 
    private String alternateCurrencyCode;
    @JsonProperty("Amount") 
    private int amount;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BillingAddress") 
    private BillingAddress billingAddress;
    @JsonProperty("BusinessName") 
    private String businessName;
    @JsonProperty("BusinessTaxId") 
    private String businessTaxId;
    @JsonProperty("CapturedInEdgeMode") 
    private boolean capturedInEdgeMode;
    @JsonProperty("CardExpiryMonth") 
    private String cardExpiryMonth;
    @JsonProperty("CardExpiryYear") 
    private String cardExpiryYear;
    @JsonProperty("CardType") 
    private CardType cardType;
    @JsonProperty("CardTypeId") 
    private String cardTypeId;
    @JsonProperty("ChangeAmount") 
    private int changeAmount;
    @JsonProperty("ChargeSequence") 
    private int chargeSequence;
    @JsonProperty("CheckNumber") 
    private String checkNumber;
    @JsonProperty("CheckQuantity") 
    private int checkQuantity;
    @JsonProperty("ConversionRate") 
    private int conversionRate;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CurrencyCode") 
    private String currencyCode;
    @JsonProperty("CustomerPaySignature") 
    private String customerPaySignature;
    @JsonProperty("CustomerSignature") 
    private String customerSignature;
    @JsonProperty("DriversLicenseCountry") 
    private String driversLicenseCountry;
    @JsonProperty("DriversLicenseNumber") 
    private String driversLicenseNumber;
    @JsonProperty("DriversLicenseState") 
    private String driversLicenseState;
    @JsonProperty("EntryTypeId") 
    private String entryTypeId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("GatewayAccountId") 
    private String gatewayAccountId;
    @JsonProperty("GatewayId") 
    private String gatewayId;
    @JsonProperty("GiftCardPin") 
    private String giftCardPin;
    @JsonProperty("IsCopied") 
    private boolean isCopied;
    @JsonProperty("IsSuspended") 
    private boolean isSuspended;
    @JsonProperty("IsVoided") 
    private boolean isVoided;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("LocationId") 
    private String locationId;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NameOnCard") 
    private String nameOnCard;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentOrderId") 
    private String parentOrderId;
    @JsonProperty("ParentOrderPaymentMethod") 
    private List<ParentOrderPaymentMethod> parentOrderPaymentMethod;
    @JsonProperty("ParentPaymentGroupId") 
    private String parentPaymentGroupId;
    @JsonProperty("ParentPaymentMethodId") 
    private String parentPaymentMethodId;
    @JsonProperty("PaymentMethodAttribute") 
    private List<PaymentMethodAttribute> paymentMethodAttribute;
    @JsonProperty("PaymentMethodEncrAttribute") 
    private List<PaymentMethodEncrAttribute> paymentMethodEncrAttribute;
    @JsonProperty("PaymentMethodId") 
    private String paymentMethodId;
    @JsonProperty("PaymentTransaction") 
    private List<PaymentTransaction> paymentTransaction;
    @JsonProperty("PaymentType") 
    private PaymentType paymentType;
    @JsonProperty("PurgeDate") 
    private String purgeDate;
    @JsonProperty("RoutingDisplayNumber") 
    private String routingDisplayNumber;
    @JsonProperty("RoutingNumber") 
    private String routingNumber;
    @JsonProperty("SecurityCode") 
    private String securityCode;
    @JsonProperty("SwipeData") 
    private String swipeData;
    @JsonProperty("TransactionReferenceId") 
    private String transactionReferenceId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
