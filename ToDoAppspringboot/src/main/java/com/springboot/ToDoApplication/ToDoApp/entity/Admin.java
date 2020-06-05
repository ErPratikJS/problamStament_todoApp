package com.springboot.ToDoApplication.ToDoApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_Id")
	private String admin_Id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	
	//Contractor
	public Admin() {}


	public Admin(String admin_Id, String password, String email) {
		this.admin_Id = admin_Id;
		this.password = password;
		this.email = email;
	}

	//Setter Getter
	
	public String getAdmin_Id() {
		return admin_Id;
	}


	public void setAdmin_Id(String admin_Id) {
		this.admin_Id = admin_Id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
	
}
