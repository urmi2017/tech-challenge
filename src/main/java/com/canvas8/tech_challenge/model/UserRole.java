package com.canvas8.tech_challenge.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}
