package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Customer{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("ActivationHistory") 
    private List<ActivationHistory> activationHistory;
    @JsonProperty("ActivationReasonId") 
    private ActivationReasonId activationReasonId;
    @JsonProperty("AnniversaryDate") 
    private String anniversaryDate;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("Birthday") 
    private String birthday;
    @JsonProperty("BusinessName") 
    private String businessName;
    @JsonProperty("BusinessTaxId") 
    private String businessTaxId;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerAddress") 
    private List<CustomerAddress> customerAddress;
    @JsonProperty("CustomerAlternateId") 
    private List<CustomerAlternateId> customerAlternateId;
    @JsonProperty("CustomerAttribute") 
    private List<CustomerAttribute> customerAttribute;
    @JsonProperty("CustomerCommPref") 
    private List<CustomerCommPref> customerCommPref;
    @JsonProperty("CustomerContact") 
    private List<CustomerContact> customerContact;
    @JsonProperty("CustomerExtension1") 
    private List<CustomerExtension1> customerExtension1;
    @JsonProperty("CustomerId") 
    private String customerId;
    @JsonProperty("CustomerPaymentMethod") 
    private List<CustomerPaymentMethod> customerPaymentMethod;
    @JsonProperty("CustomerPreferences") 
    private CustomerPreferences customerPreferences;
    @JsonProperty("CustomerSinceDate") 
    private String customerSinceDate;
    @JsonProperty("CustomerType") 
    private String customerType;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("EmployeeId") 
    private String employeeId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("ExternalCreatedDate") 
    private String externalCreatedDate;
    @JsonProperty("ExternalLastUpdatedDate") 
    private String externalLastUpdatedDate;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("Gender") 
    private String gender;
    @JsonProperty("IsActive") 
    private boolean isActive;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("LoyaltyNumber") 
    private String loyaltyNumber;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("Notes") 
    private String notes;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("Phone") 
    private String phone;
    @JsonProperty("PhoneCountryId") 
    private String phoneCountryId;
    @JsonProperty("PhoneWithoutPrefix") 
    private String phoneWithoutPrefix;
    @JsonProperty("ProfileId") 
    private String profileId;
    @JsonProperty("SocialAccount") 
    private List<SocialAccount> socialAccount;
    @JsonProperty("Status") 
    private Status status;
    @JsonProperty("TaxExemptId") 
    private String taxExemptId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("VirtualAssistant") 
    private List<VirtualAssistant> virtualAssistant;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
