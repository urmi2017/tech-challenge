package com.canvas8.tech_challenge.model;

import java.util.Date;

public class CorporateGroup {

	private int corporateGroupId;
	private String name;
	private Date createdDate;
	private String emailAddress;
	
	public int getId() {
		return corporateGroupId;
	}
	public void setId(int id) {
		this.corporateGroupId = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
