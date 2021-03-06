package com.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_table")
public class Login {
	

	@Id
	@Column(length=20)
	private String username;
	@Column(length=20)
	private String password;
	@Column(length=20)
	private String role;

	public Login() {
	}
	
	

	public Login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setType(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
