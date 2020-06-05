package com.springboot.ToDoApplication.ToDoApp.service;

import java.util.List;

import com.springboot.ToDoApplication.ToDoApp.entity.Admin;

public interface AdminService {

	public List<Admin> findAll();
	
	public Admin findByEmail(String theEmail);
}
