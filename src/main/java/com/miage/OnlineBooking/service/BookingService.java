package com.miage.OnlineBooking.service;
 
import java.math.BigDecimal;
import java.util.List;

import com.miage.OnlineBooking.domain.Booking;
import com.miage.OnlineBooking.domain.BookingDto;
import com.miage.OnlineBooking.exceptions.InvalidInputException;
/**
 *
 * @author bhakti
 */
public interface BookingService {
	
	Booking create(BookingDto booking);
	
	BigDecimal getTotalPrice(Long bookingId) throws InvalidInputException;
	
	List<Booking> getByUser(Long userId);
	
	List<Booking> getAll();
 
}
