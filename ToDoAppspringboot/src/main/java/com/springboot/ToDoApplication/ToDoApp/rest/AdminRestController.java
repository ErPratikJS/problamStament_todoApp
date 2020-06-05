package com.springboot.ToDoApplication.ToDoApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ToDoApplication.ToDoApp.entity.Admin;
import com.springboot.ToDoApplication.ToDoApp.service.AdminService;

@RestController
@RequestMapping("/todo")
public class AdminRestController {

		private AdminService adminService;

		@Autowired
		public AdminRestController(AdminService adminService) {
		
			this.adminService = adminService;
		}
		
		@GetMapping("/admins")
		public List<Admin> findAll(){
			return adminService.findAll();
		
		}
		
	/*	@GetMapping("/admins/email")
		public Admin getAdmin(@PathVariable String email){
			return adminService.findByEmail(email);
		
		}*/
		
	
}
