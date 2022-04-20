package com.parcel.carrier.postshipresponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProcessInfo{
    @JsonProperty("AccountReceivableAccountNumber") 
    private String accountReceivableAccountNumber;
    @JsonProperty("AccountReceivableCode") 
    private String accountReceivableCode;
    @JsonProperty("Actions") 
    private Actions actions;
    @JsonProperty("AdvertisingCode") 
    private String advertisingCode;
    @JsonProperty("AdvertisingDate") 
    private String advertisingDate;
    @JsonProperty("ApplyAction") 
    private String applyAction;
    @JsonProperty("BillOfLadingBreakAttribute") 
    private String billOfLadingBreakAttribute;
    @JsonProperty("CashOnDeliveryFund") 
    private boolean cashOnDeliveryFund;
    @JsonProperty("CreatedBy") 
    private String createdBy;
    @JsonProperty("CreatedTimestamp") 
    private String createdTimestamp;
    @JsonProperty("CustomerBrokerAccountNumber") 
    private String customerBrokerAccountNumber;
    @JsonProperty("CustomerDepartment") 
    private String customerDepartment;
    @JsonProperty("DeclaredValue") 
    private int declaredValue;
    @JsonProperty("DeclaredValueCurrencyCode") 
    private String declaredValueCurrencyCode;
    @JsonProperty("DesignatedEquipmentId") 
    private int designatedEquipmentId;
    @JsonProperty("DesignatedShipVia") 
    private String designatedShipVia;
    @JsonProperty("DestinationShipThroughLocation") 
    private String destinationShipThroughLocation;
    @JsonProperty("DsgStaticRouteId") 
    private String dsgStaticRouteId;
    @JsonProperty("Extended") 
    private Extended extended;
    @JsonProperty("FTSRNumber") 
    private String fTSRNumber;
    @JsonProperty("FedexDutyTaxAccountID") 
    private String fedexDutyTaxAccountID;
    @JsonProperty("FedexDutyTaxPaymentType") 
    private int fedexDutyTaxPaymentType;
    @JsonProperty("FreightForwardAccountNumber") 
    private String freightForwardAccountNumber;
    @JsonProperty("GlobalLocationNumber") 
    private String globalLocationNumber;
    @JsonProperty("ImporterDefinition") 
    private String importerDefinition;
    @JsonProperty("InternalGoodsDescription") 
    private String internalGoodsDescription;
    @JsonProperty("InternationalGoodsDescription") 
    private String internationalGoodsDescription;
    @JsonProperty("IsAutoConsolidationBlocked") 
    private boolean isAutoConsolidationBlocked;
    @JsonProperty("IsAutoCreateBlocked") 
    private boolean isAutoCreateBlocked;
    @JsonProperty("IsBackOrdered") 
    private boolean isBackOrdered;
    @JsonProperty("IsCartonMinWeight") 
    private boolean isCartonMinWeight;
    @JsonProperty("IsShipmentDocumentsOnly") 
    private boolean isShipmentDocumentsOnly;
    @JsonProperty("IsWarehouseTransfer") 
    private boolean isWarehouseTransfer;
    @JsonProperty("LPNCubingIndicator") 
    private String lPNCubingIndicator;
    @JsonProperty("Language") 
    private String language;
    @JsonProperty("LocalizedTo") 
    private String localizedTo;
    @JsonProperty("Messages") 
    private Messages messages;
    @JsonProperty("MoveType") 
    private String moveType;
    @JsonProperty("MovementOption") 
    private String movementOption;
    @JsonProperty("OrgId") 
    private String orgId;
    @JsonProperty("PK") 
    private String pK;
    @JsonProperty("PalletCubingIndicator") 
    private int palletCubingIndicator;
    @JsonProperty("PlanningDestinationFacilityId") 
    private String planningDestinationFacilityId;
    @JsonProperty("PlanningOriginFacilityId") 
    private String planningOriginFacilityId;
    @JsonProperty("PrimaryMaxicodeAddressNumber") 
    private String primaryMaxicodeAddressNumber;
    @JsonProperty("Priority") 
    private String priority;
    @JsonProperty("RouteTo") 
    private String routeTo;
    @JsonProperty("RouteType1") 
    private String routeType1;
    @JsonProperty("RouteType2") 
    private String routeType2;
    @JsonProperty("RouteWaveNumber") 
    private String routeWaveNumber;
    @JsonProperty("RoutingAttributes") 
    private String routingAttributes;
    @JsonProperty("ScheduleDeliveryDate") 
    private String scheduleDeliveryDate;
    @JsonProperty("SecondryMaxicodeAddressNumber") 
    private String secondryMaxicodeAddressNumber;
    @JsonProperty("ShipLocationControl") 
    private String shipLocationControl;
    @JsonProperty("ShipmentPlanningScheduleDay") 
    private String shipmentPlanningScheduleDay;
    @JsonProperty("ShipmmentPlanningScheduleDay") 
    private String shipmmentPlanningScheduleDay;
    @JsonProperty("TransportationWaveOptionId") 
    private String transportationWaveOptionId;
    @JsonProperty("UpdatedBy") 
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp") 
    private String updatedTimestamp;
    @JsonProperty("WaveId") 
    private int waveId;
    private String entityName;
    private boolean localize;
    private String rootCause;
}
