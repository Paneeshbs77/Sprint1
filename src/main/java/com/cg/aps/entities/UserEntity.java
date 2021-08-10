package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_list")
public class UserEntity {
	

	@Id
	private int userId;
	private String userName;
	private String loginId;
	private String password;
	private String mobileNo;
	private String emailId;
	
	public UserEntity() {
		
	}

	public UserEntity(int userId, String userName, String loginId, String password, String mobileNo, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.loginId = loginId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", loginId=" + loginId + ", password="
				+ password + ", mobileNo=" + mobileNo + ", emailId=" + emailId + "]";
	}
	

}
