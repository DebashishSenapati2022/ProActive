package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerPaymentMethod{
    @JsonProperty("AccountDisplayNumber") 
    private String accountDisplayNumber;
    @JsonProperty("AccountNumber") 
    private String accountNumber;
    @JsonProperty("AccountTypeId") 
    private String accountTypeId;
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BillingAddressId") 
    private String billingAddressId;
    @JsonProperty("BusinessName") 
    private String businessName;
    @JsonProperty("BusinessTaxId") 
    private String businessTaxId;
    @JsonProperty("CardExpiryMonth") 
    private String cardExpiryMonth;
    @JsonProperty("CardExpiryYear") 
    private String cardExpiryYear;
    @JsonProperty("CardType") 
    private String cardType;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("DriversLicenseCountry") 
    private String driversLicenseCountry;
    @JsonProperty("DriversLicenseNumber") 
    private String driversLicenseNumber;
    @JsonProperty("DriversLicenseState") 
    private String driversLicenseState;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("IsPreferred") 
    private boolean isPreferred;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("NameOnCard") 
    private String nameOnCard;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PaymentMethodId") 
    private String paymentMethodId;
    @JsonProperty("PaymentMethodType") 
    private String paymentMethodType;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("RoutingDisplayNumber") 
    private String routingDisplayNumber;
    @JsonProperty("RoutingNumber") 
    private String routingNumber;
    @JsonProperty("SwipeData") 
    private String swipeData;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
