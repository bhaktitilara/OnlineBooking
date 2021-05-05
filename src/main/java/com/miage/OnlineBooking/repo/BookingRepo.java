package com.miage.OnlineBooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miage.OnlineBooking.domain.Booking;
import com.miage.OnlineBooking.domain.User;
/**
 *
 * @author bhakti
 */
public interface BookingRepo extends JpaRepository<Booking, Long> {
	
	List<Booking> findByUser(User user);
	
	List<Booking> findAll();

}
