package com.miage.OnlineBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miage.OnlineBooking.domain.User;
import com.miage.OnlineBooking.service.UserService;
/**
 *
 * @author bhakti
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.create(user);
	}
	
}
