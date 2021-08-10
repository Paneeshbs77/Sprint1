package com.cg.aps.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleEntity {

	@Id
	private int vehicleId;
	private String name;
	private String parkingNo;
	private String arrivalTime;
	private String departureTime;
	private LocalDate date;
	private String vehicleNo;
	private String vehicleType;

	
	
}
