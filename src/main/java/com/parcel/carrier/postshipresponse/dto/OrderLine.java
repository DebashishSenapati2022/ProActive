package com.parcel.carrier.postshipresponse.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderLine{
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AddressId") 
    private String addressId;
    @JsonProperty("Allocation") 
    private List<Allocation> allocation;
    @JsonProperty("AllocationConfigId") 
    private String allocationConfigId;
    @JsonProperty("AlternateOrderLineId") 
    private String alternateOrderLineId;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BusinessDate") 
    private String businessDate;
    @JsonProperty("CalculatedValues") 
    private CalculatedValues calculatedValues;
    @JsonProperty("CanShipToAddress") 
    private boolean canShipToAddress;
    @JsonProperty("CancelComments") 
    private String cancelComments;
    @JsonProperty("CancelReason") 
    private CancelReason cancelReason;
    @JsonProperty("CancelledTotalDiscounts") 
    private int cancelledTotalDiscounts;
    @JsonProperty("CarrierCode") 
    private String carrierCode;
    @JsonProperty("ChangeLog") 
    private ChangeLog changeLog;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerResponseTracker") 
    private List<CustomerResponseTracker> customerResponseTracker;
    @JsonProperty("DeliveryMethod") 
    private DeliveryMethod deliveryMethod;
    @JsonProperty("DeliveryMethodSubType") 
    private String deliveryMethodSubType;
    @JsonProperty("DoNotShipBeforeDate") 
    private String doNotShipBeforeDate;
    @JsonProperty("EffectiveRank") 
    private String effectiveRank;
    @JsonProperty("Eta") 
    private Date eta;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FulfillmentDetail") 
    private List<FulfillmentDetail> fulfillmentDetail;
    @JsonProperty("FulfillmentGroupId") 
    private String fulfillmentGroupId;
    @JsonProperty("FulfillmentStatus") 
    private String fulfillmentStatus;
    @JsonProperty("GiftCardValue") 
    private int giftCardValue;
    @JsonProperty("IsActivationRequired") 
    private boolean isActivationRequired;
    @JsonProperty("IsCancelled") 
    private boolean isCancelled;
    @JsonProperty("IsDiscountable") 
    private boolean isDiscountable;
    @JsonProperty("IsEligibleForOverride") 
    private boolean isEligibleForOverride;
    @JsonProperty("IsEvenExchange") 
    private boolean isEvenExchange;
    @JsonProperty("IsExchangeable") 
    private boolean isExchangeable;
    @JsonProperty("IsGift") 
    private boolean isGift;
    @JsonProperty("IsGiftCard") 
    private boolean isGiftCard;
    @JsonProperty("IsHazmat") 
    private boolean isHazmat;
    @JsonProperty("IsItemNotOnFile") 
    private boolean isItemNotOnFile;
    @JsonProperty("IsItemTaxExemptable") 
    private boolean isItemTaxExemptable;
    @JsonProperty("IsItemTaxOverridable") 
    private boolean isItemTaxOverridable;
    @JsonProperty("IsNonMerchandise") 
    private boolean isNonMerchandise;
    @JsonProperty("IsOnHold") 
    private boolean isOnHold;
    @JsonProperty("IsPackAndHold") 
    private boolean isPackAndHold;
    @JsonProperty("IsPerishable") 
    private boolean isPerishable;
    @JsonProperty("IsPreOrder") 
    private boolean isPreOrder;
    @JsonProperty("IsPreSale") 
    private boolean isPreSale;
    @JsonProperty("IsPriceOverridden") 
    private boolean isPriceOverridden;
    @JsonProperty("IsPriceOverrideable") 
    private boolean isPriceOverrideable;
    @JsonProperty("IsReceiptExpected") 
    private boolean isReceiptExpected;
    @JsonProperty("IsReturn") 
    private boolean isReturn;
    @JsonProperty("IsReturnAllowedByAgePolicy") 
    private boolean isReturnAllowedByAgePolicy;
    @JsonProperty("IsReturnable") 
    private boolean isReturnable;
    @JsonProperty("IsReturnableAtStore") 
    private boolean isReturnableAtStore;
    @JsonProperty("IsTaxIncluded") 
    private boolean isTaxIncluded;
    @JsonProperty("IsTaxOverridden") 
    private boolean isTaxOverridden;
    @JsonProperty("ItemBarcode") 
    private String itemBarcode;
    @JsonProperty("ItemBrand") 
    private String itemBrand;
    @JsonProperty("ItemColorDescription") 
    private String itemColorDescription;
    @JsonProperty("ItemDepartmentName") 
    private String itemDepartmentName;
    @JsonProperty("ItemDepartmentNumber") 
    private int itemDepartmentNumber;
    @JsonProperty("ItemDeptNumber") 
    private String itemDeptNumber;
    @JsonProperty("ItemDescription") 
    private String itemDescription;
    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("ItemMaxDiscountAmount") 
    private int itemMaxDiscountAmount;
    @JsonProperty("ItemMaxDiscountPercentage") 
    private int itemMaxDiscountPercentage;
    @JsonProperty("ItemSeason") 
    private String itemSeason;
    @JsonProperty("ItemShortDescription") 
    private String itemShortDescription;
    @JsonProperty("ItemSize") 
    private String itemSize;
    @JsonProperty("ItemStyle") 
    private String itemStyle;
    @JsonProperty("ItemTaxCode") 
    private String itemTaxCode;
    @JsonProperty("ItemWebURL") 
    private String itemWebURL;
    @JsonProperty("LatestDeliveryDate") 
    private String latestDeliveryDate;
    @JsonProperty("LatestFulfilledDate") 
    private Date latestFulfilledDate;
    @JsonProperty("LineProcessInfo") 
    private LineProcessInfo lineProcessInfo;
    @JsonProperty("LineType") 
    private LineType lineType;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("MaxAppeasementAmount") 
    private int maxAppeasementAmount;
    @JsonProperty("MaxFulfillmentStatus") 
    private MaxFulfillmentStatus maxFulfillmentStatus;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("MinFulfillmentStatus") 
    private MinFulfillmentStatus minFulfillmentStatus;
    @JsonProperty("OrderId") 
    private String orderId;
    @JsonProperty("OrderLineAdditional") 
    private OrderLineAdditional orderLineAdditional;
    @JsonProperty("OrderLineAttribute") 
    private List<OrderLineAttribute> orderLineAttribute;
    @JsonProperty("OrderLineCancelHistory") 
    private List<OrderLineCancelHistory> orderLineCancelHistory;
    @JsonProperty("OrderLineChargeDetail") 
    private List<OrderLineChargeDetail> orderLineChargeDetail;
    @JsonProperty("OrderLineComponents") 
    private List<OrderLineComponent> orderLineComponents;
    @JsonProperty("OrderLineExtension1") 
    private OrderLineExtension1 orderLineExtension1;
    @JsonProperty("OrderLineExtension2") 
    private List<OrderLineExtension2> orderLineExtension2;
    @JsonProperty("OrderLineExtension3") 
    private List<OrderLineExtension3> orderLineExtension3;
    @JsonProperty("OrderLineExtension4") 
    private List<OrderLineExtension4> orderLineExtension4;
    @JsonProperty("OrderLineExtension5") 
    private List<OrderLineExtension5> orderLineExtension5;
    @JsonProperty("OrderLineHold") 
    private List<OrderLineHold> orderLineHold;
    @JsonProperty("OrderLineId") 
    private String orderLineId;
    @JsonProperty("OrderLineMilestone") 
    private List<OrderLineMilestone> orderLineMilestone;
    @JsonProperty("OrderLineMilestoneEvent") 
    private List<OrderLineMilestoneEvent> orderLineMilestoneEvent;
    @JsonProperty("OrderLineNote") 
    private List<OrderLineNote> orderLineNote;
    @JsonProperty("OrderLinePickupDetail") 
    private List<OrderLinePickupDetail> orderLinePickupDetail;
    @JsonProperty("OrderLinePriceOverrideHistory") 
    private List<OrderLinePriceOverrideHistory> orderLinePriceOverrideHistory;
    @JsonProperty("OrderLinePromisingInfo") 
    private OrderLinePromisingInfo orderLinePromisingInfo;
    @JsonProperty("OrderLinePromotionRequest") 
    private List<OrderLinePromotionRequest> orderLinePromotionRequest;
    @JsonProperty("OrderLineSalesAssociate") 
    private List<OrderLineSalesAssociate> orderLineSalesAssociate;
    @JsonProperty("OrderLineTagDetail") 
    private List<OrderLineTagDetail> orderLineTagDetail;
    @JsonProperty("OrderLineTaxDetail") 
    private List<OrderLineTaxDetail> orderLineTaxDetail;
    @JsonProperty("OrderLineVASInstructions") 
    private List<OrderLineVASInstruction> orderLineVASInstructions;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("OriginalUnitPrice") 
    private int originalUnitPrice;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("ParentLineCreatedTimestamp") 
    private String parentLineCreatedTimestamp;
    @JsonProperty("ParentOrderId") 
    private String parentOrderId;
    @JsonProperty("ParentOrderLineId") 
    private String parentOrderLineId;
    @JsonProperty("ParentOrderLineType") 
    private ParentOrderLineType parentOrderLineType;
    @JsonProperty("PaymentGroupId") 
    private String paymentGroupId;
    @JsonProperty("PhysicalOriginId") 
    private String physicalOriginId;
    @JsonProperty("PipelineId") 
    private String pipelineId;
    @JsonProperty("Priority") 
    private int priority;
    @JsonProperty("ProductClass") 
    private String productClass;
    @JsonProperty("PromisedDeliveryDate") 
    private String promisedDeliveryDate;
    @JsonProperty("PromisedShipDate") 
    private String promisedShipDate;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("QuantityDetail") 
    private List<QuantityDetail> quantityDetail;
    @JsonProperty("RefundPrice") 
    private int refundPrice;
    @JsonProperty("ReleaseGroupId") 
    private String releaseGroupId;
    @JsonProperty("RequestedDeliveryDate") 
    private String requestedDeliveryDate;
    @JsonProperty("ReturnDetail") 
    private List<ReturnDetail> returnDetail;
    @JsonProperty("ReturnLineTotalWithoutFees") 
    private int returnLineTotalWithoutFees;
    @JsonProperty("ReturnType") 
    private ReturnType returnType;
    @JsonProperty("ReturnableLineTotal") 
    private int returnableLineTotal;
    @JsonProperty("ReturnableQuantity") 
    private int returnableQuantity;
    @JsonProperty("SelfServiceUrl") 
    private String selfServiceUrl;
    @JsonProperty("SellingLocationId") 
    private String sellingLocationId;
    @JsonProperty("ServiceLevelCode") 
    private String serviceLevelCode;
    @JsonProperty("ShipFromAddress") 
    private ShipFromAddress shipFromAddress;
    @JsonProperty("ShipFromAddressId") 
    private String shipFromAddressId;
    @JsonProperty("ShipToAddress") 
    private ShipToAddress shipToAddress;
    @JsonProperty("ShipToLocationId") 
    private String shipToLocationId;
    @JsonProperty("ShippingMethodId") 
    private String shippingMethodId;
    @JsonProperty("ShortSelfServiceUrl") 
    private String shortSelfServiceUrl;
    @JsonProperty("SmallImageURI") 
    private String smallImageURI;
    @JsonProperty("StoreSaleEntryMethod") 
    private StoreSaleEntryMethod storeSaleEntryMethod;
    @JsonProperty("StreetDate") 
    private String streetDate;
    @JsonProperty("SystemInitiatedQtyUpdate") 
    private boolean systemInitiatedQtyUpdate;
    @JsonProperty("TaxOverridePercValue") 
    private int taxOverridePercValue;
    @JsonProperty("TaxOverrideType") 
    private TaxOverrideType taxOverrideType;
    @JsonProperty("TaxOverrideValue") 
    private int taxOverrideValue;
    @JsonProperty("TaxShipFromAddress") 
    private TaxShipFromAddress taxShipFromAddress;
    @JsonProperty("TaxShipFromLocationId") 
    private String taxShipFromLocationId;
    @JsonProperty("TaxableAmount") 
    private int taxableAmount;
    @JsonProperty("TotalInformationalTaxes") 
    private int totalInformationalTaxes;
    @JsonProperty("TransactionReferenceId") 
    private String transactionReferenceId;
    @JsonProperty("UOM") 
    private String uOM;
    @JsonProperty("UnitPrice") 
    private int unitPrice;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("ValueEntryRequired") 
    private boolean valueEntryRequired;
    @JsonProperty("VolumetricWeight") 
    private int volumetricWeight;
    @JsonProperty("VolumetricWeightUOM") 
    private VolumetricWeightUOM volumetricWeightUOM;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
