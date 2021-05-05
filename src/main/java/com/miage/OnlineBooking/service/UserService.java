package com.miage.OnlineBooking.service;

import com.miage.OnlineBooking.domain.User;
/**
 *
 * @author bhakti
 */
public interface UserService {
	
	User getUserById(Long userId);
	
	User create(User user);

}
