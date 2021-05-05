package com.miage.OnlineBooking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miage.OnlineBooking.domain.RoomCategory;
import com.miage.OnlineBooking.exceptions.ResourceNotFoundException;
import com.miage.OnlineBooking.repo.RoomCategoryRepo;
import com.miage.OnlineBooking.service.RoomCategoryService;
/**
 *
 * @author bhakti
 */
@Service
public class RoomCategoryServiceImpl implements RoomCategoryService{
	
	@Autowired
	private RoomCategoryRepo roomCategoryRepository;

	@Override
	public RoomCategory getById(Long roomCategoryId) {
		Optional<RoomCategory> roomCategory = roomCategoryRepository.findById(roomCategoryId);
		if (!roomCategory.isPresent()) {
			throw new ResourceNotFoundException();
		}
		return roomCategory.get();
	}

}
