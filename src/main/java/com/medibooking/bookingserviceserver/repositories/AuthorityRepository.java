package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
