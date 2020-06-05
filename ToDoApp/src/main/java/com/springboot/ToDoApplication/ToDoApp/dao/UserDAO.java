package com.springboot.ToDoApplication.ToDoApp.dao;

import java.util.List;

import com.springboot.ToDoApplication.ToDoApp.entity.User;



public interface UserDAO {

	public List<User> findAll();
	
	public User findByIndex(int index);

	public void save(User theUser);
	 
	public void deleteByIndex(int index);

}
