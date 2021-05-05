package com.miage.OnlineBooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miage.OnlineBooking.domain.RoomCategory;
/**
 *
 * @author bhakti
 */
public interface RoomCategoryRepo extends JpaRepository<RoomCategory, Long> {

}
