package com.miage.OnlineBooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miage.OnlineBooking.domain.HotelService;
import com.miage.OnlineBooking.repo.HotelServiceRepo;
import com.miage.OnlineBooking.service.HotelServiceService;
/**
 *
 * @author bhakti
 */
@Service
public class HotelServiceServiceImpl implements HotelServiceService{
	
	@Autowired 
	private HotelServiceRepo hotelServiceRepository;

	@Override
	public List<HotelService> getAllById(List<Long> hotelServiceIds) {
		return hotelServiceRepository.findAllById(hotelServiceIds);
	}

}
