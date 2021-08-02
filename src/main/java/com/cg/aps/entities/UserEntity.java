package com.cg.aps.entities;



public class UserEntity extends BaseEntity {

	private String firstName;
	private String lastName;
	private String loginId;
	private String password;
	private String mobileNo;
	private String emailId;
	private long roleId;
	
	

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(id);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}

}
