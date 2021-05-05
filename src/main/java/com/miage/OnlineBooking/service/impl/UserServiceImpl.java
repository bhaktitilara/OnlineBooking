package com.miage.OnlineBooking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miage.OnlineBooking.domain.User;
import com.miage.OnlineBooking.exceptions.ResourceNotFoundException;
import com.miage.OnlineBooking.repo.UserRepo;
import com.miage.OnlineBooking.service.UserService;
/**
 *
 * @author bhakti
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserRepo userRepository;

	@Override
	public User getUserById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if (!user.isPresent()) {
			throw new ResourceNotFoundException();
		}
		
		return user.get();
	}
	
	@Override
	public User create(User user) {
		User userSaved = userRepository.save(user);
		return userSaved;
	}

}
