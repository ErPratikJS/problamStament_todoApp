package com.springboot.ToDoApplication.ToDoApp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springboot.ToDoApplication.ToDoApp.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	//define field for entity manager
		private EntityManager entityManager;
		
	@Autowired
	public UserDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<User> findAll() {
		//get the current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//create a query
		Query<User> theQuery =
				currentSession.createQuery("from User",User.class); 
		
		//execute quey and result
		List<User> users=theQuery.getResultList();
		
		//return the result
		
		return users;
	}

	@Override
	public User findByIndex(int index) {
		Session currentSession=entityManager.unwrap(Session.class);
		
		//get the user
		User theUser =
				currentSession.get(User.class,index);
		//return
		return theUser;
	}

	@Override
	public void save(User theUser) {
		//get current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//save employee
		currentSession.saveOrUpdate(theUser);
	

	}

	@Override
	public void deleteByIndex(int index) {
		//get current hibernate session
				Session currentSession=entityManager.unwrap(Session.class);
				Query theQuery =
						currentSession.createQuery("delete from User where index=:userIndex"); 
				theQuery.setParameter("userIndex", index );
			
				theQuery.executeUpdate();
	
			
	
	}

}
