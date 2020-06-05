package com.springboot.ToDoApplication.ToDoApp.dao;

import java.util.List;

import com.springboot.ToDoApplication.ToDoApp.entity.Admin;



public interface AdminDAO {
	public List<Admin> findAll();
	
	public Admin findByEmail(String theEmail);

}
