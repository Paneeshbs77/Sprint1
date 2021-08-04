package com.cg.aps.entities;

import java.sql.Timestamp;
import java.util.Date;

public class VehicleEntity extends BaseEntity {

	private String name;
	private String parkingNo;
	private String arrivalTime;
	private String departureTime;
	private Date date;
	private String vehicleNo;
	private String vehicleType;

	
	
	public VehicleEntity(long id, String createdBy, String modifiedBy, Timestamp createdDateTime,
			Timestamp modifiedDateTime, String name, String parkingNo, String arrivalTime, String departureTime,
			Date date, String vehicleNo, String vehicleType) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.name = name;
		this.parkingNo = parkingNo;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.date = date;
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
	}

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
