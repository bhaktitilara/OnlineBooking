package com.miage.OnlineBooking.service;

import java.time.LocalDate;
import java.util.List;

import com.miage.OnlineBooking.domain.Room;
/**
 *
 * @author bhakti
 */
public interface RoomService {
	
	Room getRoomById(Long roomId);
	
	List<Room> getFreeRoomsByDates(LocalDate startDate, LocalDate endDate);
	
	List<Room> getByRoomCategory(Long roomCategoryId);

}
