package com.cg.aps.entities;

import java.sql.Timestamp;
import java.util.Date;

public class DeliveryEntity extends BaseEntity {

	

	private String ownerName;
	private String time;
	private Date date;
	private String status;
	
	
	
	public DeliveryEntity(long id, String createdBy, String modifiedBy, Timestamp createdDateTime,
			Timestamp modifiedDateTime, String ownerName, String time, Date date, String status) {
		super(id, createdBy, modifiedBy, createdDateTime, modifiedDateTime);
		this.ownerName = ownerName;
		this.time = time;
		this.date = date;
		this.status = status;
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
