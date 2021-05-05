package com.miage.OnlineBooking.service;

import java.util.List;

import com.miage.OnlineBooking.domain.HotelService;
/**
 *
 * @author bhakti
 */
public interface HotelServiceService {
	
	List<HotelService> getAllById(List<Long> hotelServiceIds);

}
