package com.cg.aps.entities;

import java.sql.Timestamp;

public class DomesticHelpEntity extends BaseEntity {

	private String flatNo;
	private String ownerName;
	private String name;
	private String helpType;
	private String arrivalTime;
	private String departureTime;
	private String date;
	
	
	
	public DomesticHelpEntity(long id, String createdBy, String modifiedBy, Timestamp createdDateTime,
			Timestamp modifiedDateTime, String flatNo, String ownerName, String name, String helpType,
			String arrivalTime, String departureTime, String date) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.flatNo = flatNo;
		this.ownerName = ownerName;
		this.name = name;
		this.helpType = helpType;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.date = date;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
