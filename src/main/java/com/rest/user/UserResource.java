package com.rest.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;
	
	//GET /users
	//reteriveAllUsers
	@GetMapping("/users")
	public List<User> reteriveAllUsers(){
		return service.findall();
	}
	
	//GET /users/{id}
	//reteriveOneUsers
	@GetMapping("/users/{id}")
	public User reteriveOneUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	//input - details of user
	//output - Created & Return the created URI
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User saveUser = service.save(user);
	}
}
