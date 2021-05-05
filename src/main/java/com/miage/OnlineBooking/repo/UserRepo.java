package com.miage.OnlineBooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miage.OnlineBooking.domain.User;
/**
 *
 * @author bhakti
 */
public interface UserRepo extends JpaRepository<User, Long> {

}
