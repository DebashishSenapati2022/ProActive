package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Order{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AlternateOrderId") 
    private String alternateOrderId;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BalanceDue") 
    private int balanceDue;
    @JsonProperty("BouncebackCouponDetail") 
    private List<BouncebackCouponDetail> bouncebackCouponDetail;
    @JsonProperty("BusinessDate") 
    private String businessDate;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CancelComments") 
    private String cancelComments;
    @JsonProperty("CancelReason") 
    private CancelReason cancelReason;
    @JsonProperty("CapturedDate") 
    private String capturedDate;
    @JsonProperty("ChangeLog") 
    private ChangeLog changeLog;
    @JsonProperty("CollectedAmount") 
    private int collectedAmount;
    @JsonProperty("ConfirmedDate") 
    private String confirmedDate;
    @JsonProperty("ContactPreference") 
    private List<ContactPreference> contactPreference;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CurrencyCode") 
    private String currencyCode;
    @JsonProperty("CustomerAddress") 
    private CustomerAddress customerAddress;
    @JsonProperty("CustomerCommPref") 
    private List<CustomerCommPref> customerCommPref;
    @JsonProperty("CustomerEmail") 
    private String customerEmail;
    @JsonProperty("CustomerFirstName") 
    private String customerFirstName;
    @JsonProperty("CustomerId") 
    private String customerId;
    @JsonProperty("CustomerIdentityDoc") 
    private List<CustomerIdentityDoc> customerIdentityDoc;
    @JsonProperty("CustomerLastName") 
    private String customerLastName;
    @JsonProperty("CustomerPhone") 
    private String customerPhone;
    @JsonProperty("CustomerPhoneCountryId") 
    private String customerPhoneCountryId;
    @JsonProperty("CustomerPhoneWithoutPrefix") 
    private String customerPhoneWithoutPrefix;
    @JsonProperty("CustomerSignature") 
    private String customerSignature;
    @JsonProperty("CustomerTypeId") 
    private String customerTypeId;
    @JsonProperty("DoNotReleaseBefore") 
    private String doNotReleaseBefore;
    @JsonProperty("DocType") 
    private DocType docType;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentStatus") 
    private String fulfillmentStatus;
    @JsonProperty("Invoice") 
    private List<Invoice> invoice;
    @JsonProperty("IsCancelled") 
    private boolean isCancelled;
    @JsonProperty("IsCapturedOffline") 
    private boolean isCapturedOffline;
    @JsonProperty("IsConfirmed") 
    private boolean isConfirmed;
    @JsonProperty("IsOnHold") 
    private boolean isOnHold;
    @JsonProperty("IsPostVoided") 
    private boolean isPostVoided;
    @JsonProperty("IsReadyForTender") 
    private boolean isReadyForTender;
    @JsonProperty("IsTaxExempt") 
    private boolean isTaxExempt;
    @JsonProperty("IsTaxOverridden") 
    private boolean isTaxOverridden;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("LoyaltyNumber") 
    private String loyaltyNumber;
    @JsonProperty("ManagerAuthDetail") 
    private List<ManagerAuthDetail> managerAuthDetail;
    @JsonProperty("MaxAppeasementAmount") 
    private int maxAppeasementAmount;
    @JsonProperty("MaxFulfillmentStatus") 
    private MaxFulfillmentStatus maxFulfillmentStatus;
    @JsonProperty("MaxReturnStatus") 
    private MaxReturnStatus maxReturnStatus;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("MinFulfillmentStatus") 
    private MinFulfillmentStatus minFulfillmentStatus;
    @JsonProperty("MinReturnStatus") 
    private MinReturnStatus minReturnStatus;
    @JsonProperty("OrderActions") 
    private OrderActions orderActions;
    @JsonProperty("OrderAdditionalAttribute") 
    private OrderAdditionalAttribute orderAdditionalAttribute;
    @JsonProperty("OrderAttribute") 
    private List<OrderAttribute> orderAttribute;
    @JsonProperty("OrderCaptureConfig") 
    private OrderCaptureConfig orderCaptureConfig;
    @JsonProperty("OrderCaptureDetail") 
    private List<OrderCaptureDetail> orderCaptureDetail;
    @JsonProperty("OrderChargeDetail") 
    private List<OrderChargeDetail> orderChargeDetail;
    @JsonProperty("OrderExtension1") 
    private OrderExtension1 orderExtension1;
    @JsonProperty("OrderExtension2") 
    private List<OrderExtension2> orderExtension2;
    @JsonProperty("OrderExtension3") 
    private List<OrderExtension3> orderExtension3;
    @JsonProperty("OrderExtension4") 
    private List<OrderExtension4> orderExtension4;
    @JsonProperty("OrderExtension5") 
    private List<OrderExtension5> orderExtension5;
    @JsonProperty("OrderFulfillmentGroups") 
    private List<OrderFulfillmentGroup> orderFulfillmentGroups;
    @JsonProperty("OrderHold") 
    private List<OrderHold> orderHold;
    @JsonProperty("OrderId") 
    private String orderId;
    @JsonProperty("OrderLine") 
    private List<OrderLine> orderLine;
    @JsonProperty("OrderLocale") 
    private String orderLocale;
    @JsonProperty("OrderMilestone") 
    private List<OrderMilestone> orderMilestone;
    @JsonProperty("OrderMilestoneEvent") 
    private List<OrderMilestoneEvent> orderMilestoneEvent;
    @JsonProperty("OrderNote") 
    private List<OrderNote> orderNote;
    @JsonProperty("OrderPaymentMethod") 
    private List<OrderPaymentMethod> orderPaymentMethod;
    @JsonProperty("OrderPromisingInfo") 
    private OrderPromisingInfo orderPromisingInfo;
    @JsonProperty("OrderPromotionRequest") 
    private List<OrderPromotionRequest> orderPromotionRequest;
    @JsonProperty("OrderSalesAssociate") 
    private List<OrderSalesAssociate> orderSalesAssociate;
    @JsonProperty("OrderSummaryCharges") 
    private List<OrderSummaryCharge> orderSummaryCharges;
    @JsonProperty("OrderTagDetail") 
    private List<OrderTagDetail> orderTagDetail;
    @JsonProperty("OrderTaxDetail") 
    private List<OrderTaxDetail> orderTaxDetail;
    @JsonProperty("OrderTrackingInfo") 
    private List<OrderTrackingInfo> orderTrackingInfo;
    @JsonProperty("OrderType") 
    private OrderType orderType;
    @JsonProperty("OrderUpdatedBy") 
    private List<OrderUpdatedBy> orderUpdatedBy;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PackageCount") 
    private int packageCount;
    @JsonProperty("ParentReservationRequestId") 
    private String parentReservationRequestId;
    @JsonProperty("Payment") 
    private List<Payment> payment;
    @JsonProperty("PaymentStatus") 
    private PaymentStatus paymentStatus;
    @JsonProperty("PostVoidReason") 
    private PostVoidReason postVoidReason;
    @JsonProperty("Priority") 
    private int priority;
    @JsonProperty("ProcessInfo") 
    private ProcessInfo processInfo;
    @JsonProperty("ProcessReturnComments") 
    private String processReturnComments;
    @JsonProperty("ProcessReturnReason") 
    private ProcessReturnReason processReturnReason;
    @JsonProperty("PublishStatus") 
    private PublishStatus publishStatus;
    @JsonProperty("QrCode") 
    private List<List<String>> qrCode;
    @JsonProperty("RefundPaymentMethod") 
    private RefundPaymentMethod refundPaymentMethod;
    @JsonProperty("RefundRecipient") 
    private RefundRecipient refundRecipient;
    @JsonProperty("RelatedOrderIds") 
    private List<String> relatedOrderIds;
    @JsonProperty("RelatedReturnIds") 
    private List<String> relatedReturnIds;
    @JsonProperty("Release") 
    private List<Release> release;
    @JsonProperty("ReturnLabel") 
    private List<ReturnLabel> returnLabel;
    @JsonProperty("ReturnLabelEmail") 
    private String returnLabelEmail;
    @JsonProperty("ReturnStatus") 
    private String returnStatus;
    @JsonProperty("ReturnTotalWithoutFees") 
    private int returnTotalWithoutFees;
    @JsonProperty("ReturnTrackingDetail") 
    private List<ReturnTrackingDetail> returnTrackingDetail;
    @JsonProperty("RunId") 
    private String runId;
    @JsonProperty("SelfServiceAttribute") 
    private SelfServiceAttribute selfServiceAttribute;
    @JsonProperty("SellingChannel") 
    private SellingChannel sellingChannel;
    @JsonProperty("SellingLocationId") 
    private String sellingLocationId;
    @JsonProperty("SuggestedPromo") 
    private List<SuggestedPromo> suggestedPromo;
    @JsonProperty("SuspendedOrderId") 
    private String suspendedOrderId;
    @JsonProperty("TaxExemptComments") 
    private String taxExemptComments;
    @JsonProperty("TaxExemptId") 
    private String taxExemptId;
    @JsonProperty("TaxExemptReason") 
    private TaxExemptReason taxExemptReason;
    @JsonProperty("TaxOverridePercValue") 
    private int taxOverridePercValue;
    @JsonProperty("TaxOverrideReason") 
    private TaxOverrideReason taxOverrideReason;
    @JsonProperty("TaxOverrideType") 
    private TaxOverrideType taxOverrideType;
    @JsonProperty("TaxOverrideValue") 
    private int taxOverrideValue;
    @JsonProperty("TotalInformationalTaxes") 
    private int totalInformationalTaxes;
    @JsonProperty("TotalReturnFees") 
    private int totalReturnFees;
    @JsonProperty("TransactionReference") 
    private List<TransactionReference> transactionReference;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    private EligibleRefundCharges eligibleRefundCharges;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
