package com.springboot.ToDoApplication.ToDoApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ToDoApplication.ToDoApp.entity.User;
import com.springboot.ToDoApplication.ToDoApp.service.UserService;

@RestController
@RequestMapping("/todo")
public class UserRestController {
	
	private UserService userService;
	
	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> findAll(){
		return  userService.findAll();	}

	 @GetMapping("/users/{userIndex}")
	public User getUser(@PathVariable int userIndex)
	{
		User theUser =userService.findByIndex(userIndex);
		if(theUser==null)
		{
			throw new RuntimeException("theUser id not found"+ userIndex);
		}
		return theUser;
	}
	
	
	
	//add mapping for post /users  - new users
	  @PostMapping("/postusers")
	  public User addUser(@RequestBody User theUser)
	  {
		  //also just in the pass id in json
		  
		  //this is to focre a save of new item
		  
		  theUser.setIndex(0);
		  userService.save(theUser);
		  
		  return theUser;
	  }
	  

	//add mapping for put /users  - upadate users
		 @PutMapping("/putusers")
		 public User updateUser(@RequestBody User theUser)
		 {
				  userService.save(theUser);
			  
		  return theUser;
	  }

		
		 
		 //add mapping for delete /users  - delete user
		  @DeleteMapping("/users/{userIndex}")
		  public String deleteUser(@PathVariable int userIndex)
		  {
			  User tempUser=userService.findByIndex(userIndex);
			  if(tempUser==null)
				{
					throw new RuntimeException("User id not found "+ userIndex);
				}
			  
			  userService.deleteByIndex(userIndex);
			  
			  return "Deleted user Id -" + userIndex;
		  }
	 
}
