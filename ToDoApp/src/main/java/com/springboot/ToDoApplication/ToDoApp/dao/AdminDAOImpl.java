package com.springboot.ToDoApplication.ToDoApp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.ToDoApplication.ToDoApp.entity.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	//define field for entity manager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public AdminDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Admin> findAll() {
		//get the current hibernate session
				Session currentSession=entityManager.unwrap(Session.class);
				
				//create a query
				Query<Admin> theQuery =
						currentSession.createQuery("from Admin",Admin.class); 
				
				//execute query and result
				List<Admin> Admins=theQuery.getResultList();
				
				//return the result
				
				return Admins;
	}

	@Override
	public Admin findByEmail(String theEmail) {
		//get current 
				Session currentSession=entityManager.unwrap(Session.class);
					
				//get the employee
				Admin theAdmin =
						currentSession.get(Admin.class, theEmail);
				//return
				return theAdmin;
			
	}

}
