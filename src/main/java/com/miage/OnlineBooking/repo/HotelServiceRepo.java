package com.miage.OnlineBooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miage.OnlineBooking.domain.HotelService;
/**
 *
 * @author bhakti
 */
public interface HotelServiceRepo  extends JpaRepository<HotelService, Long> {

}
