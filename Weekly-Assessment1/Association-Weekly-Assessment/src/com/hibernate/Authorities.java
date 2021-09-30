package com.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "authoritiesespire")

public class Authorities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="id")
	private int authoritiesId;
	@NotNull
	@Column(name="email")
	private String emailId;
	@NotNull
	@Column(name="email")
	private String authorities;
	
	
	public int getAuthoritiesId() {
		return authoritiesId;
	}
	public void setAuthoritiesId(int authoritiesId) {
		this.authoritiesId = authoritiesId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
}
