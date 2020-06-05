package com.springboot.ToDoApplication.ToDoApp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.ToDoApplication.ToDoApp.dao.UserDAO;
import com.springboot.ToDoApplication.ToDoApp.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	

	@Override
	@Transactional
	public void save(User theUser) {
		userDAO.save(theUser);

	}

	@Override
	@Transactional
	public User findByIndex(int index) {
		// TODO Auto-generated method stub
		return userDAO.findByIndex(index);
	}

	@Override
	@Transactional
	public void deleteByIndex(int index) {
		// TODO Auto-generated method stub
		userDAO.deleteByIndex(index);
	}

	
}
