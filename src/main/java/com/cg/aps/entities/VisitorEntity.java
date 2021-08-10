package com.cg.aps.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visitors_list")
public class VisitorEntity  {

	@Id
	@Column(name="VisitorId")
	private int visitorId;
	@Column(name="VisitorName")
	private String name;
	@Column(name="OwnerName")
	private String ownerName;
	@Column(name="OwnerFlatNo")
	private String flatNo;
	@Column(name="VisitedDate")
	private LocalDate date;
	@Column(name="VisitorArrivatTime")
	private String arrivalTime;
	@Column(name="VisitorDepartureTime")
	private String departureTime;

	public VisitorEntity() {
		
	}

	public VisitorEntity(int visitorId, String name, String ownerName, String flatNo, LocalDate date, String arrivalTime,
			String departureTime) {
		super();
		this.visitorId = visitorId;
		this.name = name;
		this.ownerName = ownerName;
		this.flatNo = flatNo;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	
	


}
