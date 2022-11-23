package com.furiosnerd.web.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furiosnerd.web.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User b = new User("amor", "Beatriz", "beatrizvaz@gmail.com");
		return ResponseEntity.ok().body(b);
	}

}
