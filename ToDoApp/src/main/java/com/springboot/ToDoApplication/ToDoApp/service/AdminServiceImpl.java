package com.springboot.ToDoApplication.ToDoApp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.ToDoApplication.ToDoApp.dao.AdminDAO;
import com.springboot.ToDoApplication.ToDoApp.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	private AdminDAO adminDAO;
	public AdminServiceImpl(AdminDAO adminDAO) {
		
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public List<Admin> findAll() {
		return adminDAO.findAll();
	}

	@Override
	@Transactional
	public Admin findByEmail(String theEmail) {
		return adminDAO.findByEmail(theEmail);
	}

}
