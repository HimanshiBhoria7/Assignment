package com.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "userespire")


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="userId")
	private int userId;
	@NotNull
	@Column(name="emailid")
	private String emailid;
	@NotNull
	@Column(name="password")
	private String password;
	@NotNull
	@Column(name="enable")
	private String enable;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	


}
