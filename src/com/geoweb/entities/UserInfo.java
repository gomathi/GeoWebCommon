package com.geoweb.entities;

/**
 * 
 * @author goms
 * 
 */

public class UserInfo {

	private final String userId;
	private final String userName;
	private final String emailId;
	private final String phoneNo;

	public UserInfo(String userId, String userName, String emailId, String phoneNo) {
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

}
