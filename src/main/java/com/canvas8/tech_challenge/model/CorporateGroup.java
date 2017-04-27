package com.canvas8.tech_challenge.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CorporateGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int corporateGroupId;
	private String name;
	private Date createdDate;
	private String emailAddress;
	// private List<User> users = new ArrayList<>();

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
	// public List<User> getUsers() {
	// return users;
	// }
	// public void setUsers(List<User> users) {
	// this.users = users;
	// }

}
