package com.cg.aps.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
public abstract class BaseEntity implements DropdownList {

	@Id
	protected long id;
	@Column(name="AprtmCreatedBy", nullable=false)
	protected String createdBy;
	@Column(name="AprtmModifiedBy", nullable=false)
	protected String modifiedBy;
	@Column(name="AprtmCreatedDate", nullable=false)
	protected Timestamp createdDateTime;
	@Column(name="AprtmModifiedDate", nullable=false)
	protected Timestamp modifiedDateTime;
	
	public BaseEntity(long id, String createdBy, String modifiedBy, Timestamp createdDateTime,
			Timestamp modifiedDateTime) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", createdDateTime="
				+ createdDateTime + ", modifiedDateTime=" + modifiedDateTime + "]";
	}
	
	
	
}
