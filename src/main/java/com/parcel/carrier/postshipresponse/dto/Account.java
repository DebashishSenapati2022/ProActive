package com.parcel.carrier.postshipresponse.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Account {
	@JsonProperty("AccountAttribute")
	private List<AccountAttribute> accountAttribute;
	@JsonProperty("AccountEncryptedAttribute")
	private List<AccountEncryptedAttribute> accountEncryptedAttribute;
	@JsonProperty("AccountId")
	private String accountId;
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
	@JsonProperty("LocalizedTo")
	private String localizedTo;
	@JsonProperty("LocationId")
	private String locationId;
	@JsonProperty("Messages")
	private Messages messages;
	@JsonProperty("PK")
	private String pK;
	@JsonProperty("ParentGateway")
	private ParentGateway parentGateway;
	@JsonProperty("ProfileId")
	private String profileId;
	@JsonProperty("UpdatedBy")
	private String updatedBy;
	@JsonProperty("UpdatedTimestamp")
	private String updatedTimestamp;
	private String entityName;
	private boolean localize;
	private String rootCause;
}
